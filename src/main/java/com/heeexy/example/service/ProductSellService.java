package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.ProductSell;

import java.util.Map;

public interface ProductSellService {
    Map<String, Double> getStringDoubleMap(Integer productID);

    void deleteSell(Integer productID);

    JSONObject list(Integer size, Integer num, String sku, String name, Long warehouseid, String productlevel);

    JSONObject update(ProductSell productSell);

    JSONObject insert(ProductSell productSell);

    JSONObject delete(Integer productID);


}
