package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.LocalWarehouseStorageMapper;
import com.heeexy.example.model.LocalWarehouseStorage;
import com.heeexy.example.service.LocalStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalStorageServiceImpl implements LocalStorageService {
    @Autowired
    LocalWarehouseStorageMapper localWarehouseStorageMapper;


    @Override
    public Boolean createStorage(LocalWarehouseStorage localWarehouseStorage) {
        localWarehouseStorageMapper.insertSelective(localWarehouseStorage);
        return true;
    }

    @Override
    public JSONObject listStorage(Integer pageNo, Integer pageSize, String sku, String name, Long warehouseid) {

        return null;
    }
}
