package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.ProductgroupMapper;
import com.heeexy.example.dao.SalegroupMapper;
import com.heeexy.example.model.Productgroup;
import com.heeexy.example.model.ProductgroupExample;
import com.heeexy.example.model.Salegroup;
import com.heeexy.example.model.SalegroupExample;
import com.heeexy.example.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productgroup")
public class ProductGroupController {
    @Autowired
    ProductgroupMapper productgroupMapper;

    @GetMapping("/list")
    public JSONObject listAllOrder() {
        ProductgroupExample productgroupExample = new ProductgroupExample();
        productgroupExample.createCriteria().andProductgroupidIsNotNull();
        List<Productgroup> productgroups = productgroupMapper.selectByExample(productgroupExample);
        JSONObject result = CommonUtil.successJson();
        JSONObject info = new JSONObject();
        info.put("list", productgroups);
        result.put("info", info);
        return result;
    }
}
