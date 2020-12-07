package com.heeexy.example.winit.http;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.winit.model.RequestMsg;
import org.junit.Test;

public class QuertItemDeatail extends BaseHttp {
    @Test
    public void test() {
        doTest();
    }

    @Override
    protected void setdBusinessData(RequestMsg requestMsg) {
        JSONObject data = new JSONObject();
        data.put("outboundOrderNum", "WO3089489237");
        requestMsg.setData(data);
    }

    @Override
    protected void setRequestAction(RequestMsg requestMsg) {
        requestMsg.setAction("queryOutboundOrder");
    }

    @Override
    protected void parseRequestResult(String result) {
        System.out.println(result);
    }
}
