package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.heeexy.example.dao.ConsignmentMapper;
import com.heeexy.example.model.Consignment;
import com.heeexy.example.model.Product;
import com.heeexy.example.model.ResponseParam;
import com.heeexy.example.service.BirdService;
import com.heeexy.example.service.ProductService;
import com.heeexy.example.service.ProductStorageService;
import com.heeexy.example.util.UserAgentInterceptor;
import com.heeexy.example.util.http.BirdClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
public class BirdServiceImpl implements BirdService {
    @Autowired
    ConsignmentMapper consignmentMapper;
    BirdClient birdClient = new BirdClient();
    @Autowired
    ProductService productService;
    @Autowired
    ProductStorageService productStorageService;

    @Override
    public void generateBirdInOrderSku() {
        JSONObject jsonObject = new JSONObject();
        ResponseParam responseParam = birdClient.post(jsonObject);
        List<JSONObject> orders = responseParam.getData();
        if (orders != null) {
            for (JSONObject object : orders) {
                Consignment datacaciquesOrder = JSON.parseObject(object.toJSONString(), new TypeReference<Consignment>() {
                });
                Long id = datacaciquesOrder.getId();
                JSONObject object1 = new JSONObject();
                object1.put("consignment_id", id);
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.setInterceptors(Collections.singletonList(new UserAgentInterceptor()));
                String url = "https://www.birdsystem.co.uk/client/consignment-product?consignment_id=" + id;
                String result = restTemplate.getForObject(url
                        , String.class);
                ResponseParam responseParam2 = JSON.parseObject(result, new TypeReference<ResponseParam>() {
                });
                List<JSONObject> objects = responseParam2.getData();
                if (objects != null && objects.size() > 0) {
                    for (int i = 0; i < objects.size(); i++) {
                        JSONObject product = objects.get(i);
                        String sku = product.getString("product-client_ref");
                        int quantity = product.getInteger("quantity");
                        datacaciquesOrder.setQuantity(quantity);
                        datacaciquesOrder.setProductClientRef(sku);
                        Consignment consignment = consignmentMapper.selectByPrimaryKey(id);
                        if (consignment == null) {
                            if (datacaciquesOrder.getTotalHandlingFee() != 0) {
                                Product product1 = productService.queryBySku(sku);
                                if (product1 != null) {
                                    productStorageService.min(product1.getProductid(), quantity, 4, true);
                                }
                            }
                            consignmentMapper.insertSelective(datacaciquesOrder);
                        } else {
                            consignmentMapper.updateByPrimaryKeySelective(datacaciquesOrder);
                        }
                    }
                }
            }
        }
    }
}
