package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.ProductMapper;
import com.heeexy.example.dao.PurchaseMapper;
import com.heeexy.example.dao.PurchaseSupplierMapper;
import com.heeexy.example.model.*;
import com.heeexy.example.service.SupplierService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.constants.ErrorEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    PurchaseSupplierMapper supplierMapper;
    @Autowired
    ProductMapper productMapper;
    @Autowired
    PurchaseMapper purchaseMapper;

    @Override
    public JSONObject listSupplier(Integer pageNum, Integer pageSize, String name) {
        int start = 0;
        if (pageNum != 0) {
            start = (pageNum - 1) * pageSize;
        }
        List<PurchaseSupplier> maps = supplierMapper.queryAllSupplier(start, pageSize, name);
        Integer count = supplierMapper.getCount(name);
        JSONObject requestjson = new JSONObject();
        requestjson.put("pageRow", pageSize);
        return CommonUtil.successPage(requestjson, maps, count);
    }

    @Override
    public JSONObject listAllSupplier() {
        List<JSONObject> suppliers = supplierMapper.getSuppliers();
        return CommonUtil.successPage(suppliers);
    }

    @Override
    public JSONObject addSupplier(PurchaseSupplier purchaseSupplier, String username, Integer userid) {
        Date date = new Date();
        String supplierName = purchaseSupplier.getSuppliername();
        Integer count = supplierMapper.getSupplierCount(supplierName);
        if (count == null || count == 0) {
            purchaseSupplier.setCreatetime(date);
            purchaseSupplier.setCreateid(userid);
            purchaseSupplier.setUpdatetime(date);
            purchaseSupplier.setCreatename("admin");
            purchaseSupplier.setStatus(3);
            supplierMapper.insertSelective(purchaseSupplier);
            return CommonUtil.successJson();
        } else {
            return CommonUtil.errorJson(ErrorEnum.E_100006);
        }
    }

    @Override
    public JSONObject updateSupplier(PurchaseSupplier purchaseSupplier) {
        Date date = new Date();
        purchaseSupplier.setUpdatetime(date);
        supplierMapper.updateByPrimaryKeySelective(purchaseSupplier);
        return CommonUtil.successJson();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject deleteSupplier(Integer supplierID) {
        PurchaseExample purchaseExample = new PurchaseExample();
        purchaseExample.createCriteria().andSupplieridEqualTo(supplierID);
        List<Purchase> purchases = purchaseMapper.selectByExample(purchaseExample);
        if (purchases != null && purchases.size() > 0) {
            return CommonUtil.errorJson(ErrorEnum.E_100010);
        }
        ProductExample productExample = new ProductExample();
        productExample.createCriteria().andSupplieridEqualTo(supplierID);
        List<Product> products = productMapper.selectByExample(productExample);
        if (products != null && products.size() > 0) {
            return CommonUtil.errorJson(ErrorEnum.E_100011);
        }
        supplierMapper.deleteByPrimaryKey(supplierID);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject listAllSuppliersProduct(int supplierid) {
        ProductExample example = new ProductExample();
        example.createCriteria().andSupplieridEqualTo(supplierid);
        List<Product> products = productMapper.selectByExample(example);
        Map<String, Object> map = new HashMap<>();
        map.put("list", products);
        return CommonUtil.successJson(map);
    }

    @Override
    public PurchaseSupplier searchByName(String name) {

        return supplierMapper.getSupplierByName(name);
    }
}
