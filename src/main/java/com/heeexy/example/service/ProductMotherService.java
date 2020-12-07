package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.Product;

public interface ProductMotherService {

    JSONObject list(Integer size, Integer num, String sku);

    JSONObject insert();

}
