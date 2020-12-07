package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.FinanceReceiptMapper;
import com.heeexy.example.dao.FinanceReceiptSkuMapper;
import com.heeexy.example.dao.ProductWarehouseStorageMapper;
import com.heeexy.example.dao.PurchaseSkuMapper;
import com.heeexy.example.model.*;
import com.heeexy.example.service.PurchaseService;
import com.heeexy.example.service.ReceiptService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.GetOrredingIdUUID;
import com.heeexy.example.util.constants.ErrorEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class ReceiptServiceImpl implements ReceiptService {
    @Autowired
    PurchaseService purchaseService;
    @Autowired
    FinanceReceiptMapper financeReceiptMapper;
    @Autowired
    FinanceReceiptSkuMapper financeReceiptSkuMapper;
    @Autowired
    PurchaseSkuMapper purchaseSkuMapper;
    @Autowired
    ProductWarehouseStorageMapper productWarehouseStorageMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject createReceipt(FinanceReceipt financeReceipt, List<FinanceReceiptSku> skus, Integer userid) {
        Date date = new Date();
        Integer purchaseID = financeReceipt.getPurchaseid();
        Purchase purchase = purchaseService.queryDetailByID(purchaseID);
        if (purchase.getCnwarehouseinstatus() == 3) {
            return CommonUtil.errorJson(ErrorEnum.E_100004);
        }
        if (purchase.getFinancestatus() < 3) {
            return CommonUtil.errorJson(ErrorEnum.E_100003);
        }
        Integer defectivequantity = 0;
        Double defectiveamount = 0.0;
        String num = GetOrredingIdUUID.getReceiptIdByUUId();
        financeReceipt.setStatus(1);
        financeReceipt.setType("采购退货");
        financeReceipt.setReceivetime(date);
        financeReceipt.setReceiverid(userid);
        financeReceipt.setReceiptnum(num);
        financeReceipt.setCreatetime(date);
        financeReceiptMapper.insertSelective(financeReceipt);
        for (FinanceReceiptSku financeReceiptSku : skus) {
            Integer purchaseskuid = financeReceiptSku.getPurchaseskuid();
            PurchaseSku purchaseSku = purchaseSkuMapper.selectByPrimaryKey(purchaseskuid);
            Integer count = financeReceiptSku.getOutquantity();
            double amount = count * purchaseSku.getUnitprice().doubleValue();
            defectivequantity += count;
            defectiveamount += amount;
            purchaseSku.setDefectivequantity(count);
            purchaseSku.setDefectiveamount(BigDecimal.valueOf(amount));
            purchaseSkuMapper.updateByPrimaryKeySelective(purchaseSku);
            financeReceiptSku.setReceiptid(financeReceipt.getReceiptid());
            financeReceiptSku.setReceiptnum(num);
            financeReceiptSku.setSkucode(purchaseSku.getSku());
            financeReceiptSkuMapper.insertSelective(financeReceiptSku);
        }
        purchase.setDefectivetotalamount(BigDecimal.valueOf(defectiveamount));
        purchase.setDefectivetotalquantity(defectivequantity);
        Integer stockquantity = purchase.getStockintotalquantity();
        Integer purchasequantity = purchase.getPurchasetotalquantity();
        purchase.setUpdatetime(date);
        if (defectivequantity + stockquantity == purchasequantity) {
            purchase.setCnwarehouseinstatus((byte) 3);
        } else {
            purchase.setCnwarehouseinstatus((byte) 2);
        }
        purchaseService.updatePurchase(purchase);
        return CommonUtil.successJson();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject save(FinanceReceipt financeReceipt, List<FinanceReceiptSku> skus) {
        financeReceiptMapper.updateByPrimaryKeySelective(financeReceipt);
        for (FinanceReceiptSku financeReceiptSku : skus) {
            financeReceiptSkuMapper.updateByPrimaryKeySelective(financeReceiptSku);
        }
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject submit(Integer receiptid, String username, Integer userid) {
        FinanceReceipt financeReceipt = financeReceiptMapper.selectByPrimaryKey(receiptid);
        financeReceipt.setStatus(2);
        financeReceiptMapper.updateByPrimaryKey(financeReceipt);
        return CommonUtil.successJson();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject verify(Integer receiptid, String username, Integer userid) {
        FinanceReceipt financeReceipt = financeReceiptMapper.selectByPrimaryKey(receiptid);
        financeReceipt.setStatus(3);
        Integer purchaseID = financeReceipt.getPurchaseid();
        Purchase purchase = purchaseService.queryDetailByID(purchaseID);
        Integer defectivetotalquantity = purchase.getDefectivetotalquantity();
        Integer purchasequantity = purchase.getPurchasetotalquantity();
        Integer stock = purchase.getStockintotalquantity();
        if (stock + defectivetotalquantity == purchasequantity) {
            purchase.setCnwarehouseinstatus((byte) 3);
            purchase.setSpecialstatus((byte) 1);
        } else {
            purchase.setCnwarehouseinstatus((byte) 2);
        }
        FinanceReceiptSkuExample skuExample = new FinanceReceiptSkuExample();
        skuExample.createCriteria().andReceiptidEqualTo(receiptid);
        List<FinanceReceiptSku> financeReceiptSkus = financeReceiptSkuMapper.selectByExample(skuExample);
        for (FinanceReceiptSku financeReceiptSku : financeReceiptSkus) {
            int productID = financeReceiptSku.getProductid();
            ProductWarehouseStorage productWarehouseStorage = productWarehouseStorageMapper.selectByPrimaryKey(productID);
            Integer old = productWarehouseStorage.getOnpurchase();
            productWarehouseStorage.setOnpurchase(old - financeReceiptSku.getOutquantity());
            productWarehouseStorageMapper.updateByPrimaryKeySelective(productWarehouseStorage);
        }
        purchaseService.updatePurchase(purchase);
        financeReceiptMapper.updateByPrimaryKeySelective(financeReceipt);
        return CommonUtil.successJson();
    }

    @Override

    public JSONObject reject(Integer receiptid, String username, Integer userid) {
        FinanceReceipt financeReceipt = financeReceiptMapper.selectByPrimaryKey(receiptid);
        financeReceipt.setStatus(1);
        financeReceiptMapper.updateByPrimaryKey(financeReceipt);
        return CommonUtil.successJson();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject delete(Integer receiptid) {
        FinanceReceipt financeReceipt = financeReceiptMapper.selectByPrimaryKey(receiptid);
        FinanceReceiptSkuExample example = new FinanceReceiptSkuExample();
        example.createCriteria().andReceiptidEqualTo(receiptid);
        List<FinanceReceiptSku> financeReceiptSkus = financeReceiptSkuMapper.selectByExample(example);
        Integer defectivequantity = 0;
        double defectiveamount = 0.0;
        for (FinanceReceiptSku financeReceiptSku : financeReceiptSkus) {
            Integer purchaseskuid = financeReceiptSku.getPurchaseskuid();
            PurchaseSku purchaseSku = purchaseSkuMapper.selectByPrimaryKey(purchaseskuid);
            Integer oldcount = purchaseSku.getDefectivequantity();
            Integer count = financeReceiptSku.getOutquantity();
            Integer finalcount = oldcount - count;
            double amount = finalcount * purchaseSku.getUnitprice().doubleValue();
            defectivequantity += finalcount;
            defectiveamount += amount;
            purchaseSku.setDefectivequantity(finalcount);
            purchaseSku.setDefectiveamount(BigDecimal.valueOf(amount));
            purchaseSkuMapper.updateByPrimaryKeySelective(purchaseSku);
            financeReceiptSkuMapper.deleteByPrimaryKey(financeReceiptSku.getReceiptskuid());
        }
        Purchase purchase = purchaseService.queryDetailByID(financeReceipt.getPurchaseid());
        purchase.setDefectivetotalquantity(defectivequantity);
        purchase.setDefectivetotalamount(BigDecimal.valueOf(defectiveamount));
        Integer stockquantity = purchase.getStockintotalquantity();
        Integer purchasequantity = purchase.getPurchasetotalquantity();
        if (stockquantity + defectivequantity == 0) {
            purchase.setCnwarehouseinstatus((byte) 1);
        } else if (stockquantity + defectivequantity < purchasequantity) {
            purchase.setCnwarehouseinstatus((byte) 2);
        } else if (stockquantity + defectivequantity == purchasequantity) {
            purchase.setCnwarehouseinstatus((byte) 3);
        }
        purchase.setSpecialstatus((byte) 0);
        purchaseService.updatePurchase(purchase);
        financeReceiptMapper.deleteByPrimaryKey(receiptid);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject listReceipt(Integer pageSize, Integer pageNum, String purchaseNum, String receiptNum, Integer status) {
        int start = 0;
        if (pageNum != 0) {
            start = (pageNum - 1) * pageSize;
        }
        List<FinanceReceipt> maps = financeReceiptMapper.listReceipt(start, pageSize, purchaseNum, receiptNum, status);
        for (FinanceReceipt financeReceipt : maps) {
            Integer receiptID = financeReceipt.getReceiptid();
            FinanceReceiptSkuExample skuExample = new FinanceReceiptSkuExample();
            skuExample.createCriteria().andReceiptidEqualTo(receiptID);
            List<FinanceReceiptSku> receipts = financeReceiptSkuMapper.selectByExample(skuExample);
            financeReceipt.setSkus(receipts);
        }
        Integer count = financeReceiptMapper.queryProductCount(purchaseNum, receiptNum, status);
        JSONObject requestjson = new JSONObject();
        requestjson.put("pageRow", pageSize);
        return CommonUtil.successPage(requestjson, maps, count);
    }

    @Override
    public JSONObject confirmMoney(Integer receiptID) {
        FinanceReceipt receipt = financeReceiptMapper.selectByPrimaryKey(receiptID);
        receipt.setStatus(4);
        financeReceiptMapper.updateByPrimaryKey(receipt);
        return CommonUtil.successJson();
    }

}
