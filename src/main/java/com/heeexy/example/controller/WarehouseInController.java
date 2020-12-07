package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.*;
import com.heeexy.example.service.WarehouseInService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.ExcelUtils;
import com.heeexy.example.util.constants.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/warehouseIn")
public class WarehouseInController {
    @Autowired
    WarehouseInService warehouseInService;

    @RequestMapping("/list")
    public JSONObject WarehouseInList(@RequestBody Map<String, Object> params) {
        List<String> time = (List<String>) params.get("time");
        String startday = null;
        String endday = null;
        if (time != null && time.size() > 1) {
            startday = time.get(0);
            endday = time.get(1);
        }
        String purchaseNum = null;
        String inNum = null;
        if (!StringUtils.isEmpty(params.get("purchaseNum"))) {
            purchaseNum = (String) params.get("purchaseNum");
        }
        if (!StringUtils.isEmpty(params.get("inNum"))) {
            inNum = (String) params.get("inNum");
        }
        Integer pageSize = (Integer) params.get("pageRow");
        Integer pageNum = (Integer) params.get("pageNum");
        Integer status = null;
        Long warehouseID = null;
        Long userID = null;
        String headwayType = null;
        if (!StringUtils.isEmpty(params.get("status"))) {
            status = Integer.valueOf(params.get("status").toString());
        }
        if (!StringUtils.isEmpty(params.get("warehouseid"))) {
            warehouseID = Long.valueOf(params.get("warehouseid").toString());
        }
        if (!StringUtils.isEmpty(params.get("userID"))) {
            userID = Long.valueOf(params.get("userID").toString());
        }
        if (!StringUtils.isEmpty(params.get("headwayType"))) {
            headwayType = params.get("headwayType").toString();
        }

        return warehouseInService.listWarehouseIn(pageSize, pageNum, purchaseNum, inNum, startday, endday, status, warehouseID, userID, headwayType);
    }

    @RequiresPermissions("warehouseIn:update")
    @PostMapping("/update")
    public JSONObject updateWarehouseIn(@RequestBody WarehouseInWarrant warehouseInWarrant) {
        return warehouseInService.save(warehouseInWarrant, warehouseInWarrant.getSkus());
    }

    @RequiresPermissions("warehouseIn:add")
    @PostMapping("/add")
    public JSONObject addWarehouseIn(@RequestBody WarehouseInWarrant warehouseInWarrant) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return warehouseInService.add(warehouseInWarrant, userid, username);
    }


    @RequiresPermissions("warehouseIn:submit")
    @GetMapping("/submit")
    public JSONObject submitWarehouseIn(@RequestParam Integer inID) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return warehouseInService.submit(inID, username, userid);
    }

    @RequiresPermissions("warehouseIn:verify")
    @GetMapping("/verify")
    public JSONObject verifyWarehouseIn(@RequestParam Integer inID) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return warehouseInService.verify(inID, username, userid);
    }

    @RequiresPermissions("warehouseIn:reject")
    @GetMapping("/reject")
    public JSONObject rejectWarehouseIn(@RequestParam Integer inID) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return warehouseInService.reject(inID, username, userid);
    }

    @RequiresPermissions("warehouseIn:delete")
    @GetMapping("/delete")
    public JSONObject deleteWarehouseIn(@RequestParam Integer inID) {
        return warehouseInService.delete(inID);
    }


    @PostMapping("/searchAllInByProduct")
    public JSONObject searchAllInByProduct(@RequestBody List<Product> productlist) {
        return warehouseInService.searchAllInByProduct(productlist);
    }

    @GetMapping("/listAllInProduct")
    public JSONObject listAllInProduct() {
        return warehouseInService.listAllInProduct();
    }

    @RequestMapping("/excel")
    public void excel(@RequestBody Map<String, Object> params, HttpServletResponse response) throws IOException {
        List<String> time = (List<String>) params.get("time");
        String startday = null;
        String endday = null;
        if (time != null && time.size() > 1) {
            startday = time.get(0);
            endday = time.get(1);
        }
        String purchaseNum = null;
        String inNum = null;
        if (!StringUtils.isEmpty(params.get("purchaseNum"))) {
            purchaseNum = (String) params.get("purchaseNum");
        }
        if (!StringUtils.isEmpty(params.get("inNum"))) {
            inNum = (String) params.get("inNum");
        }
        Integer status = null;
        Long warehouseID = null;
        Long userID = null;
        String headwayType = null;
        if (!StringUtils.isEmpty(params.get("status"))) {
            status = Integer.valueOf(params.get("status").toString());
        }
        if (!StringUtils.isEmpty(params.get("warehouseid"))) {
            warehouseID = Long.valueOf(params.get("warehouseid").toString());
        }
        if (!StringUtils.isEmpty(params.get("userID"))) {
            userID = Long.valueOf(params.get("userID").toString());
        }
        if (!StringUtils.isEmpty(params.get("headwayType"))) {
            headwayType = params.get("headwayType").toString();
        }
        List<WarehouseInWarrant> warehouseInWarrants=warehouseInService.excel( purchaseNum, inNum, startday, endday, status, warehouseID, userID, headwayType);
        ExcelUtils.exportExcel(warehouseInWarrants, "入库单", "入库单", WarehouseInWarrant.class, "入库单明细", true, response);
    }
}
