package com.heeexy.example.model;

import java.util.Date;
import java.util.List;

public class FinanceReceipt {
    private Integer receiptid;

    private String receiptnum;

    private Integer supplierid;

    private String suppliername;

    private String transactionnumber;

    private String supplierordernumber;

    private Integer isneedrefund;

    private String type;

    private Integer status;

    private Double receivetotalamount;

    private Double agreedtotalamount;

    private String auditopinion;

    private Integer financeauditorid;

    private Integer receiverid;

    private Date receivetime;

    private String applyreason;

    private Date createtime;

    private Integer purchaseid;

    private String purchasenum;

    private List<FinanceReceiptSku> skus;

    public List<FinanceReceiptSku> getSkus() {
        return skus;
    }

    public void setSkus(List<FinanceReceiptSku> skus) {
        this.skus = skus;
    }

    public Integer getReceiptid() {
        return receiptid;
    }

    public void setReceiptid(Integer receiptid) {
        this.receiptid = receiptid;
    }

    public String getReceiptnum() {
        return receiptnum;
    }

    public void setReceiptnum(String receiptnum) {
        this.receiptnum = receiptnum == null ? null : receiptnum.trim();
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getTransactionnumber() {
        return transactionnumber;
    }

    public void setTransactionnumber(String transactionnumber) {
        this.transactionnumber = transactionnumber == null ? null : transactionnumber.trim();
    }

    public String getSupplierordernumber() {
        return supplierordernumber;
    }

    public void setSupplierordernumber(String supplierordernumber) {
        this.supplierordernumber = supplierordernumber == null ? null : supplierordernumber.trim();
    }

    public Integer getIsneedrefund() {
        return isneedrefund;
    }

    public void setIsneedrefund(Integer isneedrefund) {
        this.isneedrefund = isneedrefund;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getReceivetotalamount() {
        return receivetotalamount;
    }

    public void setReceivetotalamount(Double receivetotalamount) {
        this.receivetotalamount = receivetotalamount;
    }

    public Double getAgreedtotalamount() {
        return agreedtotalamount;
    }

    public void setAgreedtotalamount(Double agreedtotalamount) {
        this.agreedtotalamount = agreedtotalamount;
    }

    public String getAuditopinion() {
        return auditopinion;
    }

    public void setAuditopinion(String auditopinion) {
        this.auditopinion = auditopinion == null ? null : auditopinion.trim();
    }

    public Integer getFinanceauditorid() {
        return financeauditorid;
    }

    public void setFinanceauditorid(Integer financeauditorid) {
        this.financeauditorid = financeauditorid;
    }

    public Integer getReceiverid() {
        return receiverid;
    }

    public void setReceiverid(Integer receiverid) {
        this.receiverid = receiverid;
    }

    public Date getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(Date receivetime) {
        this.receivetime = receivetime;
    }

    public String getApplyreason() {
        return applyreason;
    }

    public void setApplyreason(String applyreason) {
        this.applyreason = applyreason == null ? null : applyreason.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(Integer purchaseid) {
        this.purchaseid = purchaseid;
    }

    public String getPurchasenum() {
        return purchasenum;
    }

    public void setPurchasenum(String purchasenum) {
        this.purchasenum = purchasenum == null ? null : purchasenum.trim();
    }
}