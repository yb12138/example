package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.Product;
import com.heeexy.example.model.ProductNewYear;
import com.heeexy.example.model.Warninfo;

import java.util.List;
import java.util.Map;

public interface WarnInfoService {

    JSONObject listWarnInfo(Integer pageSize, Integer pageNum, String sku, String cnName, Long warehouseid, Integer status);

    Boolean updateWarn(Warninfo warninfo);

    Boolean addOrUpdateWarn(Warninfo warninfo);

    JSONObject submit(Integer productID);

    JSONObject verify(Integer productID, String username, Integer userid);

    JSONObject reject(Integer productID);

    JSONObject delete(Integer productID);

    JSONObject generateNewWaran(Product product);

    JSONObject updateWarnInfo();

    JSONObject queryProcessInfo(Integer productID);

    List<ProductNewYear> calcNewYearProductStorage();

}
