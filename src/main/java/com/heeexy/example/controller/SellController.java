package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.Product;
import com.heeexy.example.model.ProductSell;
import com.heeexy.example.service.ProductSellService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sell")
public class SellController {
    @Autowired
    ProductSellService productSellService;

    @RequiresPermissions("sell:list")
    @PostMapping("/list")
    public JSONObject listAllOrder(@RequestBody Map<String, Object> params) {
        String sku = String.valueOf(params.get("sku"));
        String name = String.valueOf(params.get("name"));
        String productLevel = (String) params.get("productlevel");
        if (StringUtils.isEmpty(sku)) {
            sku = null;
        }
        if (StringUtils.isEmpty(productLevel)) {
            productLevel = null;
        }
        if (StringUtils.isEmpty(name)) {
            name = null;
        }
        Long warehouseid = null;
        if (!StringUtils.isEmpty(params.get("warehouseid"))) {
            warehouseid = Long.valueOf(params.get("warehouseid").toString());
        }
        Integer pageSize = (Integer) params.get("pageRow");
        Integer pageNum = (Integer) params.get("pageNum");
        return productSellService.list(pageSize, pageNum, sku, name, warehouseid, productLevel);
    }

    @RequiresPermissions("sell:update")
    @PostMapping("/update")
    public JSONObject update(@RequestBody ProductSell productSell) {
        return productSellService.update(productSell);
    }

    ;


}
