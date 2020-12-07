package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.ProductNewMapper;
import com.heeexy.example.model.ProductNew;
import com.heeexy.example.service.ProductNewService;
import com.heeexy.example.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductNewServiceImpl implements ProductNewService {
    @Autowired
    ProductNewMapper productNewMapper;

    @Override
    public JSONObject save(ProductNew productNew) {
        productNewMapper.updateByPrimaryKeySelective(productNew);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject submit(Integer productID, String username, Integer userid) {
        ProductNew productNew = productNewMapper.selectByPrimaryKey(productID);
        productNew.setStatus(2);
        productNewMapper.updateByPrimaryKeySelective(productNew);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject verify(Integer productID, String username, Integer userid) {
        ProductNew productNew = productNewMapper.selectByPrimaryKey(productID);
        productNew.setStatus(3);
        productNewMapper.updateByPrimaryKeySelective(productNew);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject reject(Integer productID, String username, Integer userid) {
        ProductNew productNew = productNewMapper.selectByPrimaryKey(productID);
        productNew.setStatus(4);
        productNewMapper.updateByPrimaryKeySelective(productNew);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject delete(Integer productID) {
        productNewMapper.deleteByPrimaryKey(productID);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject listProduct(Integer pageSize, Integer pageNum, String cnName, Integer status) {
        int start = 0;
        if (pageNum != 0) {
            start = (pageNum - 1) * pageSize;
        }
        List<ProductNew> maps = productNewMapper.listProduct(start, pageSize, cnName, status);
        Integer count = productNewMapper.queryProductCount(cnName, status);
        JSONObject requestjson = new JSONObject();
        requestjson.put("pageRow", pageSize);
        return CommonUtil.successPage(requestjson, maps, count);
    }

    @Override
    public JSONObject add(ProductNew productNew, Integer userid, String username) {
        productNew.setUserid(userid);
        productNew.setUsername(username);
        productNew.setStatus(1);
        productNewMapper.insertSelective(productNew);
        return CommonUtil.successJson();
    }

    @Override
    public ProductNew getById(Integer productID) {
        return productNewMapper.selectByPrimaryKey(productID);
    }
}
