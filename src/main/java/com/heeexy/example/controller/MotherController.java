package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.ProductMotherCode;
import com.heeexy.example.service.MotherService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 母代码管理
 */

@RestController
@RequestMapping("/mother")
public class MotherController {
    @Autowired
    MotherService motherService;

    @RequiresPermissions("mother:list")
    @PostMapping("/list")
    public JSONObject listAllOrder(@RequestBody Map<String, Object> params) {
        String sku = (String) params.get("name");
        Integer pageSize = (Integer) params.get("pageRow");
        Integer pageNum = (Integer) params.get("pageNum");
        return motherService.listMother(pageSize, pageNum, sku);
    }

    @RequiresPermissions("mother:update")
    @PostMapping("/update")
    public JSONObject updateMother(@RequestBody ProductMotherCode mother) {
        return motherService.update(mother);
    }

    @RequiresPermissions("mother:add")
    @PostMapping("/insert")
    public JSONObject insertMother(@RequestBody ProductMotherCode mother) {
        return motherService.insert(mother);
    }

    @RequiresPermissions("mother:delete")
    @GetMapping("/delete")
    public JSONObject deleteMother(@RequestParam Integer mid) {
        return motherService.delete(mid);
    }

    @GetMapping("/list")
    public JSONObject listAllMother() {
        return motherService.listAll();
    }
}
