package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.SalegroupMapper;
import com.heeexy.example.model.Salegroup;
import com.heeexy.example.model.SalegroupExample;
import com.heeexy.example.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/salegroup")
public class SaleGroupController {
    @Autowired
    SalegroupMapper salegroupMapper;

    @GetMapping("/list")
    public JSONObject listAllOrder() {
        SalegroupExample salegroupExample = new SalegroupExample();
        salegroupExample.createCriteria().andSalegroupidIsNotNull();
        List<Salegroup> salegroups = salegroupMapper.selectByExample(salegroupExample);
        JSONObject result = CommonUtil.successJson();
        JSONObject info = new JSONObject();
        info.put("list", salegroups);
        result.put("info", info);
        return result;
    }
}
