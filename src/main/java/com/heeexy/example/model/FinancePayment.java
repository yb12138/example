package com.heeexy.example.model;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

public class FinancePayment {

    @JsonProperty(value = "paymentID")
    private Integer paymentid;
    @Excel(name = "付款单号")
    @JsonProperty(value = "paymentNum")
    private String paymentnum;
    @Excel(name = "采购单号")
    private String purchaseNum;
    @JsonProperty(value = "supplierID")
    private Integer supplierid;

    @Excel(name = "类型")
    private String type;

    private Byte status;
    @JsonProperty(value = "purchaseID")
    private Integer purchaseid;
    @JsonProperty(value = "financeAuditorID")
    private Integer financeauditorid;
    @JsonProperty(value = "auditOpinion")
    @Excel(name = "审核意见")
    private String auditopinion;
    @JsonProperty(value = "needPayTotalAmount")
    @Excel(name = "应付金额")
    private BigDecimal needpaytotalamount;
    @JsonProperty(value = "purchaseTotalAmount")
    @Excel(name = "采购总额")
    private BigDecimal purchasetotalamount;
    @JsonProperty(value = "freightTotalAmount")
    @Excel(name = "运费")
    private BigDecimal freighttotalamount;
    @JsonProperty(value = "stockInTotalAmount")
    @Excel(name = "在库金额")
    private BigDecimal stockintotalamount;
    @JsonProperty(value = "defectiveTotalAmount")
    @Excel(name = "退货金额")
    private BigDecimal defectivetotalamount;

    private Integer payerid;
    @Excel(name = "付款人")
    private String payername;
    @Excel(name = "付款时间", format = "yyyy-MM-dd HH:mm:ss")
    private Date paytime;
    @Excel(name = "创建时间", format = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;
    @Excel(name = "创建人")
    private String createname;
    @Excel(name = "供应商名称")
    private String suppliername;

    private Integer createid;
    @JsonProperty(value = "hasPayTotalAmount")
    @Excel(name = "已付款")
    private BigDecimal haspaytotalamount;
    @Excel(name = "订金支付时间", format = "yyyy-MM-dd HH:mm:ss")
    private Date firsttime;

    public String getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(String purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    public Integer getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(Integer paymentid) {
        this.paymentid = paymentid;
    }

    public String getPaymentnum() {
        return paymentnum;
    }

    public void setPaymentnum(String paymentnum) {
        this.paymentnum = paymentnum == null ? null : paymentnum.trim();
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(Integer purchaseid) {
        this.purchaseid = purchaseid;
    }

    public Integer getFinanceauditorid() {
        return financeauditorid;
    }

    public void setFinanceauditorid(Integer financeauditorid) {
        this.financeauditorid = financeauditorid;
    }

    public String getAuditopinion() {
        return auditopinion;
    }

    public void setAuditopinion(String auditopinion) {
        this.auditopinion = auditopinion == null ? null : auditopinion.trim();
    }

    public BigDecimal getNeedpaytotalamount() {
        return needpaytotalamount;
    }

    public void setNeedpaytotalamount(BigDecimal needpaytotalamount) {
        this.needpaytotalamount = needpaytotalamount;
    }

    public BigDecimal getPurchasetotalamount() {
        return purchasetotalamount;
    }

    public void setPurchasetotalamount(BigDecimal purchasetotalamount) {
        this.purchasetotalamount = purchasetotalamount;
    }

    public BigDecimal getFreighttotalamount() {
        return freighttotalamount;
    }

    public void setFreighttotalamount(BigDecimal freighttotalamount) {
        this.freighttotalamount = freighttotalamount;
    }

    public BigDecimal getStockintotalamount() {
        return stockintotalamount;
    }

    public void setStockintotalamount(BigDecimal stockintotalamount) {
        this.stockintotalamount = stockintotalamount;
    }

    public BigDecimal getDefectivetotalamount() {
        return defectivetotalamount;
    }

    public void setDefectivetotalamount(BigDecimal defectivetotalamount) {
        this.defectivetotalamount = defectivetotalamount;
    }

    public Integer getPayerid() {
        return payerid;
    }

    public void setPayerid(Integer payerid) {
        this.payerid = payerid;
    }

    public String getPayername() {
        return payername;
    }

    public void setPayername(String payername) {
        this.payername = payername == null ? null : payername.trim();
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname == null ? null : createname.trim();
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public Integer getCreateid() {
        return createid;
    }

    public void setCreateid(Integer createid) {
        this.createid = createid;
    }

    public BigDecimal getHaspaytotalamount() {
        return haspaytotalamount;
    }

    public void setHaspaytotalamount(BigDecimal haspaytotalamount) {
        this.haspaytotalamount = haspaytotalamount;
    }

    public Date getFirsttime() {
        return firsttime;
    }

    public void setFirsttime(Date firsttime) {
        this.firsttime = firsttime;
    }
}