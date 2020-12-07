package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.ProductSellMapper;
import com.heeexy.example.model.ProductSell;
import com.heeexy.example.service.ProductSellService;
import com.heeexy.example.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductSellServiceImpl implements ProductSellService {
    @Autowired
    ProductSellMapper productSellMapper;

    @Override
    public Map<String, Double> getStringDoubleMap(Integer productID) {
        Map<String, Double> sales = productSellMapper.queryByProduct(productID);
        //若空，则先按0算
        if (sales == null) {
            sales = new HashMap<>();
            sales.put("month1", 0.0);
            sales.put("month2", 0.0);
            sales.put("month3", 0.0);
            sales.put("month4", 0.0);
            sales.put("month5", 0.0);
            sales.put("month6", 0.0);
            sales.put("month7", 0.0);
            sales.put("month8", 0.0);
            sales.put("month9", 0.0);
            sales.put("month10", 0.0);
            sales.put("month11", 0.0);
            sales.put("month12", 0.0);
            ProductSell sell = new ProductSell(productID, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
            productSellMapper.insert(sell);
        }
        return sales;
    }

    @Override
    public void deleteSell(Integer productID) {
        productSellMapper.deleteByPrimaryKey(productID);
    }

    @Override
    public JSONObject list(Integer size, Integer num, String sku, String name, Long warehouseid, String productLevel) {
        int start = 0;
        if (num != 0) {
            start = (num - 1) * size;
        }
        List<ProductSell> sells = productSellMapper.getSells(start, size, sku, name, warehouseid, productLevel);
        Integer count = productSellMapper.getCount(sku, name, warehouseid, productLevel);
        JSONObject requestjson = new JSONObject();
        requestjson.put("pageRow", size);
        return CommonUtil.successPage(requestjson, sells, count);
    }


    @Override
    public JSONObject update(ProductSell productSell) {
        productSellMapper.updateByPrimaryKeySelective(productSell);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject insert(ProductSell productSell) {
        return null;
    }

    @Override
    public JSONObject delete(Integer productID) {
        return null;
    }
}
