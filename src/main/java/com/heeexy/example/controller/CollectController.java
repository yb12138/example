package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.CollectAmountMapper;
import com.heeexy.example.model.CollectAmount;
import com.heeexy.example.model.Purchase;
import com.heeexy.example.service.CollectService;
import com.heeexy.example.service.PurchaseService;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import static com.heeexy.example.service.impl.PurchaseServiceImpl.DateToStr;

@RestController
@RequestMapping("/collect")
public class CollectController {
    @Autowired
    CollectService collectService;
    @Autowired
    PurchaseService purchaseService;
    @Autowired
    CollectAmountMapper collectAmountMapper;

    @PostMapping("/list")
    public JSONObject list(@RequestBody Map<String, String> map) {
        Integer pageNo = Integer.valueOf(map.get("pageNum"));
        Integer pageSize = Integer.valueOf(map.get("pageRow"));
        Integer year = null;
        if (!StringUtils.isEmpty(map.get("year"))) {
            year = Integer.valueOf(map.get("year"));
        }
        Integer month = null;
        if (!StringUtils.isEmpty(map.get("month"))) {
            year = Integer.valueOf(map.get("month"));
        }
        return collectService.list(pageNo, pageSize, year, month);
    }

    @PostMapping("/purchaseList")
    public JSONObject purchaseList(@RequestBody Map<String, String> map) {
        Integer pageNo = Integer.valueOf(map.get("pageNum"));
        Integer pageSize = Integer.valueOf(map.get("pageRow"));
        Integer amountID = Integer.valueOf(map.get("amountID"));
        CollectAmount collectAmount = collectAmountMapper.selectByPrimaryKey(amountID);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, collectAmount.getYear());
        calendar.set(Calendar.MONTH, collectAmount.getMonth() - 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date startDate = calendar.getTime();
        calendar.add(Calendar.MONTH, 1);
        Date endDate = calendar.getTime();
        String start = DateToStr(startDate);
        String end = DateToStr(endDate);
        return purchaseService.listPurchase(pageSize, pageNo, null, null, start, end, null, null, null, null, 3, null, null);
    }

    @PostMapping("/orderList")
    public JSONObject orderList(@RequestBody Map<String, String> map) {
        Integer pageNo = Integer.valueOf(map.get("pageNum"));
        Integer pageSize = Integer.valueOf(map.get("pageRow"));
        Integer amountID = Integer.valueOf(map.get("amountID"));
        CollectAmount collectAmount = collectAmountMapper.selectByPrimaryKey(amountID);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, collectAmount.getYear());
        calendar.set(Calendar.MONTH, collectAmount.getMonth() - 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date startDate = calendar.getTime();
        calendar.add(Calendar.MONTH, 1);
        Date endDate = calendar.getTime();
        String start = DateToStr(startDate);
        String end = DateToStr(endDate);
        return purchaseService.listPurchase(pageSize, pageNo, null, null, start, end, null, null, null, null, 3, null, null);
    }
}
