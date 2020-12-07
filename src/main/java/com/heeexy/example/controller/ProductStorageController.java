package com.heeexy.example.controller;


import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.ProductWarehouseStorage;
import com.heeexy.example.model.Purchase;
import com.heeexy.example.service.DataService;
import com.heeexy.example.service.ProductStorageService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.ExcelUtils;
import com.heeexy.example.util.constants.ErrorEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/storage")
public class ProductStorageController {
    @Autowired
    ProductStorageService storageService;
    @Autowired
    DataService dataService;

    @PostMapping("/list")
    public JSONObject listStorage(@RequestBody Map<String, String> map) {
        System.out.println("map:" + map.toString());
        Integer pageNo = Integer.valueOf(map.get("pageNum"));
        Integer pageSize = Integer.valueOf(map.get("pageRow"));
        String sku = map.get("sku");
        String name = map.get("name");
        Long warehouseid = null;
        if (!StringUtils.isEmpty(map.get("warehouseid"))) {
            warehouseid = Long.valueOf(map.get("warehouseid"));
        }
        return storageService.listProductStorage(pageNo, pageSize, sku, name, warehouseid);
    }

    @GetMapping("/synData")
    public JSONObject synData() {
        dataService.updateBasicData();
        return CommonUtil.successJson();
    }

    @GetMapping("/storageMoney")
    public JSONObject storageMoney() {
        return storageService.listAllStorage();
    }

    @PostMapping("/excel")
    public void excel(@RequestBody Map<String, String> map, HttpServletResponse response) {
        System.out.println("map:" + map.toString());
        String sku = map.get("sku");
        String name = map.get("name");
        Long warehouseid = null;
        if (!StringUtils.isEmpty(map.get("warehouseid"))) {
            warehouseid = Long.valueOf(map.get("warehouseid"));
        }
        List<ProductWarehouseStorage> warehouseStorages = storageService.listAllStorage(sku, name, warehouseid);
        try {
            ExcelUtils.exportExcel(warehouseStorages, "库存单", "库存单", ProductWarehouseStorage.class, "库存报表", true, response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
