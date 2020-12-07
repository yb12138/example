package com.heeexy.example.model;

import java.util.Date;

public class Consignment {
    private Long id;

    private Integer deliveryServiceId;

    private String salesReference;

    private String paymentReference;

    private String deliveryReference;

    private Date arriveTime;

    private Date updateTime;

    private String type;

    private String currencyCode;

    private String productClientRef;

    private Integer quantity;

    private Double totalDeliveryFee;

    private Double totalHandlingFee;

    private Date createTime;

    private String status;

    private String customIdentityReference;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDeliveryServiceId() {
        return deliveryServiceId;
    }

    public void setDeliveryServiceId(Integer deliveryServiceId) {
        this.deliveryServiceId = deliveryServiceId;
    }

    public String getSalesReference() {
        return salesReference;
    }

    public void setSalesReference(String salesReference) {
        this.salesReference = salesReference == null ? null : salesReference.trim();
    }

    public String getPaymentReference() {
        return paymentReference;
    }

    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference == null ? null : paymentReference.trim();
    }

    public String getDeliveryReference() {
        return deliveryReference;
    }

    public void setDeliveryReference(String deliveryReference) {
        this.deliveryReference = deliveryReference == null ? null : deliveryReference.trim();
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode == null ? null : currencyCode.trim();
    }

    public String getProductClientRef() {
        return productClientRef;
    }

    public void setProductClientRef(String productClientRef) {
        this.productClientRef = productClientRef == null ? null : productClientRef.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalDeliveryFee() {
        return totalDeliveryFee;
    }

    public void setTotalDeliveryFee(Double totalDeliveryFee) {
        this.totalDeliveryFee = totalDeliveryFee;
    }

    public Double getTotalHandlingFee() {
        return totalHandlingFee;
    }

    public void setTotalHandlingFee(Double totalHandlingFee) {
        this.totalHandlingFee = totalHandlingFee;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCustomIdentityReference() {
        return customIdentityReference;
    }

    public void setCustomIdentityReference(String customIdentityReference) {
        this.customIdentityReference = customIdentityReference == null ? null : customIdentityReference.trim();
    }
}