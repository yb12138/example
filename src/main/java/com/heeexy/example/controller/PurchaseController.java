package com.heeexy.example.controller;


import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.PurchaseSkuMapper;
import com.heeexy.example.model.*;
import com.heeexy.example.service.PurchaseService;
import com.heeexy.example.service.TrackService;
import com.heeexy.example.util.CommonUtil;

import com.heeexy.example.util.ExcelUtils;
import com.heeexy.example.util.constants.Constants;
import com.heeexy.example.util.constants.ErrorEnum;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    @Autowired
    PurchaseService purchaseService;
    @Autowired
    PurchaseSkuMapper purchaseSkuMapper;
    @Autowired
    TrackService trackService;

    @RequiresPermissions("purchase:list")
    @PostMapping("/list")
    public JSONObject listpurchase(@RequestBody Map<String, Object> params) {
        String purchaseNum = (String) params.get("purchaseNum");
        String sku = (String) params.get("sku");
        List<String> time = (List<String>) params.get("time");
        String startday = null;
        String endday = null;
        if (time != null && time.size() > 1) {
            startday = time.get(0);
            endday = time.get(1);
        }
        String cnName = (String) params.get("cnName");
        Long warehouseid = null;
        if (!StringUtils.isEmpty(params.get("warehouseId"))) {
            warehouseid = Long.valueOf((String) params.get("warehouseId"));
        }
        Integer pageSize = (Integer) params.get("pageRow");
        Integer pageNum = (Integer) params.get("pageNum");
        Integer purchaseStatus = null;
        if (!StringUtils.isEmpty(params.get("purchaseStatus"))) {
            purchaseStatus = Integer.valueOf(params.get("purchaseStatus").toString());
        }
        Integer warehouseStatus = null;
        if (!StringUtils.isEmpty(params.get("warehouseStatus"))) {
            warehouseStatus = Integer.valueOf(params.get("warehouseStatus").toString());
        }
        Integer financeStatus = null;
        if (!StringUtils.isEmpty(params.get("financeStatus"))) {
            financeStatus = Integer.valueOf(params.get("financeStatus").toString());
        }
        Integer cnWarehouseInStatus = null;
        if (!StringUtils.isEmpty(params.get("cnWarehouseInStatus"))) {
            cnWarehouseInStatus = Integer.valueOf(params.get("cnWarehouseInStatus").toString()); //中仓入库状态
        }
        Integer cnWarehouseOutStatus = null;
        if (!StringUtils.isEmpty(params.get("cnWarehouseOutStatus"))) {
            cnWarehouseOutStatus = Integer.valueOf(params.get("cnWarehouseOutStatus").toString()); //中仓入库状态
        }
        return purchaseService.listPurchase(pageSize, pageNum, purchaseNum, sku, startday, endday, cnName, warehouseid, purchaseStatus, warehouseStatus, financeStatus, cnWarehouseInStatus, cnWarehouseOutStatus);
    }

    @RequiresPermissions("purchase:add")
    @PostMapping("/add")
    public JSONObject addpurchase(@RequestBody Map<String, Object> params) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        Integer supplierid = null;
        if (StringUtils.isEmpty(params.get("supplierid"))) {
            return CommonUtil.errorJson(ErrorEnum.E_90003);
        } else {
            supplierid = (Integer) params.get("supplierid");
        }
        String supplierOrderNumber = (String) params.get("supplierOrderNumber");
        String transactionNumber = null;
        if (!StringUtils.isEmpty(params.get("transactionNumber"))) {
            transactionNumber = (String) params.get("transactionNumber");
        }
        Integer purchaseTotalQuantity = null;
        if (!StringUtils.isEmpty(params.get("purchaseTotalQuantity"))) {
            purchaseTotalQuantity = (Integer) params.get("purchaseTotalQuantity");
        } else {
            return CommonUtil.errorJson(ErrorEnum.E_90003);
        }
        Double purchaseTotalAmount = null;
        if (!StringUtils.isEmpty(params.get("purchaseTotalAmount"))) {
            purchaseTotalAmount = Double.valueOf(params.get("purchaseTotalAmount").toString());
        }
        Double freightTotalAmount = null;
        if (!StringUtils.isEmpty(params.get("freightTotalAmount"))) {
            freightTotalAmount = Double.valueOf(params.get("freightTotalAmount").toString());
        }
        String remark = null;
        if (!StringUtils.isEmpty(params.get("remark"))) {
            remark = (String) params.get("remark");
        }
        Long warehouseID = null;
        if (!StringUtils.isEmpty(params.get("warehouseID"))) {
            warehouseID = Long.valueOf(params.get("warehouseID").toString());
        } else {
            return CommonUtil.errorJson(ErrorEnum.E_90003);
        }
        if (params.get("skus") == null) {
            return CommonUtil.errorJson(ErrorEnum.E_90003);
        }
        List<Map<String, Object>> skus = (List<Map<String, Object>>) params.get("skus");
        return purchaseService.addPurchase(supplierid, warehouseID, supplierOrderNumber, transactionNumber, purchaseTotalQuantity, purchaseTotalAmount, freightTotalAmount, remark, skus, userid, username);
    }

    @RequiresPermissions("purchase:update")
    @PostMapping("/update")
    public JSONObject updatepurchase(@RequestBody Map<String, Object> params) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        Integer supplierid = null;
        Integer purchaseid = null;
        if (StringUtils.isEmpty(params.get("purchaseid"))) {
            return CommonUtil.errorJson(ErrorEnum.E_90003);
        } else {
            purchaseid = (Integer) params.get("purchaseid");
        }
        if (StringUtils.isEmpty(params.get("supplierid"))) {
            return CommonUtil.errorJson(ErrorEnum.E_90003);
        } else {
            supplierid = (Integer) params.get("supplierid");
        }
        String supplierOrderNumber = (String) params.get("supplierOrderNumber");
        String transactionNumber = null;
        if (!StringUtils.isEmpty(params.get("transactionNumber"))) {
            transactionNumber = (String) params.get("transactionNumber");
        }
        Integer purchaseTotalQuantity = null;
        if (!StringUtils.isEmpty(params.get("purchaseTotalQuantity"))) {
            purchaseTotalQuantity = (Integer) params.get("purchaseTotalQuantity");
        } else {
            return CommonUtil.errorJson(ErrorEnum.E_90003);
        }
        Double purchaseTotalAmount = null;
        if (!StringUtils.isEmpty(params.get("purchaseTotalAmount"))) {
            purchaseTotalAmount = Double.valueOf(params.get("purchaseTotalAmount").toString());
        }
        Double freightTotalAmount = null;
        if (!StringUtils.isEmpty(params.get("freightTotalAmount"))) {
            freightTotalAmount = Double.valueOf(params.get("freightTotalAmount").toString());
        }
        String remark = null;
        if (!StringUtils.isEmpty(params.get("remark"))) {
            remark = (String) params.get("remark");
        }
        Long warehouseID = null;
        if (!StringUtils.isEmpty(params.get("warehouseID"))) {
            warehouseID = Long.valueOf(params.get("warehouseID").toString());
        } else {
            return CommonUtil.errorJson(ErrorEnum.E_90003);
        }
        if (params.get("skus") == null) {
            return CommonUtil.errorJson(ErrorEnum.E_90003);
        }
        List<Map<String, Object>> skus = (List<Map<String, Object>>) params.get("skus");
        return purchaseService.updatePurchase(supplierid, warehouseID, supplierOrderNumber, transactionNumber, freightTotalAmount, remark, skus, userid, username, purchaseid);
    }

    @RequiresPermissions("purchase:submit")
    @GetMapping("/submit")
    public JSONObject submitPurchase(@RequestParam Integer purchaseid) {
        return purchaseService.submit(purchaseid);
    }

    @RequiresPermissions("purchase:verify")
    @GetMapping("/verify")
    public JSONObject verifyPurchase(@RequestParam Integer purchaseid) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return purchaseService.verify(purchaseid, username, userid);
    }

    @RequiresPermissions("purchase:reject")
    @GetMapping("/reject")
    public JSONObject rejectPurchase(@RequestParam Integer purchaseid) {
        return purchaseService.reject(purchaseid);
    }

    @RequiresPermissions("purchase:delete")
    @GetMapping("/delete")
    public JSONObject listproduct(@RequestParam Integer purchaseid) {

        return purchaseService.delete(purchaseid);
    }

    @GetMapping("/searchByTrack")
    public JSONObject searchByTrack(@RequestParam String trackNum) {
        return trackService.searchTracking(trackNum);
    }

    /**
     * 合并采购单
     */
    @RequestMapping("/conPurchase")
    public JSONObject conPurchase(@RequestBody List<Integer> ids) {
        int mainid = 0;
        for (Integer integer : ids) {
            Purchase purchase = purchaseService.queryDetailByID(integer);
            if (purchase.getPurchasestatus() != 1) {
                return CommonUtil.errorJson(ErrorEnum.E_100009);
            }
        }
        for (Integer integer : ids) {
            if (mainid == 0) {
                mainid = integer;
                continue;
            }
            PurchaseSkuExample example = new PurchaseSkuExample();
            example.createCriteria().andPurchaseidEqualTo(integer);
            List<PurchaseSku> skus = purchaseSkuMapper.selectByExample(example);
            for (PurchaseSku purchaseSku : skus) {
                purchaseSku.setPurchaseid(mainid);
                purchaseSkuMapper.updateByPrimaryKeySelective(purchaseSku);
            }
            purchaseService.delete(integer);
        }
        return CommonUtil.successJson();
    }

    /**
    *  拆分采购单
    * */
    @RequestMapping("/splitPurchase")
    public JSONObject conPurchase(@RequestParam Integer purchaseid) {
        purchaseService.splitPurchase(purchaseid);
        return CommonUtil.successJson();
    }

    @RequiresPermissions("purchase:excel")
    @PostMapping("/excel")
    public void excel(@RequestBody Map<String, Object> params, HttpServletResponse response) throws IOException {
        String purchaseNum = (String) params.get("purchaseNum");
        String sku = (String) params.get("sku");
        List<String> time = (List<String>) params.get("time");
        String startday = null;
        String endday = null;
        if (time != null && time.size() > 1) {
            startday = time.get(0);
            endday = time.get(1);
        }
        String cnName = (String) params.get("cnName");
        Long warehouseid = null;
        if (!StringUtils.isEmpty(params.get("warehouseId"))) {
            warehouseid = Long.valueOf((String) params.get("warehouseId"));
        }
        Integer purchaseStatus = null;
        if (!StringUtils.isEmpty(params.get("purchaseStatus"))) {
            purchaseStatus = Integer.valueOf(params.get("purchaseStatus").toString());
        }
        Integer warehouseStatus = null;
        if (!StringUtils.isEmpty(params.get("warehouseStatus"))) {
            warehouseStatus = Integer.valueOf(params.get("warehouseStatus").toString());
        }
        Integer financeStatus = null;
        if (!StringUtils.isEmpty(params.get("financeStatus"))) {
            financeStatus = Integer.valueOf(params.get("financeStatus").toString());
        }
        Integer cnWarehouseInStatus = null;
        if (!StringUtils.isEmpty(params.get("cnWarehouseInStatus"))) {
            cnWarehouseInStatus = Integer.valueOf(params.get("cnWarehouseInStatus").toString()); //中仓入库状态
        }
        Integer cnWarehouseOutStatus = null;
        if (!StringUtils.isEmpty(params.get("cnWarehouseOutStatus"))) {
            cnWarehouseOutStatus = Integer.valueOf(params.get("cnWarehouseOutStatus").toString()); //中仓入库状态
        }
        List<Purchase> purchases = purchaseService.listAllPurchase(purchaseNum, sku, startday, endday, cnName, warehouseid, purchaseStatus, warehouseStatus, financeStatus, cnWarehouseInStatus, cnWarehouseOutStatus);
        ExcelUtils.exportExcel(purchases, "采购单", "采购单", Purchase.class, "采购报表", true, response);
    }
}
