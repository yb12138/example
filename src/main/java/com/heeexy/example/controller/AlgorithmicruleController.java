package com.heeexy.example.controller;


import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.ExchangerateMapper;
import com.heeexy.example.model.Algorithmicrule;
import com.heeexy.example.model.Exchangerate;
import com.heeexy.example.service.AlgorithmicruleService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.constants.ErrorEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/algo")
public class AlgorithmicruleController {
    @Autowired
    AlgorithmicruleService algorithmicruleService;
    @Autowired
    ExchangerateMapper exchangerateMapper;


    @GetMapping("/list")
    public JSONObject getData(@RequestParam("ID") Long ID) {
        return algorithmicruleService.getData(ID);
    }

    @PostMapping("/update")
    public JSONObject update(@RequestBody Algorithmicrule algorithmicrule) {
        return algorithmicruleService.updateAlgo(algorithmicrule);
    }

    @PostMapping("/rateUpdate")
    public JSONObject updateRate(@RequestBody Exchangerate exchangerate) {
        exchangerateMapper.updateByPrimaryKeySelective(exchangerate);
        return CommonUtil.successJson();
    }

    @GetMapping("/searchRate")
    public JSONObject searchRate(@RequestParam String gbp) {
        if (gbp == null) {
            return CommonUtil.errorJson(ErrorEnum.E_90003);
        }
        Exchangerate exchangerate = exchangerateMapper.selectByPrimaryKey(gbp);
        return CommonUtil.successJson(exchangerate);
    }

}
