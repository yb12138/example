package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.WarehouseMapper;
import com.heeexy.example.model.Warehouse;
import com.heeexy.example.model.WarehouseExample;
import com.heeexy.example.service.WarehouseService;
import com.heeexy.example.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {
    @Autowired
    WarehouseMapper warehouseMapper;

    @Override
    public JSONObject warehouselist() {
        WarehouseExample example = new WarehouseExample();
        example.createCriteria().andWarehouseidIsNotNull();
        List<Warehouse> warehouses = warehouseMapper.selectByExample(example);
        JSONObject result = new JSONObject();
        result.put("list", warehouses);
        return CommonUtil.successJson(result);
    }
}
