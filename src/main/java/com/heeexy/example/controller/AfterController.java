package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.AfteraccountMapper;
import com.heeexy.example.dao.AftermarketMapper;
import com.heeexy.example.dao.AfterreasonMapper;
import com.heeexy.example.dao.PaypalaccountMapper;
import com.heeexy.example.model.*;
import com.heeexy.example.service.AfterService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.ExcelUtils;
import com.heeexy.example.util.constants.ErrorEnum;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/after")
public class AfterController {

    @Autowired
    AfterService afterService;
    @Autowired
    AfteraccountMapper afteraccountMapper;
    @Autowired
    AfterreasonMapper afterreasonMapper;
    @Autowired
    PaypalaccountMapper paypalaccountMapper;

    /**
     * 查询产品列表，分页
     */
    @RequiresPermissions("after:list")
    @PostMapping("/list")
    public JSONObject list(@RequestBody Map<String, Object> map) {
        System.out.println("map:" + map.toString());
        Integer pageNo = (Integer) map.get("pageNum");
        Integer pageSize = (Integer) map.get("pageRow");
        String sku = null;
        String order = null;
        if (!StringUtils.isEmpty(map.get("sku"))) {
            sku = (String) map.get("sku");
        }
        if (!StringUtils.isEmpty(map.get("order"))) {
            order = (String) map.get("order");
        }
        List<String> time = null;
        if (!StringUtils.isEmpty(map.get("time"))) {
            time = (List<String>) map.get("time");
        }
        String startday = null;
        String endday = null;
        if (time != null && time.size() > 1) {
            startday = time.get(0);
            endday = time.get(1);
        }
        return afterService.listAfterReason(pageNo, pageSize, sku, order, startday, endday);
    }

    @RequiresPermissions("after:insert")
    @PostMapping("/insert")
    public JSONObject insert(@RequestBody Aftermarket aftermarket) {
        return afterService.insert(aftermarket);
    }

    @RequiresPermissions("after:update")
    @PostMapping("/update")
    public JSONObject update(@RequestBody Aftermarket aftermarket) {
        return afterService.update(aftermarket);
    }

    @RequiresPermissions("after:delete")
    @PostMapping("/delete")
    public JSONObject delete(@RequestBody Aftermarket aftermarket) {
        return afterService.delete(aftermarket);
    }

    @RequiresPermissions("after:excel")
    @PostMapping("/excel")
    public void excel(@RequestBody Map<String, Object> map, HttpServletResponse response) throws IOException {
        String sku = null;
        String order = null;
        if (!StringUtils.isEmpty(map.get("sku"))) {
            sku = (String) map.get("sku");
        }
        if (!StringUtils.isEmpty(map.get("order"))) {
            order = (String) map.get("order");
        }
        String startday = null;
        String endday = null;
        List<String> time = null;
        if (!StringUtils.isEmpty(map.get("time"))) {
            time = (List<String>) map.get("time");
        }
        if (time != null && time.size() > 1) {
            startday = time.get(0);
            endday = time.get(1);
        }
        List<Aftermarket> aftermarkets = afterService.exportAll(sku, order, startday, endday);
        ExcelUtils.exportExcel(aftermarkets, null, "售后管理", Aftermarket.class, "售后管理表", true, response);

    }

    @RequiresPermissions("after:excel")
    @PostMapping("/collect")
    public void collect(@RequestBody Map<String, Object> map, HttpServletResponse response) throws IOException {
        String sku = null;
        String order = null;
        if (!StringUtils.isEmpty(map.get("sku"))) {
            sku = (String) map.get("sku");
        }
        if (!StringUtils.isEmpty(map.get("order"))) {
            order = (String) map.get("order");
        }
        String startday = null;
        String endday = null;
        List<String> time = null;
        if (!StringUtils.isEmpty(map.get("time"))) {
            time = (List<String>) map.get("time");
        }
        if (time != null && time.size() > 1) {
            startday = time.get(0);
            endday = time.get(1);
        }
        List<AfterCollect> aftermarkets = afterService.collect(sku, order, startday, endday);
        ExcelUtils.exportExcel(aftermarkets, "售后汇总表格", "售后汇总", AfterCollect.class, "售后汇总表", false, response);
    }

    @GetMapping("/reasons")
    public JSONObject getAllReasons() {
        AfterreasonExample example = new AfterreasonExample();
        example.createCriteria().andReasonidIsNotNull();
        List<Afterreason> afterreasons = afterreasonMapper.selectByExample(example);
        return CommonUtil.successJson(afterreasons);
    }

    @GetMapping("/accounts")
    public JSONObject getAllAccounts() {
        AfteraccountExample example = new AfteraccountExample();
        example.createCriteria().andAccountidIsNotNull();
        List<Afteraccount> afteraccounts = afteraccountMapper.selectByExample(example);
        return CommonUtil.successJson(afteraccounts);
    }

    @GetMapping("/paypals")
    public JSONObject getPaypals() {
        PaypalaccountExample example = new PaypalaccountExample();
        example.createCriteria().andPayaccountIsNotNull();
        List<Paypalaccount> afteraccounts = paypalaccountMapper.selectByExample(example);
        return CommonUtil.successJson(afteraccounts);
    }

    @PostMapping("/inport")
    public JSONObject inport(@RequestParam("file") MultipartFile excel) {
        if (excel.isEmpty()) {
            return CommonUtil.errorJson(ErrorEnum.E_90003);
        }
        afterService.upload(excel);
        return CommonUtil.successJson();
    }
}
