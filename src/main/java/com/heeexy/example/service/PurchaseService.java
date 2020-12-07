package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.Purchase;
import com.heeexy.example.model.PurchaseSku;

import java.util.List;
import java.util.Map;

public interface PurchaseService {

    JSONObject listPurchase(Integer pageSize, Integer pageNum, String purchaseNum, String sku, String startday, String endday, String cnName, Long warehouseid, Integer purchaseStatus, Integer warehouseStatus, Integer financeStatus, Integer cnWarehouseInStatus, Integer cnWarehouseOutStatus);

    JSONObject purchaseDetail(Integer purchaseid);

    JSONObject addPurchase(Integer supplierid, Long warehouseID, String supplierOrderNumber, String transactionNumber, Integer purchaseTotalQuantity, Double purchaseTotalAmount, Double freightTotalAmount, String remark, List<Map<String, Object>> skus, Integer userid, String userName);

    JSONObject updatePurchase(Integer supplierid, Long warehouseID, String supplierOrderNumber, String transactionNumber, Double freightTotalAmount, String remark, List<Map<String, Object>> skus, Integer userid, String username, Integer purchaseid);

    JSONObject submit(Integer purchaseid);

    JSONObject verify(Integer purchaseid, String username, Integer userid);

    JSONObject reject(Integer purchaseid);

    JSONObject delete(Integer purchaseid);

    List<PurchaseSku> queryByID(Integer productID);

    void updatePurchase(Purchase purchase);

    Purchase queryDetailByID(Integer purchaseID);

    List<PurchaseSku> queryByPurchaseID(Integer purchaseID);

    List<String> checkPurchase();

    void splitPurchase(Integer purchaseID);

    List<Purchase> listAllPurchase(String purchaseNum, String sku, String startday, String endday, String cnName, Long warehouseid, Integer purchaseStatus, Integer warehouseStatus, Integer financeStatus, Integer cnWarehouseInStatus, Integer cnWarehouseOutStatus);
}
