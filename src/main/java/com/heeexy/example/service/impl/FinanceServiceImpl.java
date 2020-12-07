package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.FinancePaymentMapper;
import com.heeexy.example.dao.ProductMapper;
import com.heeexy.example.dao.PurchaseMapper;
import com.heeexy.example.dao.PurchaseSkuMapper;
import com.heeexy.example.model.*;
import com.heeexy.example.service.FinanceService;
import com.heeexy.example.service.ProductStorageService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.GetOrredingIdUUID;
import com.heeexy.example.util.constants.ErrorEnum;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class FinanceServiceImpl implements FinanceService {
    @Autowired
    FinancePaymentMapper financePaymentMapper;
    @Autowired
    PurchaseSkuMapper purchaseSkuMapper;
    @Autowired
    ProductMapper productMapper;
    @Autowired
    PurchaseMapper purchaseMapper;
    @Autowired
    ProductStorageService productStorageService;

    @Override
    public JSONObject createFinance(Purchase purchase, String username, Integer userid, String type) {
        FinancePaymentExample example = new FinancePaymentExample();
        example.createCriteria().andPurchaseidEqualTo(purchase.getPurchaseid());
        List<FinancePayment> payments = financePaymentMapper.selectByExample(example);
        if (payments == null || payments.size() == 0) {
            Date date = new Date();
            FinancePayment financePayment = new FinancePayment();
            financePayment.setCreateid(userid);
            financePayment.setCreatename(username);
            financePayment.setPurchaseid(purchase.getPurchaseid());
            financePayment.setCreatetime(date);
            financePayment.setDefectivetotalamount(purchase.getDefectivetotalamount());
            financePayment.setFreighttotalamount(purchase.getFreighttotalamount());
            financePayment.setHaspaytotalamount(purchase.getHaspaytotalamount());
            financePayment.setNeedpaytotalamount(purchase.getPurchasetotalamount().add(purchase.getFreighttotalamount()));
            financePayment.setPurchasetotalamount(purchase.getPurchasetotalamount());
            financePayment.setPaymentnum(GetOrredingIdUUID.getFinanceOrder());
            financePayment.setStatus((byte) 1);
            financePayment.setStockintotalamount(purchase.getStockintotalamount());
            financePayment.setSupplierid(purchase.getSupplierid());
            financePayment.setSuppliername(purchase.getSuppliername());
            financePayment.setType(type);
            financePaymentMapper.insertSelective(financePayment);
        } else {
            updateFinance(purchase, type, payments.get(0).getPaymentid());
        }
        return CommonUtil.successJson();
    }

    public void updateFinance(Purchase purchase, String type, Integer financeid) {
        FinancePayment financePayment = financePaymentMapper.selectByPrimaryKey(financeid);
        financePayment.setDefectivetotalamount(purchase.getDefectivetotalamount());
        financePayment.setFreighttotalamount(purchase.getFreighttotalamount());
        financePayment.setHaspaytotalamount(purchase.getHaspaytotalamount());
        financePayment.setNeedpaytotalamount(purchase.getPurchasetotalamount().add(purchase.getFreighttotalamount()));
        financePayment.setPurchasetotalamount(purchase.getPurchasetotalamount());
        financePayment.setStockintotalamount(purchase.getStockintotalamount());
        financePayment.setSupplierid(purchase.getSupplierid());
        financePayment.setSuppliername(purchase.getSuppliername());
        financePayment.setStatus((byte) 1);
        financePayment.setType(type);
        financePaymentMapper.updateByPrimaryKeySelective(financePayment);
    }

    @Override
    public JSONObject save(FinancePayment financePayment) {
        financePaymentMapper.updateByPrimaryKeySelective(financePayment);
        return CommonUtil.successJson();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject submit(Integer financeid, String username, Integer userid) {
        FinancePayment financePayment = financePaymentMapper.selectByPrimaryKey(financeid);
        financePayment.setStatus((byte) 2);
        financePayment.setPayerid(userid);
        financePayment.setPayername(username);
        financePaymentMapper.updateByPrimaryKeySelective(financePayment);
        Purchase purchase = purchaseMapper.selectByPrimaryKey(financePayment.getPurchaseid());
        purchase.setFinancestatus(financePayment.getStatus());
        purchaseMapper.updateByPrimaryKeySelective(purchase);
        return CommonUtil.successJson();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject verify(Integer financeid, String username, Integer userid) {
        Date date = new Date();
        FinancePayment financePayment = financePaymentMapper.selectByPrimaryKey(financeid);
        switch (financePayment.getType()) {
            case "全款":
                financePayment.setHaspaytotalamount(financePayment.getNeedpaytotalamount());
                financePayment.setStatus((byte) 3);
                break;
            case "账期":
                financePayment.setHaspaytotalamount(BigDecimal.valueOf(0.0));
                financePayment.setStatus((byte) 4);
                break;
            case "订金":
                financePayment.setStatus((byte) 5);
                break;
            default:
                break;
        }
        financePayment.setPaytime(date);
        financePayment.setFirsttime(date);
        financePaymentMapper.updateByPrimaryKeySelective(financePayment);
        Integer purchaseID = financePayment.getPurchaseid();
        Purchase purchase = purchaseMapper.selectByPrimaryKey(purchaseID);
        purchase.setFinancestatus(financePayment.getStatus());
        purchase.setCnwarehouseinstatus((byte) 1);
        purchase.setHaspaytotalamount(financePayment.getHaspaytotalamount());
        purchase.setPaytime(date);
        purchaseMapper.updateByPrimaryKeySelective(purchase);
        return CommonUtil.successJson();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject reject(Integer financeid, String username, Integer userid) {
        FinancePayment financePayment = financePaymentMapper.selectByPrimaryKey(financeid);
        financePayment.setStatus((byte) 0);
        financePayment.setFinanceauditorid(userid);
        financePaymentMapper.updateByPrimaryKeySelective(financePayment);
        Purchase purchase = purchaseMapper.selectByPrimaryKey(financePayment.getPurchaseid());
        purchase.setFinancestatus(financePayment.getStatus());
        purchase.setPurchasestatus((byte) 1);//采购单改为待提交状态
        purchaseMapper.updateByPrimaryKeySelective(purchase);
        //更新采购单,同时更新库存数目
        PurchaseSkuExample skuExample = new PurchaseSkuExample();
        skuExample.createCriteria().andPurchaseidEqualTo(purchase.getPurchaseid());
        List<PurchaseSku> skus = purchaseSkuMapper.selectByExample(skuExample);
        for (PurchaseSku sku : skus) {
            Integer productID = sku.getProductid();
            Boolean success = productStorageService.min(productID, sku.getPurchasequantity(), 1, true);
            if (!success) {
                throw new RuntimeException("库存数目异常，驳回失败");
            }
        }
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject delete(Integer financeid) {
        financePaymentMapper.deleteByPrimaryKey(financeid);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject listfinance(Integer pageSize, Integer pageNum, String purchaseNum, String paymentNum, String startday, String endday, Integer status) {
        int start = 0;
        if (pageNum != 0) {
            start = (pageNum - 1) * pageSize;
        }
        List<JSONObject> maps = financePaymentMapper.queryFinanceList(start, pageSize, purchaseNum, paymentNum, startday, endday, status);
        Integer count = financePaymentMapper.queryFinanceListCount(purchaseNum, paymentNum, startday, endday, status);
        for (JSONObject object : maps) {
            Integer purchaseid = object.getIntValue("purchaseID");
            Purchase purchase = purchaseMapper.selectByPrimaryKey(purchaseid);
            object.put("purchaseNum", purchase.getPurchasenum());
            PurchaseSkuExample skuExample = new PurchaseSkuExample();
            skuExample.createCriteria().andPurchaseidEqualTo(purchaseid);
            List<PurchaseSku> skus = purchaseSkuMapper.selectByExample(skuExample);
            for (PurchaseSku sku1 : skus) {
                Integer productId = sku1.getProductid();
                Product product = productMapper.selectByPrimaryKey(productId);
                sku1.setImgurl(product.getImgurl());
                sku1.setSupplierlink1(product.getSupplierlink1());
            }
            object.put("sku", skus);
        }
        JSONObject requestjson = new JSONObject();
        requestjson.put("pageRow", pageNum);
        return CommonUtil.successPage(requestjson, maps, count);
    }

    @Override
    public JSONObject confirm(Integer paymentID) {
        Date date = new Date();
        FinancePayment financePayment = financePaymentMapper.selectByPrimaryKey(paymentID);
        financePayment.setPaytime(date);
        financePayment.setStatus((byte) 3);
        financePayment.setHaspaytotalamount(financePayment.getNeedpaytotalamount());
        financePaymentMapper.updateByPrimaryKeySelective(financePayment);
        Integer purchaseID = financePayment.getPurchaseid();
        Purchase purchase = purchaseMapper.selectByPrimaryKey(purchaseID);
        purchase.setHaspaytotalamount(financePayment.getNeedpaytotalamount());
        purchaseMapper.updateByPrimaryKeySelective(purchase);
        return CommonUtil.successJson();
    }

    @Override
    public Integer getTodayAmount() {
        DateTime dateTime = new DateTime();
        String previousFirstDay = dateTime.dayOfYear().withMinimumValue().minusMonths(1).toString("yyyy-MM-dd");
        String previousLastDay = dateTime.dayOfYear().withMaximumValue().minusMonths(1).toString("yyyy-MM-dd");
        Double amount = financePaymentMapper.getTodayAmount(previousFirstDay, previousLastDay);
        if (amount == null) {
            return 0;
        }
        return amount.intValue();
    }

    @Override
    public List<FinancePayment> listPayment(String purchaseNum, String paymentNum, String startday, String endday, Integer status) {
        List<FinancePayment> financePayments = financePaymentMapper.queryFinanceAll(purchaseNum, paymentNum, startday, endday, status);
        for (FinancePayment financePayment : financePayments) {
            Integer purchaseID = financePayment.getPurchaseid();
            Purchase purchase = purchaseMapper.selectByPrimaryKey(purchaseID);
            financePayment.setPurchaseNum(purchase.getPurchasenum());
        }
        return financePayments;
    }


    @Override
    public void createFinance(Purchase purchase, String username, Integer userid, String type, Date date) {
        FinancePaymentExample example = new FinancePaymentExample();
        example.createCriteria().andPurchaseidEqualTo(purchase.getPurchaseid());
        List<FinancePayment> payments = financePaymentMapper.selectByExample(example);
        if (payments == null || payments.size() == 0) {
            FinancePayment financePayment = new FinancePayment();
            financePayment.setCreateid(userid);
            financePayment.setCreatename(username);
            financePayment.setPurchaseid(purchase.getPurchaseid());
            financePayment.setCreatetime(date);
            financePayment.setDefectivetotalamount(purchase.getDefectivetotalamount());
            financePayment.setFreighttotalamount(purchase.getFreighttotalamount());
            financePayment.setHaspaytotalamount(purchase.getHaspaytotalamount());
            financePayment.setNeedpaytotalamount(purchase.getPurchasetotalamount().add(purchase.getFreighttotalamount()));
            financePayment.setPurchasetotalamount(purchase.getPurchasetotalamount());
            financePayment.setPaymentnum(GetOrredingIdUUID.getFinanceOrder());
            financePayment.setStatus((byte) 3);
            financePayment.setStockintotalamount(purchase.getStockintotalamount());
            financePayment.setSupplierid(purchase.getSupplierid());
            financePayment.setSuppliername(purchase.getSuppliername());
            financePayment.setType(type);
            financePaymentMapper.insertSelective(financePayment);
        }
    }

}
