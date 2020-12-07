package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.FinanceReceipt;
import com.heeexy.example.service.ReceiptService;
import com.heeexy.example.util.constants.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/receipt")
public class ReceiptController {
    @Autowired
    ReceiptService receiptService;

    @RequiresPermissions("receipt:list")
    @PostMapping("/list")
    public JSONObject listReceipt(@RequestBody Map<String, Object> params) {
        String purchaseNum = null;
        String receiptNum = null;
        if (!StringUtils.isEmpty(params.get("purchaseNum"))) {
            purchaseNum = (String) params.get("purchaseNum");
        }
        if (!StringUtils.isEmpty(params.get("receiptNum"))) {
            receiptNum = (String) params.get("receiptNum");
        }
        Integer pageSize = (Integer) params.get("pageRow");
        Integer pageNum = (Integer) params.get("pageNum");
        Integer status = null;
        if (!StringUtils.isEmpty(params.get("status"))) {
            status = Integer.valueOf(params.get("status").toString());
        }
        return receiptService.listReceipt(pageSize, pageNum, purchaseNum, receiptNum, status);
    }

    @RequiresPermissions("receipt:add")
    @PostMapping("/add")
    public JSONObject addReceipt(@RequestBody FinanceReceipt financeReceipt) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return receiptService.createReceipt(financeReceipt, financeReceipt.getSkus(), userid);
    }


    @RequiresPermissions("receipt:update")
    @PostMapping("/update")
    public JSONObject updateReceipt(@RequestBody FinanceReceipt financeReceipt) {
        return receiptService.save(financeReceipt, financeReceipt.getSkus());
    }


    @RequiresPermissions("receipt:submit")
    @GetMapping("/submit")
    public JSONObject submitReceipt(@RequestParam Integer receiptID) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return receiptService.submit(receiptID, username, userid);
    }

    @RequiresPermissions("receipt:verify")
    @GetMapping("/verify")
    public JSONObject verifyReceipt(@RequestParam Integer receiptID) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return receiptService.verify(receiptID, username, userid);
    }

    @RequiresPermissions("receipt:reject")
    @GetMapping("/reject")
    public JSONObject rejectReceipt(@RequestParam Integer receiptID) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return receiptService.reject(receiptID, username, userid);
    }

    @RequiresPermissions("receipt:delete")
    @GetMapping("/delete")
    public JSONObject deleteReceipt(@RequestParam Integer receiptID) {
        return receiptService.delete(receiptID);
    }

    @GetMapping("/confirmMoney")
    public JSONObject confirmMoney(@RequestParam Integer receiptID) {
        return receiptService.confirmMoney(receiptID);
    }

}
