package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.Product;
import com.heeexy.example.model.WarehouseInWarrant;
import com.heeexy.example.model.WarehouseInWarrantSku;

import java.util.Date;
import java.util.List;

public interface WarehouseInService {
    JSONObject save(WarehouseInWarrant warehouseInWarrant, List<WarehouseInWarrantSku> skus);

    JSONObject submit(Integer inID, String username, Integer userid);

    JSONObject verify(Integer inID, String username, Integer userid);

    JSONObject reject(Integer inID, String username, Integer userid);

    JSONObject delete(Integer inID);

    JSONObject listWarehouseIn(Integer pageSize, Integer pageNum, String purchaseNum, String inNum, String startday, String endday, Integer status, Long warehouseID, Long userID, String headwayType);

    JSONObject add(WarehouseInWarrant warehouseInWarrant, Integer userid, String username);

    JSONObject searchAllInByProduct(List<Product> productlist);

    Boolean updateWarehouseInSkuUse(Integer inSkuID, Integer useCount);

    JSONObject listAllInProduct();

    List<WarehouseInWarrantSku> getSkuByID(Integer productID);

    void add(WarehouseInWarrant warehouseInWarrant, Integer userid, String username, Date date);

    List<WarehouseInWarrant> excel(String purchaseNum, String inNum, String startday, String endday, Integer status, Long warehouseID, Long userID, String headwayType);
}
