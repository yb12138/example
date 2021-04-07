package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.*;
import com.heeexy.example.model.*;
import com.heeexy.example.service.*;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.constants.ErrorEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;
    @Autowired
    ProductCountryMapper productCountryMapper;
    @Autowired
    PurchaseService purchaseService;
    @Autowired
    WarehouseInService warehouseInService;
    @Autowired
    ProductSellService productSellService;
    @Autowired
    ProductSellMapper productSellMapper;
    @Autowired
    WarnInfoService warnInfoService;
    @Autowired
    ProductWarehouseStorageMapper productWarehouseStorageMapper;


    @Override
    public JSONObject queryProductInfo(Integer pageNo, Integer pageSize, String sku, String name, Long warehouseid, String country) {
        int start = 0;
        if (pageNo != 0) {
            start = (pageNo - 1) * pageSize;
        }
        List<Product> maps = productMapper.queryProduct(start, pageSize, name, sku, country, warehouseid);
        for (Product product : maps) {
            Integer id = product.getProductid();
            ProductSell productSell = productSellMapper.selectByPrimaryKey(id);
            product.setProductSell(productSell);
            ProductCountryExample countryExample = new ProductCountryExample();
            countryExample.createCriteria().andProductidEqualTo(id).andCountrycodeNotEqualTo("CN");
            List<ProductCountry> countries = productCountryMapper.selectByExample(countryExample);
            product.setCountries(countries);
        }
        Integer count = productMapper.queryProductCount(name, sku, country, warehouseid);
        JSONObject requestjson = new JSONObject();
        requestjson.put("pageRow", pageSize);
        return CommonUtil.successPage(requestjson, maps, count);
    }

    @Override
    public JSONObject queryAllProduct() {
        ProductExample example = new ProductExample();
        example.createCriteria().andProductidIsNotNull();
        List<Product> list = productMapper.selectByExample(example);
        Map<String, Object> map = new HashMap<>();
        map.put("list", list);
        return CommonUtil.successJson(map);
    }

    @Override
    public Product queryBySku(String sku) {
        return productMapper.queryBySku(sku);
    }

    @Override
    public Integer getCount() {
        return productMapper.queryProductCount(null, null, null, null);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject update(Product product, List<ProductCountry> productCountries, ProductSell productSell) {
        if (product.getWarehouseid() == 0) {
            product.setWarehouseid(null);
        }
        if (product.getCost()==null){
            return CommonUtil.errorJson(ErrorEnum.E_100017);
        }
        productMapper.updateByPrimaryKeySelective(product);
        for (ProductCountry productCountry : productCountries) {
            if (productCountry.getPcid() != null) {
                productCountryMapper.updateByPrimaryKeySelective(productCountry);
            } else {
                //如果没有主键id，检查该产品是否有该国家，若没有则新增
                ProductCountryExample example = new ProductCountryExample();
                example.createCriteria().andProductidEqualTo(product.getProductid()).andCountrycodeEqualTo(productCountry.getCountrycode());
                List<ProductCountry> countries = productCountryMapper.selectByExample(example);
                if (countries == null || countries.size() == 0) {
                    productCountry.setProductid(product.getProductid());
                    productCountryMapper.insertSelective(productCountry);
                } else if (countries.size() == 1) {
                    ProductCountry productCountry1 = countries.get(0);
                    productCountry.setPcid(productCountry1.getPcid());
                    productCountryMapper.updateByPrimaryKeySelective(productCountry);
                } else {
                    productCountryMapper.deleteByExample(example);
                    productCountryMapper.insertSelective(productCountry);
                }
            }
        }
        ProductWarehouseStorage warehouseStorage=productWarehouseStorageMapper.selectByPrimaryKey(product.getProductid());
        if(warehouseStorage==null){
            warehouseStorage=new ProductWarehouseStorage();
            warehouseStorage.setProductid(product.getProductid());
            warehouseStorage.setWarehouseid(product.getWarehouseid());
            warehouseStorage.setWarehousename(product.getWarehousename());
            warehouseStorage.setSkucode(product.getSkucode());
            warehouseStorage.setOnpurchase(0);
            warehouseStorage.setOnway(0);
            warehouseStorage.setOnsell(0);
            warehouseStorage.setOncnwarehouse(0);
            productWarehouseStorageMapper.insertSelective(warehouseStorage);
        }else {
            warehouseStorage.setProductid(product.getProductid());
            warehouseStorage.setWarehouseid(product.getWarehouseid());
            warehouseStorage.setWarehousename(product.getWarehousename());
            warehouseStorage.setSkucode(product.getSkucode());
            productWarehouseStorageMapper.updateByPrimaryKeySelective(warehouseStorage);
        }
        productSellMapper.updateByPrimaryKeySelective(productSell);
        return CommonUtil.successJson();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject insert(Product product, List<ProductCountry> productCountries, ProductSell productSell) {
        String sku = product.getSkucode();
        Product tempproduct = productMapper.queryBySku(sku);
        if (product.getWarehouseid() == 0) {
            return CommonUtil.errorJson(ErrorEnum.E_100016);
        }
        if(product.getCost()==null){
            return CommonUtil.errorJson(ErrorEnum.E_100017);
        }
        if (tempproduct != null) {
            return CommonUtil.errorJson(ErrorEnum.E_100012);
        }
        product.setIsnew("Y");
        if (product.getBranded() == null || product.getBranded().equals("")) {
            product.setBranded("N");
        }
        if (product.getBattery() == null || product.getBattery().equals("")) {
            product.setBattery("N");
        }
        if (product.getIsplus() == null || product.getIsplus().equals("")) {
            product.setIsplus("N");
        }
        productMapper.insertSelective(product);
        Integer id = product.getProductid();

        for (ProductCountry productCountry : productCountries) {
            productCountry.setProductid(id);
            productCountryMapper.insertSelective(productCountry);
        }
        productSell.setProductid(id);
        productSellMapper.insertSelective(productSell);
        if (product.getProductlevel().equals("在售")) {
            //生成补货信息
            warnInfoService.generateNewWaran(product);
        }
        return CommonUtil.successJson();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject delete(Integer productID) {
        List<PurchaseSku> skus = purchaseService.queryByID(productID);
        if (skus != null && skus.size() > 0) {
            return CommonUtil.errorJson(ErrorEnum.E_100007);
        }
        List<WarehouseInWarrantSku> skuList = warehouseInService.getSkuByID(productID);
        if (skuList != null && skuList.size() > 0) {
            return CommonUtil.errorJson(ErrorEnum.E_100008);
        }
        productSellService.deleteSell(productID);
        productMapper.deleteByPrimaryKey(productID);
        ProductCountryExample countryExample = new ProductCountryExample();
        countryExample.createCriteria().andProductidEqualTo(productID);
        productCountryMapper.deleteByExample(countryExample);
        warnInfoService.delete(productID);
        return CommonUtil.successJson();
    }

    @Override
    public List<Product> exportAll() {
        ProductExample example = new ProductExample();
        example.createCriteria().andProductidIsNotNull();
        return productMapper.selectByExample(example);
    }

}
