package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.AlloOut;
import com.heeexy.example.model.Purchase;
import com.heeexy.example.service.AlloOutService;
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
@RequestMapping("/allo")
public class AlloOutController {

    @Autowired
    AlloOutService alloOutService;

    @RequestMapping("/list")
    public JSONObject AlloList(@RequestBody Map<String, Object> params) {
        List<String> createTime = (List<String>) params.get("createTime");
        List<String> arriveTime = (List<String>) params.get("arriveTime");
        String create_Start = null;
        String create_End = null;
        String arrive_Start = null;
        String arrive_End = null;
        if (createTime != null && createTime.size() > 1) {
            create_Start = createTime.get(0);
            create_End = createTime.get(1);
        }
        if (arriveTime != null && arriveTime.size() > 1) {
            arrive_Start = arriveTime.get(0);
            arrive_End = arriveTime.get(1);
        }
        String warehouseOrder = null;
        Long warehouseID = null;
        String sku = null;
        if (!StringUtils.isEmpty(params.get("warehouseOrder"))) {
            warehouseOrder = (String) params.get("warehouseOrder");
        }
        if (!StringUtils.isEmpty(params.get("warehouseID"))) {
            warehouseID = Long.valueOf(params.get("warehouseID").toString());
        }
        if (!StringUtils.isEmpty(params.get("sku"))) {
            sku = params.get("sku").toString();
        }
        Integer pageSize = (Integer) params.get("pageRow");
        Integer pageNum = (Integer) params.get("pageNum");
        Integer status = null;
        if (!StringUtils.isEmpty(params.get("status"))) {
            status = Integer.valueOf(params.get("status").toString());
        }
        return alloOutService.listAllOut(pageSize, pageNum, warehouseOrder, warehouseID, create_Start, create_End, arrive_Start, arrive_End, status, sku);
    }

    @RequiresPermissions("allOut:update")
    @PostMapping("/update")
    public JSONObject updateAllo(@RequestBody AlloOut alloOut) {
        return alloOutService.save(alloOut, alloOut.getSkus());
    }

    /**
     * 退货重新上架
     */
    @RequiresPermissions("allOut:add")
    @PostMapping("/add")
    public JSONObject addAllo(@RequestBody AlloOut alloOut) {
        return alloOutService.review(alloOut, alloOut.getSkus());
    }

    /**
     * 新增上架数目
     */
    @RequiresPermissions("allOut:add")
    @PostMapping("/review")
    public JSONObject reviewAllo(@RequestBody AlloOut alloOut) {
        return alloOutService.review(alloOut, alloOut.getSkus());
    }


    @RequiresPermissions("allOut:submit")
    @GetMapping("/submit")
    public JSONObject submitAllo(@RequestParam Integer alloid) {
        return alloOutService.submit(alloid);
    }

    @RequiresPermissions("allOut:verify")
    @GetMapping("/verify")
    public JSONObject verifyAllo(@RequestParam Integer alloid) {
        return alloOutService.verify(alloid);
    }

    @RequiresPermissions("allOut:reject")
    @GetMapping("/reject")
    public JSONObject rejectAllo(@RequestParam Integer alloid) {
        return alloOutService.reject(alloid);
    }

    @RequiresPermissions("allOut:delete")
    @GetMapping("/delete")
    public JSONObject deleteAllo(@RequestParam Integer alloid) {
        return alloOutService.delete(alloid);
    }

    @RequestMapping("/excel")
    public void excelAlloList(@RequestBody Map<String, Object> params, HttpServletResponse response) {
        List<String> createTime = (List<String>) params.get("createTime");
        List<String> arriveTime = (List<String>) params.get("arriveTime");
        String create_Start = null;
        String create_End = null;
        String arrive_Start = null;
        String arrive_End = null;
        if (createTime != null && createTime.size() > 1) {
            create_Start = createTime.get(0);
            create_End = createTime.get(1);
        }
        if (arriveTime != null && arriveTime.size() > 1) {
            arrive_Start = arriveTime.get(0);
            arrive_End = arriveTime.get(1);
        }
        String warehouseOrder = null;
        Long warehouseID = null;
        if (!StringUtils.isEmpty(params.get("warehouseOrder"))) {
            warehouseOrder = (String) params.get("warehouseOrder");
        }
        if (!StringUtils.isEmpty(params.get("warehouseID"))) {
            warehouseID = Long.valueOf(params.get("warehouseID").toString());
        }
        Integer status = null;
        if (!StringUtils.isEmpty(params.get("status"))) {
            status = Integer.valueOf(params.get("status").toString());
        }
        String sku = null;
        if (!StringUtils.isEmpty(params.get("sku"))) {
            sku = params.get("sku").toString();
        }
        List<AlloOut> alloOuts = alloOutService.excelAllOut(warehouseOrder, warehouseID, create_Start, create_End, arrive_Start, arrive_End, status, sku);
        try {
            ExcelUtils.exportExcel(alloOuts, "海外仓入库单", "海外仓入库单", AlloOut.class, "入库单报表", true, response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
