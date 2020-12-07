package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.ProductMapper;
import com.heeexy.example.dao.ProductMotherCodeMapper;
import com.heeexy.example.model.Product;
import com.heeexy.example.model.ProductExample;
import com.heeexy.example.model.ProductMotherCode;
import com.heeexy.example.model.ProductMotherCodeExample;
import com.heeexy.example.service.MotherService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.constants.ErrorEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotherServiceImpl implements MotherService {
    @Autowired
    ProductMotherCodeMapper productMotherCodeMapper;
    @Autowired
    ProductMapper productMapper;

    @Override
    public JSONObject listMother(int pageSize, int pageNum, String mname) {
        int start = 0;
        if (pageNum != 0) {
            start = (pageNum - 1) * pageSize;
        }
        List<ProductMotherCode> motherCodes = productMotherCodeMapper.getMothers(start, pageSize, mname);
        for (ProductMotherCode motherCode : motherCodes) {
            Integer mid = motherCode.getMid();
            ProductExample productExample = new ProductExample();
            productExample.createCriteria().andMidEqualTo(mid);
            List<Product> products = productMapper.selectByExample(productExample);
            motherCode.setProducts(products);
        }
        Integer count = productMotherCodeMapper.getCount(mname);
        JSONObject requestjson = new JSONObject();
        requestjson.put("pageRow", pageSize);
        return CommonUtil.successPage(requestjson, motherCodes, count);
    }

    @Override
    public JSONObject update(ProductMotherCode productMotherCode) {
        productMotherCodeMapper.updateByPrimaryKeySelective(productMotherCode);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject insert(ProductMotherCode productMotherCode) {
        productMotherCodeMapper.insertSelective(productMotherCode);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject delete(Integer motherID) {
        ProductExample productExample = new ProductExample();
        productExample.createCriteria().andMidEqualTo(motherID);
        List<Product> products = productMapper.selectByExample(productExample);
        if (products == null || products.size() == 0) {
            productMotherCodeMapper.deleteByPrimaryKey(motherID);
            return CommonUtil.successJson();
        }
        return CommonUtil.errorJson(ErrorEnum.E_100014);
    }

    @Override
    public JSONObject listAll() {
        ProductMotherCodeExample productMotherCodeExample = new ProductMotherCodeExample();
        productMotherCodeExample.createCriteria().andMidIsNotNull();
        List<ProductMotherCode> motherCodes = productMotherCodeMapper.selectByExample(productMotherCodeExample);
        JSONObject result = CommonUtil.successJson();
        JSONObject info = new JSONObject();
        info.put("list", motherCodes);
        result.put("info", info);
        return result;
    }
}
