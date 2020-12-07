package com.heeexy.example.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.Algorithmicrule;

public interface AlgorithmicruleService {
    JSONObject getData(Long id);

    JSONObject updateAlgo(Algorithmicrule algorithmicrule);

}
