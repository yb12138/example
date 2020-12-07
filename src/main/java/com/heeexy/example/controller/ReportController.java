package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.service.ProductStorageService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@RestController()
@RequestMapping("/report")
public class ReportController {
    @Autowired
    ProductStorageService productStorageService;


    @RequiresPermissions("report:storagelist")
    @PostMapping("/storagelist")
    public JSONObject listStorageProice(@RequestBody Map<String, Object> params) {
        String sku = null;
        Integer month = null;
        if (!StringUtils.isEmpty(params.get("sku"))) {
            sku = (String) params.get("sku");
        }
        if (!StringUtils.isEmpty(params.get("month"))) {
            month = Integer.valueOf(String.valueOf(params.get("month")));
        }
        Integer pageSize = (Integer) params.get("pageRow");
        Integer pageNum = (Integer) params.get("pageNum");
        return productStorageService.listProductStorageBack(pageNum, pageSize, sku, month);
    }

    @RequiresPermissions("report:storagelist")
    @PostMapping("/excel")
    public void exportStorageProice(@RequestBody Map<String, Object> params, HttpServletResponse response) {
        String sku = null;
        Integer month = null;
        if (!StringUtils.isEmpty(params.get("sku"))) {
            sku = (String) params.get("sku");
        }
        if (!StringUtils.isEmpty(params.get("month"))) {
            month = Integer.valueOf(String.valueOf(params.get("month")));
        }

        try {
            productStorageService.exportProductStorageBack(sku, month, response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
