package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.ProductMotherCode;

public interface MotherService {
    JSONObject listMother(int pageSize, int pageNum, String sku);

    JSONObject update(ProductMotherCode productMotherCode);

    JSONObject insert(ProductMotherCode productMotherCode);

    JSONObject delete(Integer motherID);

    JSONObject listAll();
}
