package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.ProductWarehouseStorage;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public interface ProductStorageService {
    Boolean add(Integer productID, Integer count, Integer process, Boolean flag);

    Boolean min(Integer productID, Integer count, Integer process, Boolean flag);

    Boolean createStorage(ProductWarehouseStorage warehouseStorage);


    JSONObject listProductStorage(Integer pageNo, Integer pageSize, String sku, String name, Long warehouseid);

    List<ProductWarehouseStorage> listAllStorage(String sku, String name, Long warehouseid);

    JSONObject listAllStorage();

    JSONObject listProductStorageBack(Integer pageNo, Integer pageSize, String sku, Integer month);

    JSONObject exportProductStorageBack(String sku, Integer month, HttpServletResponse response) throws IOException;


}
