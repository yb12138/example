package com.heeexy.example.model;

import java.util.Date;

public class GcOutOrderDetail {
    private String orderCode;

    private String referenceNo;

    private String platform;

    private String orderStatus;

    private String abnormalProblemReason;

    private String shippingMethod;

    private String trackingNo;

    private String warehouseCode;

    private Float orderWeight;

    private String orderDesc;

    private Date dateCreate;

    private Date dateRelease;

    private Date dateShipping;

    private Date dateModify;

    private Float totalfee;

    private Float shipping;

    private Float opf;

    private Float fsc;

    private Float dt;

    private Float rsf;

    private Float otf;

    private String currencyCode;

    private String productSku;

    private String fbaProductCode;

    private Integer quantity;

    private String transactionId;

    private String itemId;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo == null ? null : referenceNo.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getAbnormalProblemReason() {
        return abnormalProblemReason;
    }

    public void setAbnormalProblemReason(String abnormalProblemReason) {
        this.abnormalProblemReason = abnormalProblemReason == null ? null : abnormalProblemReason.trim();
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod == null ? null : shippingMethod.trim();
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo == null ? null : trackingNo.trim();
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode == null ? null : warehouseCode.trim();
    }

    public Float getOrderWeight() {
        return orderWeight;
    }

    public void setOrderWeight(Float orderWeight) {
        this.orderWeight = orderWeight;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc == null ? null : orderDesc.trim();
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(Date dateRelease) {
        this.dateRelease = dateRelease;
    }

    public Date getDateShipping() {
        return dateShipping;
    }

    public void setDateShipping(Date dateShipping) {
        this.dateShipping = dateShipping;
    }

    public Date getDateModify() {
        return dateModify;
    }

    public void setDateModify(Date dateModify) {
        this.dateModify = dateModify;
    }

    public Float getTotalfee() {
        return totalfee;
    }

    public void setTotalfee(Float totalfee) {
        this.totalfee = totalfee;
    }

    public Float getShipping() {
        return shipping;
    }

    public void setShipping(Float shipping) {
        this.shipping = shipping;
    }

    public Float getOpf() {
        return opf;
    }

    public void setOpf(Float opf) {
        this.opf = opf;
    }

    public Float getFsc() {
        return fsc;
    }

    public void setFsc(Float fsc) {
        this.fsc = fsc;
    }

    public Float getDt() {
        return dt;
    }

    public void setDt(Float dt) {
        this.dt = dt;
    }

    public Float getRsf() {
        return rsf;
    }

    public void setRsf(Float rsf) {
        this.rsf = rsf;
    }

    public Float getOtf() {
        return otf;
    }

    public void setOtf(Float otf) {
        this.otf = otf;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode == null ? null : currencyCode.trim();
    }

    public String getProductSku() {
        return productSku;
    }

    public void setProductSku(String productSku) {
        this.productSku = productSku == null ? null : productSku.trim();
    }

    public String getFbaProductCode() {
        return fbaProductCode;
    }

    public void setFbaProductCode(String fbaProductCode) {
        this.fbaProductCode = fbaProductCode == null ? null : fbaProductCode.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }
}