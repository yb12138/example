package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.FinancePayment;
import com.heeexy.example.model.Purchase;

import java.util.Date;
import java.util.List;

public interface FinanceService {

    JSONObject createFinance(Purchase purchase, String username, Integer userid, String type);

    JSONObject save(FinancePayment financePayment);

    JSONObject submit(Integer financeid, String username, Integer userid);

    JSONObject verify(Integer financeid, String username, Integer userid);

    JSONObject reject(Integer financeid, String username, Integer userid);

    JSONObject delete(Integer financeid);

    JSONObject listfinance(Integer pageSize, Integer pageNum, String purchaseNum, String paymentNum, String startday, String endday, Integer status);

    JSONObject confirm(Integer paymentID);

    Integer getTodayAmount();

    List<FinancePayment> listPayment(String purchaseNum, String paymentNum, String startday, String endday, Integer status);

    /**
     * 录入用
     */
    void createFinance(Purchase purchase, String username, Integer userid, String type, Date date);
}
