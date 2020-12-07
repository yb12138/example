package com.heeexy.example.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.AfterCollect;
import com.heeexy.example.model.Aftermarket;
import com.heeexy.example.model.Afterreason;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface AfterService {

    JSONObject listAfterReason(int limit, int size, String sku, String order, String start, String end);

    JSONObject insert(Aftermarket aftermarket);

    JSONObject update(Aftermarket aftermarket);

    JSONObject delete(Aftermarket aftermarket);

    List<Aftermarket> exportAll(String sku, String order, String start, String end);

    List<AfterCollect> collect(String sku, String order, String startday, String endday);

    JSONObject upload(MultipartFile excel);
}
