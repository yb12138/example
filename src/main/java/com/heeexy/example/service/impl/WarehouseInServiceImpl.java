package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.*;
import com.heeexy.example.model.*;
import com.heeexy.example.service.ProductStorageService;
import com.heeexy.example.service.WarehouseInService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.GetOrredingIdUUID;
import com.heeexy.example.util.constants.ErrorEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;

@Service
public class WarehouseInServiceImpl implements WarehouseInService {
    @Autowired
    WarehouseInWarrantMapper warehouseInWarrantMapper;
    @Autowired
    WarehouseInWarrantSkuMapper warehouseInWarrantSkuMapper;
    @Autowired
    PurchaseMapper purchaseMapper;
    @Autowired
    PurchaseSkuMapper purchaseSkuMapper;
    @Autowired
    ProductMapper productMapper;
    @Autowired
    WarehouseMapper warehouseMapper;
    @Autowired
    ProductStorageService productStorageService;
    @Autowired
    SysUserMapper sysUserMapper;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject save(WarehouseInWarrant warehouseInWarrant, List<WarehouseInWarrantSku> skus) {
        warehouseInWarrant.setPurchasenum(null);
        warehouseInWarrant.setInnum(null);
        warehouseInWarrant.setPurchaseid(null);
        warehouseInWarrant.setCreatetime(null);
        warehouseInWarrantMapper.updateByPrimaryKeySelective(warehouseInWarrant);
        for (WarehouseInWarrantSku warehouseInWarrantSku : skus) {
            warehouseInWarrantSku.setInnum(null);
            warehouseInWarrantSku.setInid(null);
            warehouseInWarrantSkuMapper.updateByPrimaryKeySelective(warehouseInWarrantSku);
        }
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject submit(Integer inID, String username, Integer userid) {
        WarehouseInWarrant warehouseInWarrant = warehouseInWarrantMapper.selectByPrimaryKey(inID);
        warehouseInWarrant.setStatus(2);
        warehouseInWarrantMapper.updateByPrimaryKeySelective(warehouseInWarrant);
        return CommonUtil.successJson();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject verify(Integer inID, String username, Integer userid) {
        WarehouseInWarrant warehouseInWarrant = warehouseInWarrantMapper.selectByPrimaryKey(inID);
        warehouseInWarrant.setStatus(3);
        warehouseInWarrantMapper.updateByPrimaryKeySelective(warehouseInWarrant);
        WarehouseInWarrantSkuExample example = new WarehouseInWarrantSkuExample();
        example.createCriteria().andInidEqualTo(inID);
        String type = warehouseInWarrant.getType();
        List<WarehouseInWarrantSku> skus = warehouseInWarrantSkuMapper.selectByExample(example);
        Integer purchaseID = warehouseInWarrant.getPurchaseid();
        for (WarehouseInWarrantSku warehouseInWarrantSku : skus) {
            if (warehouseInWarrantSku.getIncount() == 0) {
                warehouseInWarrantSku.setStatus((byte) 3);
                warehouseInWarrantSkuMapper.updateByPrimaryKeySelective(warehouseInWarrantSku);
            }
            Integer productID = warehouseInWarrantSku.getProductid();
            Boolean success;
            Integer inCount = warehouseInWarrantSku.getIncount();
            if (type.equals("采购入库")) {
                success = productStorageService.add(productID, inCount, 2, true);
            } else {
                success = productStorageService.add(productID, inCount, 2, false);
            }
            if (!success) {
                throw new RuntimeException("库存数目异常，审核失败");
            }
        }
        if (type.equals("采购入库")) {
            Purchase purchase = purchaseMapper.selectByPrimaryKey(purchaseID);
            PurchaseSkuExample skuExample = new PurchaseSkuExample();
            skuExample.createCriteria().andPurchaseidEqualTo(purchaseID);
            List<PurchaseSku> purchaseSkus = purchaseSkuMapper.selectByExample(skuExample);
            Boolean flag = true;
            for (PurchaseSku sku : purchaseSkus) {
                Integer productID = sku.getProductid();
                Integer stock = sku.getStockinquantity();
                Integer deft = sku.getDefectivequantity();
                Integer purchasequantity = sku.getPurchasequantity();
                for (WarehouseInWarrantSku warehouseInWarrantSku : skus) {
                    Integer pID = warehouseInWarrantSku.getProductid();
                    if (pID.equals(productID)) {
                        Integer inCount = warehouseInWarrantSku.getIncount();
                        if (inCount < purchasequantity - stock - deft) {
                            flag = false;
                            int temp = stock + inCount;
                            sku.setStockinquantity(temp);
                            sku.setStockinamount(BigDecimal.valueOf(temp * sku.getUnitprice().doubleValue()));
                        } else if (inCount == purchasequantity - stock - deft) {
                            sku.setStockinquantity(purchasequantity);
                            sku.setStockinamount(sku.getPurchaseamount());
                        } else {
                            throw new RuntimeException("入库数量大于采购数量");
                        }
                        purchaseSkuMapper.updateByPrimaryKeySelective(sku);
                    }
                }
            }
            List<PurchaseSku> purchaseSkus2 = purchaseSkuMapper.selectByExample(skuExample);
            Integer allAccount = 0;
            Double allAmount = 0.0;
            for (PurchaseSku sku : purchaseSkus2) {
                Integer stock = sku.getStockinquantity();
                allAccount += stock;
                allAmount += sku.getStockinamount().doubleValue();
            }
            purchase.setStockintotalquantity(allAccount);
            purchase.setStockintotalamount(new BigDecimal(allAmount));
            if (flag) {
                purchase.setCnwarehouseinstatus((byte) 3);
            } else {
                purchase.setCnwarehouseinstatus((byte) 2);
            }
            purchaseMapper.updateByPrimaryKeySelective(purchase);
        }
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject reject(Integer inID, String username, Integer userid) {
        WarehouseInWarrant warehouseInWarrant = warehouseInWarrantMapper.selectByPrimaryKey(inID);
        warehouseInWarrant.setStatus(1);
        warehouseInWarrantMapper.updateByPrimaryKeySelective(warehouseInWarrant);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject delete(Integer inID) {
        WarehouseInWarrant warehouseInWarrant = warehouseInWarrantMapper.selectByPrimaryKey(inID);
        if (warehouseInWarrant.getStatus() < 3) {
            warehouseInWarrantMapper.deleteByPrimaryKey(inID);
            WarehouseInWarrantSkuExample skuExample = new WarehouseInWarrantSkuExample();
            skuExample.createCriteria().andInidEqualTo(warehouseInWarrant.getInid());
            warehouseInWarrantSkuMapper.deleteByExample(skuExample);
        } else {
            return CommonUtil.errorJson(ErrorEnum.E_100002);
        }
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject listWarehouseIn(Integer pageSize, Integer pageNum, String purchaseNum, String inNum, String startday, String endday, Integer status, Long warehouseID, Long userID, String headwayType) {
        int start = 0;
        if (pageNum != 0) {
            start = (pageNum - 1) * pageSize;
        }
        List<JSONObject> maps = warehouseInWarrantMapper.queryWarehouseInWarrantList(start, pageSize, purchaseNum, inNum, startday, endday, status, warehouseID, userID, headwayType);
        Integer count = warehouseInWarrantMapper.queryWarehouseCount(purchaseNum, inNum, startday, endday, status, warehouseID, userID, headwayType);
        for (JSONObject object : maps) {
            Integer inID = object.getIntValue("inID");
            WarehouseInWarrant warehouseInWarrant = warehouseInWarrantMapper.selectByPrimaryKey(inID);
            Integer userId = warehouseInWarrant.getUserid();
            SysUser sysUser = sysUserMapper.selectByPrimaryKey(userId);
            String nickname = sysUser.getNickname();
            object.put("nickname", nickname);
            List<JSONObject> skus = warehouseInWarrantSkuMapper.getSkus(inID);
            for (JSONObject sku : skus) {
                Integer productid = sku.getInteger("productID");
                Product product = productMapper.selectByPrimaryKey(productid);
                String cnName = product.getCnname();
                String imgurl = product.getImgurl();
                sku.put("imgurl", imgurl);
                sku.put("cnName", cnName);
            }
            object.put("sku", skus);
        }
        JSONObject requestjson = new JSONObject();
        requestjson.put("pageRow", pageNum);
        return CommonUtil.successPage(requestjson, maps, count);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject add(WarehouseInWarrant warehouseInWarrant, Integer userid, String username) {
        String type = warehouseInWarrant.getType();
        Date date = new Date();
        String headwayType = null;
        if (type.equals("采购入库")) {
            String purchaseNum = warehouseInWarrant.getPurchasenum();
            PurchaseExample purchaseExample = new PurchaseExample();
            purchaseExample.createCriteria().andPurchasenumEqualTo(purchaseNum);
            List<Purchase> purchases = purchaseMapper.selectByExample(purchaseExample);
            if (purchases == null || purchases.size() == 0) {
                return CommonUtil.errorJson(ErrorEnum.E_100001);
            } else if (purchases.size() > 1) {
                return CommonUtil.errorJson(ErrorEnum.E_100001);
            }
            Purchase purchase = purchases.get(0);
            Integer purchaseID = purchase.getPurchaseid();
            if (purchase.getFinancestatus() <= 2 || purchase.getFinancestatus() >= 6) {
                return CommonUtil.errorJson(ErrorEnum.E_100003);
            }
            if (purchase.getCnwarehouseinstatus() == 3) {
                return CommonUtil.errorJson(ErrorEnum.E_100004);
            }
            PurchaseSkuExample skuExample = new PurchaseSkuExample();
            skuExample.createCriteria().andPurchaseidEqualTo(purchase.getPurchaseid());
            List<PurchaseSku> skus = purchaseSkuMapper.selectByExample(skuExample);
            String inNum = GetOrredingIdUUID.getWarehouseInOrder();
            warehouseInWarrant.setStatus(1);
            warehouseInWarrant.setCreatetime(date);
            warehouseInWarrant.setInnum(inNum);
            warehouseInWarrant.setPurchasenum(purchase.getPurchasenum());
            warehouseInWarrant.setUserid(userid);
            warehouseInWarrant.setUsername(username);
            warehouseInWarrant.setPurchaseid(purchaseID);
            warehouseInWarrant.setWarehouseid(Math.toIntExact(purchase.getWarehouseid()));
            warehouseInWarrant.setWarehousename(purchase.getWarehousename());
            warehouseInWarrantMapper.insertSelective(warehouseInWarrant);
            Integer inid = warehouseInWarrant.getInid();
            for (PurchaseSku sku : skus) {
                if (headwayType == null) {
                    Product product = productMapper.selectByPrimaryKey(sku.getProductid());
                    headwayType = product.getHeadwaytype();
                    warehouseInWarrant.setHeadwaytype(headwayType);
                    warehouseInWarrantMapper.updateByPrimaryKeySelective(warehouseInWarrant);
                }
                Integer purchasequantity = sku.getPurchasequantity();
                Integer stockquantity = sku.getStockinquantity();
                Integer typequantity = purchasequantity - stockquantity;
                WarehouseInWarrantSku warehouseInWarrantSku = new WarehouseInWarrantSku();
                warehouseInWarrantSku.setCreatetime(date);
                warehouseInWarrantSku.setInid(inid);
                warehouseInWarrantSku.setFare(BigDecimal.valueOf(0.0));
                warehouseInWarrantSku.setIncount(typequantity);
                warehouseInWarrantSku.setInnum(inNum);
                warehouseInWarrantSku.setTypecount(typequantity);
                warehouseInWarrantSku.setProductid(sku.getProductid());
                warehouseInWarrantSku.setSkucode(sku.getSku());
                warehouseInWarrantSku.setUnitprice(BigDecimal.valueOf(0.0));
                warehouseInWarrantSku.setPurchaseskuid(sku.getId());
                warehouseInWarrantSkuMapper.insertSelective(warehouseInWarrantSku);
            }
        } else {
            warehouseInWarrant.setStatus(1);
            warehouseInWarrant.setCreatetime(date);
            String inNum = GetOrredingIdUUID.getWarehouseInOrder();
            warehouseInWarrant.setInnum(inNum);
            warehouseInWarrant.setUserid(userid);
            warehouseInWarrant.setUsername(username);
            Warehouse warehouse = warehouseMapper.selectByPrimaryKey(Long.valueOf(warehouseInWarrant.getWarehouseid()));
            warehouseInWarrant.setWarehousename(warehouse.getWarehousename());
            warehouseInWarrantMapper.insertSelective(warehouseInWarrant);
            Integer inid = warehouseInWarrant.getInid();
            List<WarehouseInWarrantSku> skus = warehouseInWarrant.getSkus();
            for (WarehouseInWarrantSku warehouseInWarrantSku : skus) {
                if (headwayType == null) {
                    Product product = productMapper.selectByPrimaryKey(warehouseInWarrantSku.getProductid());
                    headwayType = product.getHeadwaytype();
                    warehouseInWarrant.setHeadwaytype(headwayType);
                    warehouseInWarrantMapper.updateByPrimaryKeySelective(warehouseInWarrant);
                }
                warehouseInWarrantSku.setCreatetime(date);
                warehouseInWarrantSku.setInid(inid);
                warehouseInWarrantSku.setInnum(inNum);
                warehouseInWarrantSku.setTypecount(warehouseInWarrantSku.getIncount());
                warehouseInWarrantSkuMapper.insertSelective(warehouseInWarrantSku);
            }
        }
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject searchAllInByProduct(List<Product> productlist) {
        List<JSONObject> result = new ArrayList<>();
        for (Product product : productlist) {
            JSONObject temp = new JSONObject();
            Integer pid = product.getProductid();
            temp.put("skuCode", product.getSkucode());
            temp.put("productID", pid);
            temp.put("cnName", product.getCnname());
            temp.put("imgurl", product.getImgurl());
            WarehouseInWarrantSkuExample example = new WarehouseInWarrantSkuExample();
            example.createCriteria().andProductidEqualTo(pid).andStatusLessThan((byte) 3);
            List<WarehouseInWarrantSku> skus = warehouseInWarrantSkuMapper.selectByExample(example);
            List<WarehouseInWarrantSku> inlist = new ArrayList<>();
            for (WarehouseInWarrantSku sku : skus) {
                Integer inid = sku.getInid();
                sku.setUseCount(0);
                WarehouseInWarrant warehouseInWarrant = warehouseInWarrantMapper.selectByPrimaryKey(inid);
                if (warehouseInWarrant.getStatus() == 3) {
                    inlist.add(sku);
                }
            }
            temp.put("inList", inlist);
            result.add(temp);
        }
        return CommonUtil.successPage(result);
    }

    @Override
    public Boolean updateWarehouseInSkuUse(Integer inSkuID, Integer useCount) {
        WarehouseInWarrantSku warehouseInWarrantSku = warehouseInWarrantSkuMapper.selectByPrimaryKey(inSkuID);
        Integer oldcount = warehouseInWarrantSku.getOutcount();
        Integer inCount = warehouseInWarrantSku.getIncount();
        Integer newCount = oldcount + useCount;
        if (newCount.equals(inCount)) {
            warehouseInWarrantSku.setStatus((byte) 3);
            warehouseInWarrantSku.setOutcount(inCount);
        } else if (newCount < inCount) {
            warehouseInWarrantSku.setStatus((byte) 2);
            warehouseInWarrantSku.setOutcount(newCount);
        } else {
            return false;
        }
        warehouseInWarrantSkuMapper.updateByPrimaryKeySelective(warehouseInWarrantSku);
        checkWarehouseInOut(warehouseInWarrantSku.getInid());
        return true;
    }

    @Override
    public JSONObject listAllInProduct() {
        List<Integer> products = warehouseInWarrantSkuMapper.listAllInProduct();
        if (products != null && products.size() > 0) {
            ProductExample example = new ProductExample();
            example.createCriteria().andProductidIn(products);
            List<Product> productsList = productMapper.selectByExample(example);
            Map<String, Object> map = new HashMap<>();
            map.put("list", productsList);
            return CommonUtil.successJson(map);
        } else {
            Map<String, Object> map = new HashMap<>();
            map.put("list", null);
            return CommonUtil.successJson(map);
        }
    }

    @Override
    public List<WarehouseInWarrantSku> getSkuByID(Integer productID) {
        WarehouseInWarrantSkuExample example = new WarehouseInWarrantSkuExample();
        example.createCriteria().andProductidEqualTo(productID);
        return warehouseInWarrantSkuMapper.selectByExample(example);
    }

    @Override
    public void add(WarehouseInWarrant warehouseInWarrant, Integer userid, String username, Date date) {
        String purchaseNum = warehouseInWarrant.getPurchasenum();
        PurchaseExample purchaseExample = new PurchaseExample();
        purchaseExample.createCriteria().andPurchasenumEqualTo(purchaseNum);
        List<Purchase> purchases = purchaseMapper.selectByExample(purchaseExample);
        Purchase purchase = purchases.get(0);
        Integer purchaseID = purchase.getPurchaseid();
        PurchaseSkuExample skuExample = new PurchaseSkuExample();
        skuExample.createCriteria().andPurchaseidEqualTo(purchase.getPurchaseid());
        List<PurchaseSku> skus = purchaseSkuMapper.selectByExample(skuExample);
        String inNum = GetOrredingIdUUID.getWarehouseInOrder();
        warehouseInWarrant.setStatus(3);
        warehouseInWarrant.setCreatetime(date);
        warehouseInWarrant.setInnum(inNum);
        warehouseInWarrant.setPurchasenum(purchase.getPurchasenum());
        warehouseInWarrant.setUserid(userid);
        warehouseInWarrant.setUsername(username);
        warehouseInWarrant.setPurchaseid(purchaseID);
        warehouseInWarrant.setWarehouseid(Math.toIntExact(purchase.getWarehouseid()));
        warehouseInWarrant.setWarehousename(purchase.getWarehousename());
        warehouseInWarrantMapper.insertSelective(warehouseInWarrant);
        Integer inid = warehouseInWarrant.getInid();
        Double fare = purchase.getFreighttotalamount().doubleValue();
        Integer allcount = purchase.getPurchasetotalquantity();
        double averagefare = fare / allcount;
        for (PurchaseSku sku : skus) {
            Integer purchasequantity = sku.getPurchasequantity();
            WarehouseInWarrantSku warehouseInWarrantSku = new WarehouseInWarrantSku();
            warehouseInWarrantSku.setCreatetime(date);
            warehouseInWarrantSku.setInid(inid);
            warehouseInWarrantSku.setFare(BigDecimal.valueOf(0.0));
            warehouseInWarrantSku.setIncount(purchasequantity);
            warehouseInWarrantSku.setInnum(inNum);
            warehouseInWarrantSku.setTypecount(purchasequantity);
            warehouseInWarrantSku.setProductid(sku.getProductid());
            warehouseInWarrantSku.setSkucode(sku.getSku());
            warehouseInWarrantSku.setUnitprice(sku.getUnitprice());
            warehouseInWarrantSku.setFare(BigDecimal.valueOf(averagefare));
            warehouseInWarrantSku.setPurchaseskuid(sku.getId());
            warehouseInWarrantSkuMapper.insertSelective(warehouseInWarrantSku);
        }
    }

    @Override
    public List<WarehouseInWarrant> excel(String purchaseNum, String inNum, String startday, String endday, Integer status, Long warehouseID, Long userID, String headwayType) {
        List<WarehouseInWarrant> warehouseInWarrants=warehouseInWarrantMapper.excelWarehouseInWarrantList(purchaseNum, inNum, startday, endday, status, warehouseID, userID, headwayType);
        for (WarehouseInWarrant warehouseInWarrant:warehouseInWarrants){
            Integer inID=warehouseInWarrant.getInid();
            WarehouseInWarrantSkuExample skuExample=new WarehouseInWarrantSkuExample();
            skuExample.createCriteria().andInidEqualTo(inID);
            List<WarehouseInWarrantSku> warehouseInWarrantSkus=warehouseInWarrantSkuMapper.selectByExample(skuExample);
            warehouseInWarrant.setSkus(warehouseInWarrantSkus);
        }
        return warehouseInWarrants;
    }

    private void checkWarehouseInOut(int inID) {
        WarehouseInWarrant warehouseInWarrant = warehouseInWarrantMapper.selectByPrimaryKey(inID);
        WarehouseInWarrantSkuExample example = new WarehouseInWarrantSkuExample();
        example.createCriteria().andInidEqualTo(inID);
        List<WarehouseInWarrantSku> warehouseInWarrantSkus = warehouseInWarrantSkuMapper.selectByExample(example);
        boolean flag = true;
        for (WarehouseInWarrantSku warehouseInWarrantSku : warehouseInWarrantSkus) {
            Byte status = warehouseInWarrantSku.getStatus();
            if (status != 3) {
                flag = false;
                break;
            }
        }
        if (flag) {
            //该入库单已全部出库
            warehouseInWarrant.setStatus(4);
            warehouseInWarrantMapper.updateByPrimaryKeySelective(warehouseInWarrant);
        }


    }
}
