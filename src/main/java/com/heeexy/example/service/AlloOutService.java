package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.AlloOut;
import com.heeexy.example.model.AlloOutSku;

import java.util.List;

public interface AlloOutService {
    JSONObject listAllOut(Integer pageSize, Integer pageNum, String warehouseOrder, Long warehouseID, String create_Start, String create_End, String arrive_Start, String arrive_End, Integer status, String sku);

    JSONObject save(AlloOut alloOut, List<AlloOutSku> skus);

    JSONObject review(AlloOut alloOut, List<AlloOutSku> skus);

    JSONObject add(AlloOut alloOut, Integer userid, String username);

    JSONObject submit(Integer alloid);

    JSONObject verify(Integer alloid);

    JSONObject reject(Integer alloid);

    JSONObject delete(Integer alloid);

    List<AlloOutSku> getSkuById(Integer productID);

    List<AlloOut> excelAllOut(String warehouseOrder, Long warehouseID, String create_Start, String create_End, String arrive_Start, String arrive_End, Integer status, String sku);

}
