package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.Purchase;
import com.heeexy.example.model.WarehouseInWarrant;
import com.heeexy.example.model.WarehouseOutWarrant;
import com.heeexy.example.service.WarehouseInService;
import com.heeexy.example.service.WarehouseOutService;
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
@RequestMapping("/warehouseOut")
public class WarehouseOutController {
    @Autowired
    WarehouseOutService warehouseOutService;

    @RequestMapping("/list")
    public JSONObject WarehouseOutList(@RequestBody Map<String, Object> params) {
        List<String> time = (List<String>) params.get("time");
        String startday = null;
        String endday = null;
        if (time != null && time.size() > 1) {
            startday = time.get(0);
            endday = time.get(1);
        }
        String sku = null;
        String outNum = null;
        if (!StringUtils.isEmpty(params.get("sku"))) {
            sku = (String) params.get("sku");
        }
        if (!StringUtils.isEmpty(params.get("outNum"))) {
            outNum = (String) params.get("outNum");
        }
        Integer pageSize = (Integer) params.get("pageRow");
        Integer pageNum = (Integer) params.get("pageNum");
        Integer status = null;
        String cnWarehouseName = null;
        if (!StringUtils.isEmpty(params.get("status"))) {
            status = Integer.valueOf(params.get("status").toString());
        }
        if (!StringUtils.isEmpty(params.get("cnWarehouseName"))) {
            cnWarehouseName = params.get("cnWarehouseName").toString();
        }
        return warehouseOutService.listWarehouseOut(pageSize, pageNum, sku, outNum, startday, endday, status, cnWarehouseName);
    }

    @RequiresPermissions("warehouseOut:update")
    @PostMapping("/update")
    public JSONObject updateWarehouseOut(@RequestBody WarehouseOutWarrant warehouseOutWarrant) {
        return warehouseOutService.save(warehouseOutWarrant, warehouseOutWarrant.getSkus());
    }

    @RequiresPermissions("warehouseOut:add")
    @PostMapping("/add")
    public JSONObject addWarehouseOut(@RequestBody WarehouseOutWarrant warehouseOutWarrant) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return warehouseOutService.add(warehouseOutWarrant, userid, username);
    }


    @RequiresPermissions("warehouseOut:submit")
    @GetMapping("/submit")
    public JSONObject submitWarehouseOut(@RequestParam Integer outID) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return warehouseOutService.submit(outID);
    }

    @RequiresPermissions("warehouseOut:verify")
    @GetMapping("/verify")
    public JSONObject verifyWarehouseOut(@RequestParam Integer outID) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return warehouseOutService.verify(outID, userid, username);
    }

    @RequiresPermissions("warehouseOut:reject")
    @GetMapping("/reject")
    public JSONObject rejectWarehouseOut(@RequestParam Integer outID) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return warehouseOutService.reject(outID);
    }

    @RequiresPermissions("warehouseOut:delete")
    @GetMapping("/delete")
    public JSONObject deleteWarehouseOut(@RequestParam Integer outID) {
        return warehouseOutService.delete(outID);
    }

    @RequestMapping("/excel")
    public void excelWarehouseOutList(@RequestBody Map<String, Object> params, HttpServletResponse response) throws IOException {
        List<String> time = (List<String>) params.get("time");
        String startday = null;
        String endday = null;
        if (time != null && time.size() > 1) {
            startday = time.get(0);
            endday = time.get(1);
        }
        String sku = null;
        String outNum = null;
        if (!StringUtils.isEmpty(params.get("sku"))) {
            sku = (String) params.get("sku");
        }
        if (!StringUtils.isEmpty(params.get("outNum"))) {
            outNum = (String) params.get("outNum");
        }
        Integer status = null;
        String cnWarehouseName = null;
        if (!StringUtils.isEmpty(params.get("status"))) {
            status = Integer.valueOf(params.get("status").toString());
        }
        if (!StringUtils.isEmpty(params.get("cnWarehouseName"))) {
            cnWarehouseName = params.get("cnWarehouseName").toString();
        }
        List<WarehouseOutWarrant> warehouseOutWarrants = warehouseOutService.listWarehouseOutSkus(sku, outNum, startday, endday, status, cnWarehouseName);
        ExcelUtils.exportExcel(warehouseOutWarrants, "出库单", "出库单", WarehouseOutWarrant.class, "出库单明细", true, response);
    }


}
