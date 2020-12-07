package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.logistics.param.AlibabaLogisticsOpenPlatformLogisticsStep;
import com.alibaba.logistics.param.AlibabaLogisticsOpenPlatformLogisticsTrace;
import com.alibaba.logistics.param.AlibabaTradeGetLogisticsTraceInfoBuyerViewParam;
import com.alibaba.logistics.param.AlibabaTradeGetLogisticsTraceInfoBuyerViewResult;
import com.alibaba.ocean.rawsdk.ApiExecutor;
import com.alibaba.ocean.rawsdk.common.SDKResult;
import com.heeexy.example.dao.PurchaseMapper;
import com.heeexy.example.dao.PurchaseTrackingMapper;
import com.heeexy.example.model.Purchase;
import com.heeexy.example.model.PurchaseExample;
import com.heeexy.example.model.PurchaseTracking;
import com.heeexy.example.model.PurchaseTrackingExample;
import com.heeexy.example.service.TrackService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.constants.ErrorEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class TrackServiceImpl implements TrackService {
    @Autowired
    PurchaseTrackingMapper trackingMapper;
    @Autowired
    PurchaseMapper purchaseMapper;

    @Override
    public void updateTrack() {
        PurchaseExample example = new PurchaseExample();
        example.createCriteria().andSupplierordernumberIsNotNull().andCnwarehouseinstatusLessThan((byte) 3);
        List<Purchase> purchases = purchaseMapper.selectByExample(example);
        Date date = new Date();
        for (Purchase purchase : purchases) {
            String number = purchase.getSupplierordernumber().trim();
            if ("".equals(number)) {
                continue;
            }
            if (number.equals("线上")) {
                continue;
            }
            if (number.split(",").length > 1) {
                String[] numbers = number.split(",");
                for (int i = 0; i < numbers.length; i++) {
                    String temp = numbers[i];
                    generateTrack(date, purchase, temp);
                }
                continue;
            }
            generateTrack(date, purchase, number);
        }

    }

    private void generateTrack(Date date, Purchase purchase, String number) {
        ApiExecutor apiExecutor = new ApiExecutor("6546348", "nhSjR0Bpg2");
        AlibabaTradeGetLogisticsTraceInfoBuyerViewParam param = new AlibabaTradeGetLogisticsTraceInfoBuyerViewParam();
        param.setOrderId(Long.valueOf(number));
        param.setWebSite("1688");
        SDKResult<AlibabaTradeGetLogisticsTraceInfoBuyerViewResult> result = apiExecutor.execute(param, "a96a9be0-c2b1-4529-855a-3808f047a5a9");
        if (!"500_2".equals(result.getErrorCode())) {
            AlibabaTradeGetLogisticsTraceInfoBuyerViewResult result1 = result.getResult();
            if (result1 == null) {
                return;
            }
            AlibabaLogisticsOpenPlatformLogisticsTrace[] trace = result1.getLogisticsTrace();
            if (trace == null) {
                return;
            }
            for (AlibabaLogisticsOpenPlatformLogisticsTrace trace1 : trace) {
                String logisticsBillNo = trace1.getLogisticsBillNo();
                PurchaseTrackingExample trackingExample = new PurchaseTrackingExample();
                trackingExample.createCriteria().andShiptrackingidEqualTo(logisticsBillNo);
                List<PurchaseTracking> purchaseTrackings = trackingMapper.selectByExample(trackingExample);
                AlibabaLogisticsOpenPlatformLogisticsStep[] steps = trace1.getLogisticsSteps();
                String logics = null;
                if (steps != null && steps.length > 0) {
                    logics = JSON.toJSONString(steps);
                }
                if (purchaseTrackings == null || purchaseTrackings.size() == 0) {
                    PurchaseTracking tracking = new PurchaseTracking();
                    tracking.setCreatetime(date);
                    tracking.setShiptrackingid(logisticsBillNo);
                    tracking.setPurchaseid(purchase.getPurchaseid());
                    tracking.setLogics(logics);
                    tracking.setPurchasenum(purchase.getPurchasenum());
                    trackingMapper.insertSelective(tracking);
                } else {
                    PurchaseTracking tracking = purchaseTrackings.get(0);
                    tracking.setLogics(logics);
                    trackingMapper.updateByPrimaryKeySelective(tracking);
                }


            }
        }
    }

    @Override
    public JSONObject searchTracking(String shipTrackingID) {
        PurchaseTrackingExample example = new PurchaseTrackingExample();
        example.createCriteria().andShiptrackingidEqualTo(shipTrackingID);
        List<PurchaseTracking> trackings = trackingMapper.selectByExample(example);
        if (trackings != null && trackings.size() > 0) {
            return CommonUtil.successJson(trackings.get(0));
        }
        return CommonUtil.errorJson(ErrorEnum.E_100001);
    }
}
