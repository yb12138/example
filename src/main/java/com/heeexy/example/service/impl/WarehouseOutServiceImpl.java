package com.heeexy.example.service.impl;

import cn.afterturn.easypoi.cache.manager.IFileLoader;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.*;
import com.heeexy.example.model.*;
import com.heeexy.example.service.AlloOutService;
import com.heeexy.example.service.ProductStorageService;
import com.heeexy.example.service.WarehouseInService;
import com.heeexy.example.service.WarehouseOutService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.GetOrredingIdUUID;
import com.heeexy.example.util.GoodConnectUrl;
import com.heeexy.example.util.constants.ErrorEnum;
import com.heeexy.example.winit.http.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class WarehouseOutServiceImpl implements WarehouseOutService {
    @Autowired
    WarehouseOutWarrantMapper warehouseOutWarrantMapper;
    @Autowired
    WarehouseOutWarrantSkuMapper warehouseOutWarrantSkuMapper;
    @Autowired
    ProductMapper productMapper;
    @Autowired
    WarehouseInWarrantSkuMapper warehouseInWarrantSkuMapper;
    @Autowired
    WarehouseInWarrantMapper warehouseInWarrantMapper;
    @Autowired
    WarehouseInService warehouseInService;
    @Autowired
    ProductStorageService productStorageService;
    @Autowired
    AlloOutService alloOutService;
    @Autowired
    PurchaseSkuMapper purchaseSkuMapper;
    @Autowired
    PurchaseMapper purchaseMapper;
    @Autowired
    SysUserMapper sysUserMapper;
    @Autowired
    AlloOutMapper alloOutMapper;
    @Autowired
    AlloOutSkuMapper alloOutSkuMapper;

    @Override
    public JSONObject listWarehouseOut(Integer pageSize, Integer pageNum, String sku, String outNum, String startday, String endday, Integer status, String cnWarehouseName) {
        int start = 0;
        if (pageNum != 0) {
            start = (pageNum - 1) * pageSize;
        }
        List<JSONObject> maps = warehouseOutWarrantMapper.queryWarehouseOutWarrantList(start, pageSize, sku, outNum, startday, endday, status, cnWarehouseName);
        Integer count = warehouseOutWarrantMapper.queryWarehouseOutCount(sku, outNum, startday, endday, status, cnWarehouseName);
        for (JSONObject object : maps) {
            Integer outID = object.getIntValue("outID");
            String nickname = null;
            List<JSONObject> skus = warehouseOutWarrantSkuMapper.getSkus(outID);
            for (JSONObject jsonObject : skus) {
                Integer productid = jsonObject.getInteger("productID");
                Integer inSkuID = jsonObject.getInteger("inSkuID");
                Product product = productMapper.selectByPrimaryKey(productid);
                WarehouseInWarrantSku warehouseInWarrantSku = warehouseInWarrantSkuMapper.selectByPrimaryKey(inSkuID);
                if (nickname == null) {
                    Integer inid = warehouseInWarrantSku.getInid();
                    WarehouseInWarrant warehouseInWarrant = warehouseInWarrantMapper.selectByPrimaryKey(inid);
                    Integer userId = warehouseInWarrant.getUserid();
                    SysUser sysUser = sysUserMapper.selectByPrimaryKey(userId);
                    nickname = sysUser.getNickname();
                }
                String cnName = product.getCnname();
                String imgurl = product.getImgurl();
                jsonObject.put("imgurl", imgurl);
                jsonObject.put("cnName", cnName);
                jsonObject.put("inNum", warehouseInWarrantSku.getInnum());
            }
            object.put("nickname", nickname);
            object.put("sku", skus);
        }
        JSONObject requestjson = new JSONObject();
        requestjson.put("pageRow", pageNum);
        return CommonUtil.successPage(requestjson, maps, count);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject save(WarehouseOutWarrant warehouseOutWarrant, List<WarehouseOutWarrantSku> skus) {
        warehouseOutWarrant.setStatus(null);
        warehouseOutWarrant.setArrivestatus(null);
        warehouseOutWarrant.setCreatename(null);
        warehouseOutWarrant.setCreatetime(null);
        warehouseOutWarrant.setOutnum(null);
        warehouseOutWarrant.setType(null);
        warehouseOutWarrantMapper.updateByPrimaryKeySelective(warehouseOutWarrant);
        String code = warehouseOutWarrant.getWarehouseorder();
        if (code != null) {
            AlloOutExample alloOutExample = new AlloOutExample();
            alloOutExample.createCriteria().andOutidEqualTo(warehouseOutWarrant.getOutid());
            List<AlloOut> alloOuts = alloOutMapper.selectByExample(alloOutExample);
            if (alloOuts != null && alloOuts.size() != 0) {
                for (AlloOut alloOut : alloOuts) {
                    alloOut.setWarehouseorder(code);
                    alloOutMapper.updateByPrimaryKeySelective(alloOut);
                }
            }
        }
        for (WarehouseOutWarrantSku warehouseOutWarrantSku : skus) {
            warehouseOutWarrantSkuMapper.updateByPrimaryKeySelective(warehouseOutWarrantSku);
        }
        return CommonUtil.successJson();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject add(WarehouseOutWarrant warehouseOutWarrant, Integer userid, String username) {
        Date date = new Date();
        warehouseOutWarrant.setOutnum(GetOrredingIdUUID.getOutIdByUUId());
        warehouseOutWarrant.setCreatetime(date);
        warehouseOutWarrant.setCreatename(username);
        warehouseOutWarrant.setUserid(userid);
        warehouseOutWarrant.setArrivestatus(1);
        warehouseOutWarrant.setStatus(1);
        warehouseOutWarrantMapper.insertSelective(warehouseOutWarrant);
        Integer outID = warehouseOutWarrant.getOutid();
        List<WarehouseOutWarrantSku> skuList = warehouseOutWarrant.getSkus();
        for (WarehouseOutWarrantSku warehouseOutWarrantSku : skuList) {
            Integer productID = warehouseOutWarrantSku.getProductid();
            String skuCode = warehouseOutWarrantSku.getSkucode();
            List<JSONObject> inList = warehouseOutWarrantSku.getInList();
            for (JSONObject object : inList) {
                Integer useCount = object.getIntValue("useCount");
                Integer inSkuID = object.getIntValue("inSkuID");
                if (useCount == 0) {
                } else {
                    WarehouseOutWarrantSku sku = new WarehouseOutWarrantSku();
                    sku.setOutid(outID);
                    sku.setCreatetime(date);
                    sku.setInskuid(inSkuID);
                    sku.setOutcount(useCount);
                    sku.setProductid(productID);
                    sku.setSkucode(skuCode);
                    warehouseOutWarrantSkuMapper.insertSelective(sku);
                }
            }
        }
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject submit(Integer outID) {
        WarehouseOutWarrant warehouseOutWarrant = warehouseOutWarrantMapper.selectByPrimaryKey(outID);
        warehouseOutWarrant.setStatus(2);
        warehouseOutWarrantMapper.updateByPrimaryKeySelective(warehouseOutWarrant);
        String code=warehouseOutWarrant.getWarehouseorder();
        if (code != null) {
            AlloOutExample alloOutExample = new AlloOutExample();
            alloOutExample.createCriteria().andOutidEqualTo(warehouseOutWarrant.getOutid());
            List<AlloOut> alloOuts = alloOutMapper.selectByExample(alloOutExample);
            if (alloOuts != null && alloOuts.size() != 0) {
                for (AlloOut alloOut : alloOuts) {
                    alloOut.setWarehouseorder(code);
                    alloOutMapper.updateByPrimaryKeySelective(alloOut);
                }
            }
        }
        return CommonUtil.successJson();
    }

    /**
     * 出库单审核通过，更新产品库存数目，更新入库单数据,更新关联采购单数据
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject verify(Integer outID, Integer userid, String username) {
        WarehouseOutWarrant warehouseOutWarrant = warehouseOutWarrantMapper.selectByPrimaryKey(outID);
        if (warehouseOutWarrant.getStatus() == 3) {
            return CommonUtil.successJson();
        }
        warehouseOutWarrant.setStatus(3);
        warehouseOutWarrantMapper.updateByPrimaryKeySelective(warehouseOutWarrant);
        WarehouseOutWarrantSkuExample skuExample = new WarehouseOutWarrantSkuExample();
        skuExample.createCriteria().andOutidEqualTo(outID);
        String type = warehouseOutWarrant.getType();
        List<WarehouseOutWarrantSku> skuList = warehouseOutWarrantSkuMapper.selectByExample(skuExample);
        for (WarehouseOutWarrantSku sku : skuList) {
            if (sku.getInskuid() != null) {
                Integer usecount = sku.getOutcount();
                Boolean result = warehouseInService.updateWarehouseInSkuUse(sku.getInskuid(), usecount);
                if (!result) {
                    throw new RuntimeException("出库数量超过库存数目");
                }
                Boolean success;
                if (type.equals("调拨出库")) {
                    success = productStorageService.add(sku.getProductid(), usecount, 3, true);
                } else {
                    success = productStorageService.min(sku.getProductid(), usecount, 2, true);
                }
                if (!success) {
                    throw new RuntimeException("库存数目异常，审核失败");
                }
            }
        }
        boolean flag = true;
        Set<Integer> purchasesIDs = new HashSet<>();
        for (WarehouseOutWarrantSku sku : skuList) {
            Integer inskuid = sku.getInskuid();
            WarehouseInWarrantSku warehouseInWarrantSku = warehouseInWarrantSkuMapper.selectByPrimaryKey(inskuid);
            Integer purchaseSkuID = warehouseInWarrantSku.getPurchaseskuid();
            PurchaseSku purchaseSku = purchaseSkuMapper.selectByPrimaryKey(purchaseSkuID);
            if (purchaseSku == null) {
                continue;
            }
            purchasesIDs.add(purchaseSku.getPurchaseid());
            Integer oldCount = purchaseSku.getUsequantity();
            Integer useCount = sku.getOutcount();
            purchaseSku.setUsequantity(oldCount + useCount);
            purchaseSkuMapper.updateByPrimaryKeySelective(purchaseSku);
        }
        //更新采购单的中仓出库状态
        if (purchasesIDs.size() > 0) {
            updatePurchaseOutStatus(new ArrayList<>(purchasesIDs));
        }
        if (type.equals("调拨出库")) {
            AlloOut alloOut = new AlloOut();
            alloOut.setOutid(outID);
            alloOut.setOutnum(warehouseOutWarrant.getOutnum());
            alloOut.setWarehousename(warehouseOutWarrant.getWarehousename());
            alloOut.setWarehouseid(warehouseOutWarrant.getWarehouseid());
            alloOutService.add(alloOut, userid, username);
        }
        return CommonUtil.successJson();
    }

    private void updatePurchaseOutStatus(List<Integer> purchasesIDs) {
        PurchaseExample purchaseExample = new PurchaseExample();
        purchaseExample.createCriteria().andPurchaseidIn(purchasesIDs);
        List<Purchase> purchases = purchaseMapper.selectByExample(purchaseExample);
        for (Purchase purchase : purchases) {
            Integer purchaseID = purchase.getPurchaseid();
            PurchaseSkuExample purchaseSkuExample = new PurchaseSkuExample();
            purchaseSkuExample.createCriteria().andPurchaseidEqualTo(purchaseID);
            List<PurchaseSku> purchaseSkus = purchaseSkuMapper.selectByExample(purchaseSkuExample);
            boolean outflag = true;
            for (PurchaseSku purchaseSku : purchaseSkus) {
                Integer tempquantity = purchaseSku.getPurchasequantity() - purchaseSku.getDefectivequantity();
                if (!tempquantity.equals(purchaseSku.getStockinquantity())) {
                    outflag = false;
                } else {
                    if (!tempquantity.equals(purchaseSku.getUsequantity())) {
                        outflag = false;
                    }
                }
            }
            if (outflag) {
                purchase.setCnwarehouseoutstatus((byte) 3);
            } else {
                purchase.setCnwarehouseoutstatus((byte) 2);
            }
            purchaseMapper.updateByPrimaryKeySelective(purchase);
        }
    }

    @Override
    public JSONObject reject(Integer outID) {
        WarehouseOutWarrant warehouseOutWarrant = warehouseOutWarrantMapper.selectByPrimaryKey(outID);
        warehouseOutWarrant.setStatus(1);
        warehouseOutWarrantMapper.updateByPrimaryKeySelective(warehouseOutWarrant);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject delete(Integer outID) {
        warehouseOutWarrantMapper.deleteByPrimaryKey(outID);
        WarehouseOutWarrantSkuExample example = new WarehouseOutWarrantSkuExample();
        example.createCriteria().andOutidEqualTo(outID);
        warehouseOutWarrantSkuMapper.deleteByExample(example);
        return CommonUtil.successJson();
    }

    @Override
    public List<WarehouseOutWarrantSku> getSkusByID(Integer productID) {
        WarehouseOutWarrantSkuExample warehouseOutWarrantSkuExample = new WarehouseOutWarrantSkuExample();
        warehouseOutWarrantSkuExample.createCriteria().andProductidEqualTo(productID);
        warehouseOutWarrantSkuExample.setOrderByClause("createTime ASC");
        List<WarehouseOutWarrantSku> warehouseOutWarrantSkus = warehouseOutWarrantSkuMapper.selectByExample(warehouseOutWarrantSkuExample);
        List<WarehouseOutWarrantSku> result = new ArrayList<>();
        Map<Integer, List<WarehouseOutWarrantSku>> map = warehouseOutWarrantSkus.stream().collect(Collectors.groupingBy(WarehouseOutWarrantSku::getOutid));
        for (Map.Entry<Integer, List<WarehouseOutWarrantSku>> entry : map.entrySet()) {
            Integer outId = entry.getKey();
            List<WarehouseOutWarrantSku> warehouseOutWarrantSkus1 = entry.getValue();
            WarehouseOutWarrant warehouseOutWarrant = warehouseOutWarrantMapper.selectByPrimaryKey(outId);
            if (warehouseOutWarrant == null) {
                continue;
            }
            if (warehouseOutWarrant.getArrivestatus() != 3 && warehouseOutWarrant.getType().equals("调拨出库")) {
                Integer count = warehouseOutWarrantSkus1.stream().mapToInt(WarehouseOutWarrantSku::getOutcount).sum();
                if (count < 5) {
                    continue;
                }
                WarehouseOutWarrantSku warehouseOutWarrantSku = warehouseOutWarrantSkus1.get(0);
                warehouseOutWarrantSku.setOutcount(count);
                result.add(warehouseOutWarrantSku);
            }
        }
        return result;
    }

    @Override
    public List<WarehouseOutWarrant> checkWarehouseOut() {
        WarehouseOutWarrantExample example = new WarehouseOutWarrantExample();
        example.createCriteria().andArrivestatusNotEqualTo(3).andWarehouseorderIsNotNull().andWarehouseorderNotEqualTo("");
        List<WarehouseOutWarrant> warehouseOutWarrants = warehouseOutWarrantMapper.selectByExample(example);
        List<WarehouseOutWarrant> warehouseOutWarrants1 = new ArrayList<>();
        for (WarehouseOutWarrant warehouseOutWarrant : warehouseOutWarrants) {
            String order = warehouseOutWarrant.getWarehouseorder();
            char first = order.charAt(0);
            if (first == 'W') {
                JSONObject data = new JSONObject();
                data.put("orderNo", order);
                data.put("isIncludePackage", "Y");
                HttpClient client = new HttpClient("winit.wh.inbound.getOrderDetail", data);
                String result = client.start();
                if (!"error".equals(result)) {
                    JSONObject json = JSONObject.parseObject(result);
                    String resultdata = json.getString("data");
                    JSONObject json1 = JSONObject.parseObject(resultdata);
                    String status = json1.getString("status");
                    if (status.equals("SHD") || status.equals("EWC")) {
                        warehouseOutWarrants1.add(warehouseOutWarrant);
                    }
                } else {
                    //万邑通接口异常
                    System.err.println("getOrderList接口异常");
                }
            } else if (first == 'R') {
                GoodConnectUrl url = new GoodConnectUrl();
                url.setMethod("getGRNDetail");
                JSONObject object = new JSONObject();
                object.put("receiving_code", order);
                url.setParamjson(object.toJSONString());
                String result = url.parseConnect();
                JSONObject json1 = JSONObject.parseObject(result);
                String data = json1.getString("data");
                JSONObject json2 = JSONObject.parseObject(data);
                Integer receiving_status = json2.getIntValue("receiving_status");
                if (receiving_status == 8 || receiving_status == 9 || receiving_status == 10) {
                    warehouseOutWarrants1.add(warehouseOutWarrant);
                }
            }
        }
        return warehouseOutWarrants1;
    }

    @Override
    public List<WarehouseOutWarrant> listWarehouseOutSkus(String sku, String outNum, String startday, String endday, Integer status, String cnWarehouseName) {
        List<WarehouseOutWarrant> warehouseOutWarrants = warehouseOutWarrantMapper.queryWarehouseOutWarrantList2(sku, outNum, startday, endday, status, cnWarehouseName);
        for (WarehouseOutWarrant object : warehouseOutWarrants) {
            Integer outID = object.getOutid();
            String nickname = null;
            List<WarehouseOutWarrantSku> skus = warehouseOutWarrantSkuMapper.getoutSkus(outID);
            for (WarehouseOutWarrantSku sku1 : skus) {
                Integer productid = sku1.getProductid();
                Integer inSkuID = sku1.getInskuid();
                Product product = productMapper.selectByPrimaryKey(productid);
                WarehouseInWarrantSku warehouseInWarrantSku = warehouseInWarrantSkuMapper.selectByPrimaryKey(inSkuID);
                if (nickname == null) {
                    Integer inid = warehouseInWarrantSku.getInid();
                    WarehouseInWarrant warehouseInWarrant = warehouseInWarrantMapper.selectByPrimaryKey(inid);
                    Integer userId = warehouseInWarrant.getUserid();
                    SysUser sysUser = sysUserMapper.selectByPrimaryKey(userId);
                    nickname = sysUser.getNickname();
                }
                String cnName = product.getCnname();
                String imgurl = product.getImgurl();
                sku1.setImgurl(imgurl);
                sku1.setCnName(cnName);
                sku1.setInNum(warehouseInWarrantSku.getInnum());
            }
            object.setNickname(nickname);
            object.setSkus(skus);
        }

        return warehouseOutWarrants;
    }
}
