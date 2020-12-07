package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.Warehouse;
import com.heeexy.example.model.WarehouseOutWarrant;
import com.heeexy.example.model.WarehouseOutWarrantSku;

import java.util.List;

public interface WarehouseOutService {

    JSONObject listWarehouseOut(Integer pageSize, Integer pageNum, String sku, String outNum, String startday, String endday, Integer status, String cnWarehouseName);

    JSONObject save(WarehouseOutWarrant warehouseOutWarrant, List<WarehouseOutWarrantSku> skus);

    JSONObject add(WarehouseOutWarrant warehouseOutWarrant, Integer userid, String username);

    JSONObject submit(Integer outID);

    JSONObject verify(Integer outID, Integer userid, String username);

    JSONObject reject(Integer outID);

    JSONObject delete(Integer outID);

    List<WarehouseOutWarrantSku> getSkusByID(Integer productID);

    List<WarehouseOutWarrant> checkWarehouseOut();

    List<WarehouseOutWarrant> listWarehouseOutSkus(String sku, String outNum, String startday, String endday, Integer status, String cnWarehouseName);
}
