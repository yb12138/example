package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.Product;
import com.heeexy.example.model.ProductNew;

import java.util.List;

public interface ProductNewService {
    JSONObject save(ProductNew productNew);

    JSONObject submit(Integer productID, String username, Integer userid);

    JSONObject verify(Integer productID, String username, Integer userid);

    JSONObject reject(Integer productID, String username, Integer userid);

    JSONObject delete(Integer productID);

    JSONObject listProduct(Integer pageSize, Integer pageNum, String cnName, Integer status);

    JSONObject add(ProductNew productNew, Integer userid, String username);

    ProductNew getById(Integer productID);
}
