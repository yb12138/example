package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.*;
import com.heeexy.example.service.OrderService;
import com.heeexy.example.util.ExcelUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

/**
 * 订单接口
 */
@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    OrderService orderService;

    @RequiresPermissions("order:list")
    @PostMapping("/list")
    public JSONObject listAllOrder(@RequestBody Map<String, Object> params) {

        String sku = (String) params.get("sku");
        if (StringUtils.isEmpty(sku)) {
            sku = null;
        }
        String order = String.valueOf(params.get("order"));
        if (StringUtils.isEmpty(order)) {
            order = null;
        }
        List<String> time = (List<String>) params.get("time");
        String startday = null;
        String endday = null;
        if (time != null && time.size() > 1) {
            startday = time.get(0);
            endday = time.get(1);
        }
        Integer pageSize = (Integer) params.get("pageRow");
        Integer pageNum = (Integer) params.get("pageNum");
        return orderService.queryOrders(pageNum, pageSize, order, sku, startday, endday);
    }

    @RequiresPermissions("order:detail")
    @PostMapping("/detail")
    public JSONObject listDetail(@RequestBody List<EbayOrderSku> ebayOrderSkus) {
        return orderService.queryDetailByOrder(ebayOrderSkus);
    }

    @RequiresPermissions("order:list")
    @PostMapping("/excel")
    public void excelAllOrder(@RequestBody Map<String, Object> params, HttpServletResponse response) {

        List<String> time = (List<String>) params.get("time");
        String startday = null;
        String endday = null;
        if (time != null && time.size() > 1) {
            startday = time.get(0);
            endday = time.get(1);
        }
        List<EbayOrderProfit> ebayOrderProfits = orderService.exportOrder(startday, endday);

        try {
            ExcelUtils.exportExcel(ebayOrderProfits, "利润订单", "订单表", EbayOrderProfit.class, "订单表", true, response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
