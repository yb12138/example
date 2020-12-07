package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.Product;
import com.heeexy.example.model.Warninfo;
import com.heeexy.example.service.ProductService;
import com.heeexy.example.service.WarnInfoService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.constants.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/warn")
public class  WarnController {
    @Autowired
    WarnInfoService warnInfoService;

    /**
     * 查询产品列表，分页
     */
    @RequiresPermissions("warn:list")
    @PostMapping("/list")
    public JSONObject list(@RequestBody Map<String, String> map) {
        System.out.println("map:" + map.toString());
        Integer pageNo = Integer.valueOf(map.get("pageNum"));
        Integer pageSize = Integer.valueOf(map.get("pageRow"));
        String sku = map.get("sku");
        String name = map.get("name");
        if (StringUtils.isEmpty(sku)) {
            sku = null;
        }
        if (StringUtils.isEmpty(name)) {
            name = null;
        }
        Long warehouseid = null;
        if (!StringUtils.isEmpty(map.get("warehouseid"))) {
            warehouseid = Long.valueOf(map.get("warehouseid"));
        }
        Integer status = null;
        if (map.get("status") != null) {
            status = Integer.valueOf(map.get("status"));
        }
        return warnInfoService.listWarnInfo(pageSize, pageNo, sku, name, warehouseid, status);
    }

    @RequiresPermissions("warn:update")
    @PostMapping("/update")
    public JSONObject update(@RequestBody Warninfo warninfo) {
        warnInfoService.updateWarn(warninfo);
        return CommonUtil.successJson();
    }

    @RequiresPermissions("warn:verify")
    @GetMapping("/verify")
    public JSONObject verify(@RequestParam Integer productID) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return warnInfoService.verify(productID, username, userid);
    }

    @RequiresPermissions("warn:reject")
    @GetMapping("/reject")
    public JSONObject reject(@RequestParam Integer productID) {
        return warnInfoService.reject(productID);
    }

    @GetMapping("/queryProcessInfo")
    public JSONObject queryProcessInfo(@RequestParam Integer productID) {
        return warnInfoService.queryProcessInfo(productID);
    }

    @RequiresPermissions("warn:synData")
    @RequestMapping("/synData")
    public JSONObject synData() {
        return warnInfoService.updateWarnInfo();
    }
}
