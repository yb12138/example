package com.heeexy.example.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.FinancePaymentMapper;
import com.heeexy.example.dao.PurchaseMapper;
import com.heeexy.example.model.FinancePayment;
import com.heeexy.example.model.FinancePaymentExample;
import com.heeexy.example.model.Purchase;
import com.heeexy.example.service.FinanceService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.ExcelUtils;
import com.heeexy.example.util.constants.Constants;
import com.heeexy.example.util.constants.ErrorEnum;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/finance")
public class FinanceController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    FinanceService financeService;
    @Autowired
    PurchaseMapper purchaseMapper;
    @Autowired
    FinancePaymentMapper financePaymentMapper;

    @RequiresPermissions("finance:list")
    @PostMapping("/list")
    public JSONObject listfinance(@RequestBody Map<String, Object> params) {

        List<String> time = (List<String>) params.get("time");
        String startday = null;
        String endday = null;
        if (time != null && time.size() > 1) {
            startday = time.get(0);
            endday = time.get(1);
        }
        String purchaseNum = null;
        String paymentNum = null;
        if (!StringUtils.isEmpty(params.get("purchaseNum"))) {
            purchaseNum = (String) params.get("purchaseNum");
        }
        if (!StringUtils.isEmpty(params.get("paymentNum"))) {
            paymentNum = (String) params.get("paymentNum");
        }
        Integer pageSize = (Integer) params.get("pageRow");
        Integer pageNum = (Integer) params.get("pageNum");
        Integer status = null;
        if (!StringUtils.isEmpty(params.get("status"))) {
            status = Integer.valueOf(params.get("status").toString());
        }
        return financeService.listfinance(pageSize, pageNum, purchaseNum, paymentNum, startday, endday, status);
    }

    @RequiresPermissions("finance:update")
    @PostMapping("/update")
    public JSONObject updateFinance(@RequestBody FinancePayment financePayment) {
        return financeService.save(financePayment);
    }


    @RequiresPermissions("finance:submit")
    @GetMapping("/submit")
    public JSONObject submitFinance(@RequestParam Integer paymentID) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return financeService.submit(paymentID, username, userid);
    }

    @RequiresPermissions("finance:verify")
    @GetMapping("/verify")
    public JSONObject verifyFinance(@RequestParam Integer paymentID) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return financeService.verify(paymentID, username, userid);
    }

    @RequiresPermissions("finance:reject")
    @GetMapping("/reject")
    public JSONObject rejectFinance(@RequestParam Integer paymentID) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        String username = userInfo.getString("username");
        Integer userid = userInfo.getIntValue("userId");
        return financeService.reject(paymentID, username, userid);
    }

    @RequiresPermissions("finance:delete")
    @GetMapping("/delete")
    public JSONObject deleteFinance(@RequestParam Integer paymentID) {

        return financeService.delete(paymentID);
    }

    @RequiresPermissions("finance:update")
    @GetMapping("/confirmMoney")
    public JSONObject confirmMoney(@RequestParam Integer paymentID) {
        return financeService.confirm(paymentID);
    }

    @RequiresPermissions("report:dash")
    @GetMapping("/dashData")
    public JSONObject dashData() {
        String orders = stringRedisTemplate.opsForValue().get("orders");
        String orderamount = stringRedisTemplate.opsForValue().get("orderamount");
        String purchaseamount = stringRedisTemplate.opsForValue().get("purchaseamount");
        JSONObject object = new JSONObject();
        object.put("orders", orders);
        object.put("orderamount", orderamount);
        object.put("purchaseamount", purchaseamount);
        return CommonUtil.successJson(object);
    }

    @PostMapping("/excel")
    public void excelfinance(@RequestBody Map<String, Object> params, HttpServletResponse response) {

        List<String> time = (List<String>) params.get("time");
        String startday = null;
        String endday = null;
        if (time != null && time.size() > 1) {
            startday = time.get(0);
            endday = time.get(1);
        }
        String purchaseNum = null;
        String paymentNum = null;
        if (!StringUtils.isEmpty(params.get("purchaseNum"))) {
            purchaseNum = (String) params.get("purchaseNum");
        }
        if (!StringUtils.isEmpty(params.get("paymentNum"))) {
            paymentNum = (String) params.get("paymentNum");
        }
        Integer pageSize = (Integer) params.get("pageRow");
        Integer pageNum = (Integer) params.get("pageNum");
        Integer status = null;
        if (!StringUtils.isEmpty(params.get("status"))) {
            status = Integer.valueOf(params.get("status").toString());
        }
        List<FinancePayment> payments = financeService.listPayment(purchaseNum, paymentNum, startday, endday, status);
        try {
            ExcelUtils.exportExcel(payments, null, "财务收款", FinancePayment.class, "财务收款单", response);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @RequiresPermissions("purchase:update")
    @PostMapping("/financeupdate")
    @Transactional(rollbackFor = Exception.class)
    public JSONObject updatepurchase(@RequestBody Map<String, Object> params) {
        Integer purchaseid = null;
        if (StringUtils.isEmpty(params.get("purchaseid"))) {
            return CommonUtil.errorJson(ErrorEnum.E_90003);
        } else {
            purchaseid = (Integer) params.get("purchaseid");
        }
        Double purchaseTotalAmount = null;
        if (!StringUtils.isEmpty(params.get("purchaseTotalAmount"))) {
            purchaseTotalAmount = Double.valueOf(params.get("purchaseTotalAmount").toString());
        }
        Double freightTotalAmount = null;
        if (!StringUtils.isEmpty(params.get("freightTotalAmount"))) {
            freightTotalAmount = Double.valueOf(params.get("freightTotalAmount").toString());
        }

        Double allamount = purchaseTotalAmount + freightTotalAmount;
        BigDecimal allamountDecimal = new BigDecimal(allamount);
        Purchase purchase = purchaseMapper.selectByPrimaryKey(purchaseid);
        purchase.setPaidtotalamount(allamountDecimal);
        purchase.setFreighttotalamount(new BigDecimal(freightTotalAmount));
        Integer purchaseId = purchase.getPurchaseid();
        FinancePaymentExample example = new FinancePaymentExample();
        example.createCriteria().andPurchaseidEqualTo(purchaseId);
        List<FinancePayment> financePayments = financePaymentMapper.selectByExample(example);
        FinancePayment financePayment = financePayments.get(0);
        financePayment.setFreighttotalamount(purchase.getFreighttotalamount());
        if (financePayment.getStatus() == 3) {
            financePayment.setHaspaytotalamount(allamountDecimal);
            purchase.setHaspaytotalamount(allamountDecimal);
        }
        purchaseMapper.updateByPrimaryKeySelective(purchase);
        financePayment.setNeedpaytotalamount(allamountDecimal);
        financePaymentMapper.updateByPrimaryKeySelective(financePayment);
        return CommonUtil.successJson();
    }

}
