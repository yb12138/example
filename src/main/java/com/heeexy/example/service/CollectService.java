package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;

public interface CollectService {

    void calcAllAmount(int year, int month);

    JSONObject list(Integer pageNo, Integer pageSize, Integer year, Integer month);
}
