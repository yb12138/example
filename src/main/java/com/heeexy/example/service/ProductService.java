package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.Product;
import com.heeexy.example.model.ProductCountry;
import com.heeexy.example.model.ProductSell;

import java.util.List;
import java.util.Map;

public interface ProductService {
    /**
     * 获取当前产品信息,分页展示
     * sku,中文名称等
     *
     * @param params
     */
    JSONObject queryProductInfo(Integer pageNo, Integer pageSize, String sku, String name, Long warehouseid, String country);

    JSONObject queryAllProduct();

    Product queryBySku(String sku);

    Integer getCount();

    JSONObject update(Product product, List<ProductCountry> productCountries, ProductSell productSell);

    JSONObject insert(Product product, List<ProductCountry> productCountries, ProductSell productSell);

    JSONObject delete(Integer productID);

    List<Product> exportAll();
}
