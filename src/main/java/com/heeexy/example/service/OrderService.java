package com.heeexy.example.service;


import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.EbayOrderProfit;
import com.heeexy.example.model.EbayOrderSku;

import java.util.List;
import java.util.Map;

public interface OrderService {
    JSONObject queryOrders(int start, int size, String order, String sku, String startTime, String endTime);

    JSONObject queryDetailByOrder(List<EbayOrderSku> ebayOrderSkus);

    //更新酋长订单数据
    void synOrderData();

    //每天定时计算已关联的订单的利润
    void circleAmount(String start, String end);

    //每天定时计算已关联的订单的利润
    void circleEcAmount(String start, String end);


    //每隔五天将出库单与平台订单和入库单关联
    void createRelationInAndOut(String start, String end);

    void createEcRelationInAndOut(String start, String end);



    Map<String, String> getTodayAmount();


    List<EbayOrderProfit> exportOrder(String start, String end);


}
