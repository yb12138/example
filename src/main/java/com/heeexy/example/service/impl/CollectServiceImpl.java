package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.CollectAmountMapper;
import com.heeexy.example.dao.EbayOrderProfitMapper;
import com.heeexy.example.dao.PurchaseMapper;
import com.heeexy.example.model.*;
import com.heeexy.example.service.CollectService;
import com.heeexy.example.util.CommonUtil;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static com.heeexy.example.service.impl.PurchaseServiceImpl.DateToStr;

@Service
public class CollectServiceImpl implements CollectService {
    @Autowired
    CollectAmountMapper collectAmountMapper;
    @Autowired
    PurchaseMapper purchaseMapper;
    @Autowired
    EbayOrderProfitMapper ebayOrderProfitMapper;

    @Override
    public void calcAllAmount(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date startDate = calendar.getTime();
        calendar.add(Calendar.MONTH, 1);
        Date endDate = calendar.getTime();
        PurchaseExample example = new PurchaseExample();
        example.createCriteria().andPaytimeBetween(startDate, endDate).andFinancestatusEqualTo((byte) 3);
        List<Purchase> purchases = purchaseMapper.selectByExample(example);
        Double allPurchaseAmount = 0.0;
        for (Purchase purchase : purchases) {
            Double purchaseAmount = purchase.getPurchasetotalamount().doubleValue();
            Double defectiveAmount = 0.0;
            if (purchase.getDefectivetotalamount() != null) {
                defectiveAmount = purchase.getDefectivetotalamount().doubleValue();
            }
            if (purchaseAmount.equals(defectiveAmount)) {
                continue;
            }
            allPurchaseAmount += (purchase.getHaspaytotalamount().doubleValue() - defectiveAmount);
        }
        EbayOrderProfitExample ebayOrderProfitExample = new EbayOrderProfitExample();
        ebayOrderProfitExample.createCriteria().andCreatetimeBetween(DateToStr(startDate), DateToStr(endDate));
        List<EbayOrderProfit> ebayOrderProfits = ebayOrderProfitMapper.selectByExample(ebayOrderProfitExample);
        Double cost = ebayOrderProfits.stream().collect(Collectors.summingDouble(EbayOrderProfit::getCost));
        CollectAmountExample collectAmountExample = new CollectAmountExample();
        collectAmountExample.createCriteria().andYearEqualTo(year).andMonthEqualTo(month);
        List<CollectAmount> collectAmounts = collectAmountMapper.selectByExample(collectAmountExample);
        if (collectAmounts == null || collectAmounts.size() == 0) {
            CollectAmount collectAmount = new CollectAmount();
            collectAmount.setMonth(month);
            collectAmount.setYear(year);
            collectAmount.setOnsellallamount(cost);
            collectAmount.setPurchaseallamount(allPurchaseAmount);
            collectAmountMapper.insert(collectAmount);
        } else {
            CollectAmount collectAmount = collectAmounts.get(0);
            collectAmount.setMonth(month);
            collectAmount.setYear(year);
            collectAmount.setOnsellallamount(cost);
            collectAmount.setPurchaseallamount(allPurchaseAmount);
            collectAmountMapper.updateByPrimaryKeySelective(collectAmount);
        }
    }

    @Override
    public JSONObject list(Integer pageNo, Integer pageSize, Integer year, Integer month) {
        int start = 0;
        if (pageNo != 0) {
            start = (pageNo - 1) * pageSize;
        }
        List<CollectAmount> collectAmounts = collectAmountMapper.list(start, pageSize, year, month);
        Integer count = collectAmountMapper.count(year, month);
        JSONObject requestjson = new JSONObject();
        requestjson.put("pageRow", pageSize);
        return CommonUtil.successPage(requestjson, collectAmounts, count);
    }
}
