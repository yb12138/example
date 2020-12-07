package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.FinanceReceipt;
import com.heeexy.example.model.FinanceReceiptSku;
import com.heeexy.example.model.Purchase;

import java.util.List;

public interface ReceiptService {
    /**
     * 创建收款单，根据数量更新采购的退货数目
     */
    JSONObject createReceipt(FinanceReceipt financeReceipt, List<FinanceReceiptSku> skus, Integer userid);

    /**
     * 保存收款单更新
     */
    JSONObject save(FinanceReceipt financeReceipt, List<FinanceReceiptSku> skus);

    /**
     * 收款单提交审核
     */
    JSONObject submit(Integer receiptid, String username, Integer userid);

    /**
     * 收款单收款成功
     */
    JSONObject verify(Integer receiptid, String username, Integer userid);

    /**
     * 驳回收款单
     */
    JSONObject reject(Integer receiptid, String username, Integer userid);

    /**
     * 删除收款单，更新采购单的退货数目信息。
     */
    JSONObject delete(Integer receiptid);

    JSONObject listReceipt(Integer pageSize, Integer pageNum, String purchaseNum, String receiptNum, Integer status);

    JSONObject confirmMoney(Integer receiptID);
}
