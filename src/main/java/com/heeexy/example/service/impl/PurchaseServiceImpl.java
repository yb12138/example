package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.*;
import com.heeexy.example.model.*;
import com.heeexy.example.service.FinanceService;
import com.heeexy.example.service.ProductStorageService;
import com.heeexy.example.service.PurchaseService;
import com.heeexy.example.service.WarnInfoService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.GetOrredingIdUUID;
import com.heeexy.example.util.constants.ErrorEnum;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    PurchaseMapper purchaseMapper;
    @Autowired
    PurchaseSkuMapper purchaseSkuMapper;
    @Autowired
    WarehouseMapper warehouseMapper;
    @Autowired
    PurchaseSupplierMapper supplierMapper;
    @Autowired
    ProductMapper productMapper;
    @Autowired
    FinanceService financeService;
    @Autowired
    ProductStorageService productStorageService;
    @Autowired
    WarnInfoService warnInfoService;
    @Autowired
    PurchaseTrackingMapper purchaseTrackingMapper;


    @Override
    public JSONObject listPurchase(Integer pageSize, Integer pageNum, String purchaseNum, String sku, String startday, String endday, String cnName, Long warehouseid, Integer purchaseStatus, Integer warehouseStatus, Integer financeStatus, Integer cnWarehouseInStatus, Integer cnWarehouseOutStatus) {
        int start = 0;
        if (pageNum != 0) {
            start = (pageNum - 1) * pageSize;
        }
        Integer flag = null;
        if (cnWarehouseInStatus != null || cnWarehouseOutStatus != null) {
            financeStatus = null;
            flag = 1;
        }
        Integer specialStatus = 0;
        if (cnWarehouseInStatus != null && cnWarehouseInStatus == 4) {
            cnWarehouseInStatus = 3;
            specialStatus = 1;
        }
        List<JSONObject> maps = purchaseMapper.queryPurchase(start, pageSize, warehouseid, sku, purchaseNum, purchaseStatus, financeStatus, warehouseStatus, cnWarehouseInStatus, cnWarehouseOutStatus, startday, endday, flag, specialStatus);
        for (JSONObject object : maps) {
            Integer purchaseid = object.getIntValue("purchaseID");
            Integer supplierid = object.getIntValue("supplierID");
            PurchaseSupplier supplier = supplierMapper.selectByPrimaryKey(supplierid);
            object.put("linkurl", supplier.getLinkurl());
            PurchaseSkuExample skuExample = new PurchaseSkuExample();
            skuExample.createCriteria().andPurchaseidEqualTo(purchaseid);
            List<PurchaseSku> skus = purchaseSkuMapper.selectByExample(skuExample);
            for (PurchaseSku sku1 : skus) {
                Integer productId = sku1.getProductid();
                Product product = productMapper.selectByPrimaryKey(productId);
                sku1.setImgurl(product.getImgurl());
                sku1.setSupplierlink1(product.getSupplierlink1());
            }
            object.put("sku", skus);
            if (cnWarehouseInStatus != null) {
                if (cnWarehouseInStatus >= 1 && cnWarehouseInStatus < 3) {
                    PurchaseTrackingExample trackingExample = new PurchaseTrackingExample();
                    trackingExample.createCriteria().andPurchaseidEqualTo(purchaseid);
                    List<PurchaseTracking> trackings = purchaseTrackingMapper.selectByExample(trackingExample);
                    if (trackings != null && trackings.size() > 0) {
                        PurchaseTracking purchaseTracking = trackings.get(0);
                        String tracks = purchaseTracking.getLogics();
                        JSONArray array = JSON.parseArray(tracks);
                        object.put("logics", array);
                    }
                }
            }
        }
        Integer count = purchaseMapper.getCount(warehouseid, sku, purchaseNum, purchaseStatus, financeStatus, warehouseStatus, cnWarehouseInStatus, cnWarehouseOutStatus, startday, endday, flag, specialStatus);
        JSONObject requestjson = new JSONObject();
        requestjson.put("pageRow", pageNum);
        return CommonUtil.successPage(requestjson, maps, count);
    }

    @Override
    public JSONObject purchaseDetail(Integer purchaseid) {
        Purchase purchase = purchaseMapper.selectByPrimaryKey(purchaseid);
        PurchaseSkuExample skuExample = new PurchaseSkuExample();
        skuExample.createCriteria().andPurchaseidEqualTo(purchaseid);
        List<PurchaseSku> skuList = purchaseSkuMapper.selectByExample(skuExample);
        JSONObject result = CommonUtil.successJson();
        JSONObject info = new JSONObject();
        info.put("purchase", purchase);
        info.put("skus", skuList);
        result.put("info", info);
        return result;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject addPurchase(Integer supplierid, Long warehouseID, String supplierOrderNumber, String transactionNumber, Integer purchaseTotalQuantity, Double purchaseTotalAmount, Double freightTotalAmount, String remark, List<Map<String, Object>> skus, Integer userid, String userName) {
        Purchase purchase = new Purchase();
        Date date = new Date();
        purchase.setSupplierid(supplierid);
        purchase.setCreateid(userid);
        purchase.setCreatename(userName);
        purchase.setWarehouseid(warehouseID);
        purchase.setSupplierordernumber(supplierOrderNumber);
        purchase.setTransactionnumber(transactionNumber);
        purchase.setPurchasetotalquantity(purchaseTotalQuantity);
        purchase.setRemark(remark);
        purchase.setCreatetime(date);
        String purchaseNum = GetOrredingIdUUID.getOrderIdByUUId();
        purchase.setPurchasenum(purchaseNum);
        purchase.setPurchasetotalamount(new BigDecimal(purchaseTotalAmount));
        purchase.setPurchasestatus((byte) 1);
        purchase.setFreighttotalamount(new BigDecimal(freightTotalAmount));
        Warehouse warehouse = warehouseMapper.selectByPrimaryKey(warehouseID);
        purchase.setWarehousename(warehouse.getWarehousename());
        PurchaseSupplier supplier = supplierMapper.selectByPrimaryKey(supplierid);
        purchase.setSuppliername(supplier.getSuppliername());
        purchase.setUpdateid(userid);
        purchase.setUpdatename(userName);
        purchase.setUpdatetime(date);
        purchaseMapper.insertSelective(purchase);
        int purchaseid = purchase.getPurchaseid();
        for (Map<String, Object> map : skus) {
            Integer productid = (Integer) map.get("productid");
            Product product = productMapper.selectByPrimaryKey(productid);
            String cnName = (String) map.get("cnname");
            String sku = (String) map.get("sku");
            Integer purchaseQuantity = Integer.valueOf(map.get("purchasequantity").toString());
            Double unitPrice = Double.valueOf(map.get("unitprice").toString());
            double purchaseAmount = purchaseQuantity * unitPrice;
            PurchaseSku purchaseSku = new PurchaseSku();
            purchaseSku.setProductid(productid);
            purchaseSku.setPurchasequantity(purchaseQuantity);
            purchaseSku.setSku(sku);
            purchaseSku.setCreatetime(date);
            purchaseSku.setRemake(product.getRemark());
            purchaseSku.setUnitprice(BigDecimal.valueOf(unitPrice));
            purchaseSku.setPurchaseamount(BigDecimal.valueOf(purchaseAmount));
            purchaseSku.setAppendquantity(purchaseQuantity);
            purchaseSku.setCnname(cnName);
            purchaseSku.setCreateid(userid);
            purchaseSku.setCreatename(userName);
            purchaseSku.setUpdateid(userid);
            purchaseSku.setUpdatename(userName);
            purchaseSku.setUpdatetime(date);
            purchaseSku.setDefectiveamount(BigDecimal.valueOf(0.0));
            purchaseSku.setDefectivequantity(0);
            purchaseSku.setWarehouseid(warehouseID);
            purchaseSku.setPurchaseid(purchaseid);
            purchaseSku.setRemake(product.getRemark());
            purchaseSkuMapper.insertSelective(purchaseSku);
        }
        return CommonUtil.successJson();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject updatePurchase(Integer supplierid, Long warehouseID, String supplierOrderNumber, String transactionNumber, Double freightTotalAmount, String remark, List<Map<String, Object>> skus, Integer userid, String userName, Integer purchaseid) {
        Purchase purchase = purchaseMapper.selectByPrimaryKey(purchaseid);
        if (purchase == null) {
            return CommonUtil.errorJson(ErrorEnum.E_100001);
        }
        Double purchaseTotalAmount = 0.0;
        Integer purchaseTotalQuantity = 0;
        Date date = new Date();
        for (Map<String, Object> map : skus) {
            Integer productid = (Integer) map.get("productid");
            String cnName = (String) map.get("cnname");
            String sku = (String) map.get("sku");
            String remake = (String) map.get("remake");
            Integer purchaseQuantity = Integer.valueOf(map.get("purchasequantity").toString());
            Double unitPrice = Double.valueOf(map.get("unitprice").toString());
            double purchaseAmount = purchaseQuantity * unitPrice;
            purchaseTotalAmount += purchaseAmount;
            purchaseTotalQuantity += purchaseQuantity;
            PurchaseSkuExample purchaseSkuExample = new PurchaseSkuExample();
            purchaseSkuExample.createCriteria().andPurchaseidEqualTo(purchaseid).andProductidEqualTo(productid);
            List<PurchaseSku> skuList = purchaseSkuMapper.selectByExample(purchaseSkuExample);
            if (skuList != null && skuList.size() == 1) {
                PurchaseSku purchaseSku = skuList.get(0);
                purchaseSku.setPurchasequantity(purchaseQuantity);
                purchaseSku.setRemake(remark);
                purchaseSku.setUnitprice(BigDecimal.valueOf(unitPrice));
                purchaseSku.setPurchaseamount(BigDecimal.valueOf(purchaseAmount));
                purchaseSku.setAppendquantity(purchaseQuantity);
                purchaseSku.setCnname(cnName);
                purchaseSku.setUpdateid(userid);
                purchaseSku.setUpdatename(userName);
                purchaseSku.setUpdatetime(date);
                purchaseSku.setWarehouseid(warehouseID);
                purchaseSku.setPurchaseid(purchaseid);
                purchaseSku.setRemake(remake);
                purchaseSkuMapper.updateByPrimaryKeySelective(purchaseSku);
            } else if (skuList == null || skuList.size() == 0) {
                PurchaseSku purchaseSku = new PurchaseSku();
                purchaseSku.setProductid(productid);
                purchaseSku.setPurchasequantity(purchaseQuantity);
                purchaseSku.setSku(sku);
                purchaseSku.setCreatetime(date);
                purchaseSku.setRemake(remark);
                purchaseSku.setUnitprice(BigDecimal.valueOf(unitPrice));
                purchaseSku.setPurchaseamount(BigDecimal.valueOf(purchaseAmount));
                purchaseSku.setAppendquantity(purchaseQuantity);
                purchaseSku.setCnname(cnName);
                purchaseSku.setCreateid(userid);
                purchaseSku.setCreatename(userName);
                purchaseSku.setUpdateid(userid);
                purchaseSku.setUpdatename(userName);
                purchaseSku.setUpdatetime(date);
                purchaseSku.setDefectiveamount(BigDecimal.valueOf(0.0));
                purchaseSku.setDefectivequantity(0);
                purchaseSku.setWarehouseid(warehouseID);
                purchaseSku.setPurchaseid(purchaseid);
                purchaseSku.setRemake(remake);
                purchaseSkuMapper.insertSelective(purchaseSku);
            } else {
                throw new RuntimeException("采购单对应sku异常");
            }
        }
        purchase.setSupplierid(supplierid);
        purchase.setCreateid(userid);
        purchase.setCreatename(userName);
        purchase.setWarehouseid(warehouseID);
        purchase.setSupplierordernumber(supplierOrderNumber);
        purchase.setTransactionnumber(transactionNumber);
        purchase.setPurchasetotalquantity(purchaseTotalQuantity);
        purchase.setRemark(remark);
        purchase.setCreatetime(date);
        String purchaseNum = GetOrredingIdUUID.getOrderIdByUUId();
        purchase.setPurchasenum(purchaseNum);
        purchase.setPurchasetotalamount(new BigDecimal(purchaseTotalAmount));
        purchase.setFreighttotalamount(new BigDecimal(freightTotalAmount));
        Warehouse warehouse = warehouseMapper.selectByPrimaryKey(warehouseID);
        purchase.setWarehousename(warehouse.getWarehousename());
        PurchaseSupplier supplier = supplierMapper.selectByPrimaryKey(supplierid);
        purchase.setSuppliername(supplier.getSuppliername());
        purchase.setUpdateid(userid);
        purchase.setUpdatename(userName);
        purchase.setUpdatetime(date);
        purchaseMapper.updateByPrimaryKeySelective(purchase);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject submit(Integer purchaseid) {
        Purchase purchase = purchaseMapper.selectByPrimaryKey(purchaseid);
        purchase.setPurchasestatus((byte) 2);
        purchaseMapper.updateByPrimaryKeySelective(purchase);
        return CommonUtil.successJson();
    }

    /*采购审核通过，同时更新库存数目，提交财务审核*/
    @Override
    public JSONObject verify(Integer purchaseid, String username, Integer userid) {
        Purchase purchase = purchaseMapper.selectByPrimaryKey(purchaseid);
        purchase.setPurchasestatus((byte) 3);
        purchase.setFinancestatus((byte) 1);
        purchaseMapper.updateByPrimaryKeySelective(purchase);
        //创建or更新财务单
        financeService.createFinance(purchase, username, userid, "全款");
        //更新库存数目
        PurchaseSkuExample skuExample = new PurchaseSkuExample();
        skuExample.createCriteria().andPurchaseidEqualTo(purchaseid);
        List<PurchaseSku> purchaseSkus = purchaseSkuMapper.selectByExample(skuExample);
        for (PurchaseSku sku : purchaseSkus) {
            Integer productID = sku.getProductid();
            Boolean success = productStorageService.add(productID, sku.getPurchasequantity(), 1, true);
            if (!success) {
                throw new RuntimeException("库存数目异常，审核失败");
            }
        }
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject reject(Integer purchaseid) {
        Purchase purchase = purchaseMapper.selectByPrimaryKey(purchaseid);
        purchase.setPurchasestatus((byte) 1);
        purchaseMapper.updateByPrimaryKeySelective(purchase);
        return CommonUtil.successJson();
    }

    /*删除采购单，更新预警信息*/
    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject delete(Integer purchaseid) {
        purchaseMapper.deleteByPrimaryKey(purchaseid);
        PurchaseSkuExample purchaseSkuExample = new PurchaseSkuExample();
        purchaseSkuExample.createCriteria().andPurchaseidEqualTo(purchaseid);
        List<PurchaseSku> purchaseSkus = purchaseSkuMapper.selectByExample(purchaseSkuExample);
        Date now = new Date();
        for (PurchaseSku purchaseSku : purchaseSkus) {
            Date createTime = purchaseSku.getCreatetime();
            int days = (int) ((now.getTime() - createTime.getTime()) / (1000 * 3600 * 24));
            if (days <= 5) {
                Integer productID = purchaseSku.getProductid();
                Warninfo warninfo = new Warninfo();
                warninfo.setProductid(productID);
                warninfo.setStatus((byte) 1);
                warnInfoService.updateWarn(warninfo);
            }
        }
        purchaseSkuMapper.deleteByExample(purchaseSkuExample);
        return CommonUtil.successJson();
    }

    @Override
    public List<PurchaseSku> queryByID(Integer productID) {
        PurchaseSkuExample skuExample = new PurchaseSkuExample();
        skuExample.createCriteria().andProductidEqualTo(productID);
        return purchaseSkuMapper.selectByExample(skuExample);
    }

    @Override
    public void updatePurchase(Purchase purchase) {
        purchaseMapper.updateByPrimaryKeySelective(purchase);
    }

    @Override
    public Purchase queryDetailByID(Integer purchaseID) {
        return purchaseMapper.selectByPrimaryKey(purchaseID);
    }

    @Override
    public List<PurchaseSku> queryByPurchaseID(Integer purchaseID) {
        PurchaseSkuExample example = new PurchaseSkuExample();
        example.createCriteria().andPurchaseidEqualTo(purchaseID);
        return purchaseSkuMapper.selectByExample(example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<String> checkPurchase() {
        PurchaseExample example = new PurchaseExample();
        example.createCriteria().andCnwarehouseinstatusGreaterThan((byte) 0).andCnwarehouseinstatusLessThan((byte) 3);
        List<Purchase> purchases = purchaseMapper.selectByExample(example);
        DateTime now = new DateTime();
        List<String> results = new ArrayList<>();
        for (Purchase purchase : purchases) {
            Date createTime = purchase.getCreatetime();
            int days = Days.daysBetween(new DateTime(createTime), now).getDays();
            Integer purchaseID = purchase.getPurchaseid();
            PurchaseSkuExample purchaseSkuExample = new PurchaseSkuExample();
            purchaseSkuExample.createCriteria().andPurchaseidEqualTo(purchaseID);
            List<PurchaseSku> skus = purchaseSkuMapper.selectByExample(purchaseSkuExample);
            PurchaseSku purchaseSku = skus.get(0);
            Integer productID = purchaseSku.getProductid();
            Product product = productMapper.selectByPrimaryKey(productID);
            Integer deliverTime = product.getDeliverytime();
            if (deliverTime == null || deliverTime == 0) {
                deliverTime = 5;
            }
            if (days > deliverTime) {
                int temp = days - deliverTime;
                String title = "采购单：" + purchase.getPurchasenum() + " 采购阶段超时,下单日期" + DateToStr(purchase.getCreatetime()) + " 超期" + temp + "天";
                results.add(title);
            }
        }
        return results;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void splitPurchase(Integer purchaseID) {
        Purchase purchase=purchaseMapper.selectByPrimaryKey(purchaseID);
        if (purchase==null||purchase.getPurchasestatus()>1){//判断采购单是否存在或者是否为采购待提交状态
            return;
        }
        PurchaseSkuExample skuExample=new PurchaseSkuExample();
        skuExample.createCriteria().andPurchaseidEqualTo(purchaseID);
        List<PurchaseSku> purchaseSkus=purchaseSkuMapper.selectByExample(skuExample);
        Integer size=purchaseSkus.size();
        if (purchaseSkus.size()<=1){
            return;
        }
        for(int i=0;i<size-1;i++){
            PurchaseSku purchaseSku=purchaseSkus.get(i);
            Purchase tempPurchase=new Purchase();
            tempPurchase.setSupplierid(purchase.getSupplierid());
            tempPurchase.setCreateid(purchaseSku.getCreateid());
            tempPurchase.setCreatename(purchaseSku.getCreatename());
            tempPurchase.setWarehouseid(purchaseSku.getWarehouseid());
            tempPurchase.setSupplierordernumber(purchase.getSupplierordernumber());
            tempPurchase.setTransactionnumber(purchase.getTransactionnumber());
            tempPurchase.setPurchasetotalquantity(purchaseSku.getPurchasequantity());
            tempPurchase.setRemark(purchase.getRemark());
            tempPurchase.setCreatetime(purchase.getCreatetime());
            String purchaseNum = GetOrredingIdUUID.getOrderIdByUUId();
            tempPurchase.setPurchasenum(purchaseNum);
            tempPurchase.setPurchasetotalamount(purchaseSku.getPurchaseamount());
            tempPurchase.setPurchasestatus((byte) 1);
            tempPurchase.setFreighttotalamount(new BigDecimal(0.0));
            tempPurchase.setWarehousename(purchase.getWarehousename());
            tempPurchase.setSuppliername(purchase.getSuppliername());
            tempPurchase.setUpdateid(purchase.getUpdateid());
            tempPurchase.setUpdatename(purchase.getUpdatename());
            tempPurchase.setUpdatetime(purchase.getUpdatetime());
            purchaseMapper.insertSelective(tempPurchase);
            int purchaseid = tempPurchase.getPurchaseid();
            purchaseSku.setPurchaseid(purchaseid);
            purchaseSkuMapper.updateByPrimaryKeySelective(purchaseSku);
        }
        PurchaseSku purchaseSku=purchaseSkus.get(size-1);
        purchase.setPurchasetotalamount(purchaseSku.getPurchaseamount());
        purchase.setPurchasetotalquantity(purchaseSku.getPurchasequantity());
        purchaseMapper.updateByPrimaryKeySelective(purchase);


    }

    @Override
    public List<Purchase> listAllPurchase(String purchaseNum, String sku, String startday, String endday, String cnName, Long warehouseid, Integer purchaseStatus, Integer warehouseStatus, Integer financeStatus, Integer cnWarehouseInStatus, Integer cnWarehouseOutStatus) {
        Integer flag = null;
        if (cnWarehouseInStatus != null || cnWarehouseOutStatus != null) {
            financeStatus = null;
            flag = 1;
        }
        Integer specialStatus = 0;
        if (cnWarehouseInStatus != null && cnWarehouseInStatus == 4) {
            cnWarehouseInStatus = 3;
            specialStatus = 1;
        }
        List<Purchase> purchases = purchaseMapper.queryAllPurchase(warehouseid, sku, purchaseNum, purchaseStatus, financeStatus, warehouseStatus, cnWarehouseInStatus, cnWarehouseOutStatus, startday, endday, flag, specialStatus);
        for (Purchase purchase : purchases) {
            Integer purchaseID = purchase.getPurchaseid();
            PurchaseSkuExample example = new PurchaseSkuExample();
            example.createCriteria().andPurchaseidEqualTo(purchaseID);
            List<PurchaseSku> purchaseSkus = purchaseSkuMapper.selectByExample(example);
            purchase.setSkuList(purchaseSkus);
        }
        return purchases;
    }

    public static String DateToStr(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(date);
        return dateString;
    }

}
