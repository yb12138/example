package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.LocalWarehouseStorage;

public interface LocalStorageService {

    Boolean createStorage(LocalWarehouseStorage localWarehouseStorage);


    JSONObject listStorage(Integer pageNo, Integer pageSize, String sku, String name, Long warehouseid);


}
