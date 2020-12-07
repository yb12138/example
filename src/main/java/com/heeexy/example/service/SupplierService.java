package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.PurchaseSupplier;

public interface SupplierService {

    JSONObject listSupplier(Integer pageNum, Integer pageSize, String name);

    JSONObject listAllSupplier();

    JSONObject addSupplier(PurchaseSupplier purchaseSupplier, String username, Integer userid);

    JSONObject updateSupplier(PurchaseSupplier purchaseSupplier);

    JSONObject deleteSupplier(Integer supplierID);

    JSONObject listAllSuppliersProduct(int supplierid);

    PurchaseSupplier searchByName(String name);

}
