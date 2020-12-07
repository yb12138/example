package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.AfteraccountMapper;
import com.heeexy.example.dao.AftermarketMapper;
import com.heeexy.example.dao.AfterreasonMapper;
import com.heeexy.example.dao.PaypalaccountMapper;
import com.heeexy.example.model.*;
import com.heeexy.example.service.AfterService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.ExcelUtils;
import com.heeexy.example.util.constants.ErrorEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static com.heeexy.example.service.impl.OrderServiceImpl.strToDateLong;

@Service
public class AfterServiceImpl implements AfterService {
    @Autowired
    AftermarketMapper aftermarketMapper;
    @Autowired
    AfterreasonMapper afterreasonMapper;
    @Autowired
    AfteraccountMapper afteraccountMapper;
    @Autowired
    PaypalaccountMapper paypalaccountMapper;

    @Override
    public JSONObject listAfterReason(int limit, int size, String sku, String order, String startTime, String endTime) {
        int start = 0;
        if (limit != 0) {
            start = (limit - 1) * size;
        }
        List<Aftermarket> aftermarkets = aftermarketMapper.listAfter(start, size, sku, order, startTime, endTime);
        Integer count = aftermarketMapper.countAfter(sku, order, startTime, endTime);
        JSONObject requestjson = new JSONObject();
        requestjson.put("pageRow", size);
        return CommonUtil.successPage(requestjson, aftermarkets, count);
    }

    @Override
    public JSONObject insert(Aftermarket aftermarket) {
        Date date = new Date();
        aftermarket.setCreatetime(date);
        aftermarketMapper.insertSelective(aftermarket);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject update(Aftermarket aftermarket) {
        aftermarketMapper.updateByPrimaryKeySelective(aftermarket);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject delete(Aftermarket aftermarket) {
        aftermarketMapper.deleteByPrimaryKey(aftermarket.getId());
        return CommonUtil.successJson();
    }

    @Override
    public List<Aftermarket> exportAll(String sku, String order, String startTime, String endTime) {
        return aftermarketMapper.listAfter(null, null, sku, order, startTime, endTime);
    }

    @Override
    public List<AfterCollect> collect(String sku, String order, String startday, String endday) {
        List<Aftermarket> aftermarkets = aftermarketMapper.listAfter(null, null, sku, order, startday, endday);
        Map<String, List<Aftermarket>> listMap = aftermarkets.stream().collect(Collectors.groupingBy(Aftermarket::getSku));
        List<AfterCollect> result = new ArrayList<>();
        for (Map.Entry<String, List<Aftermarket>> entry : listMap.entrySet()) {
            String tempsku = entry.getKey();
            List<Aftermarket> list1 = entry.getValue();
            Integer num = 0;
            double price = 0.0;
            String productname = null;
            for (Aftermarket aftermarket : list1) {
                num += 1;
                price += Double.valueOf(aftermarket.getMoney());
                productname = aftermarket.getCnname();
            }
            AfterCollect afterCollect = new AfterCollect();
            afterCollect.setSku(tempsku);
            afterCollect.setCnname(productname);
            afterCollect.setNum(num);
            afterCollect.setPrice(price);
            result.add(afterCollect);
        }
        return result;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject upload(MultipartFile excel) {
        try {
            List<Aftermarket> aftermarkets = ExcelUtils.importExcel(excel, 0, 1, Aftermarket.class);
            for (Aftermarket aftermarket : aftermarkets) {
                String order = aftermarket.getOrderid();
                Aftermarket aftermarket1 = aftermarketMapper.search(order);
                if (aftermarket1 != null) {
                    aftermarket.setId(aftermarket1.getId());
                    aftermarketMapper.updateByPrimaryKeySelective(aftermarket);
                } else {
                    String reason = aftermarket.getReasonname();
                    Afterreason afterreason = afterreasonMapper.search(reason);
                    String paypaliname = aftermarket.getPaypaliname();
                    Paypalaccount paypalaccount = paypalaccountMapper.search(paypaliname);
                    Afteraccount afteraccount = afteraccountMapper.search(aftermarket.getAccountname());
                    aftermarket.setReasonid(afterreason.getReasonid());
                    aftermarket.setAccountid(afteraccount.getAccountid());
                    aftermarket.setPaypalid(paypalaccount.getPayid());
                    aftermarketMapper.insertSelective(aftermarket);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return CommonUtil.successJson();
    }
}
