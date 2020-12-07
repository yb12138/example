package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.AlgorithmicruleMapper;
import com.heeexy.example.model.Algorithmicrule;
import com.heeexy.example.model.AlgorithmicruleExample;
import com.heeexy.example.service.AlgorithmicruleService;
import com.heeexy.example.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlgorithmicruleServiceImpl implements AlgorithmicruleService {
    @Autowired
    AlgorithmicruleMapper algorithmicruleMapper;

    @Override
    public JSONObject getData(Long id) {
        AlgorithmicruleExample example = new AlgorithmicruleExample();
        example.createCriteria().andWarehouseidEqualTo(id);
        List<Algorithmicrule> algorithmicrules = algorithmicruleMapper.selectByExample(example);
        return CommonUtil.successJson(algorithmicrules.get(0));
    }

    @Override
    public JSONObject updateAlgo(Algorithmicrule algorithmicrule) {
        algorithmicruleMapper.updateByPrimaryKey(algorithmicrule);
        return CommonUtil.successJson();
    }
}
