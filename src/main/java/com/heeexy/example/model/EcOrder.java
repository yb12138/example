package com.heeexy.example.model;

import java.util.Date;

public class EcOrder {
    private String orderId;

    private Integer status;

    private String refno;

    private String saleordercode;

    private String sysordercode;

    private String warehouseordercode;

    private Date createddate;

    private Date updatedate;

    private Date datepaidplatform;

    private Date datecreateplatform;

    private Integer platformshipstatus;

    private Date platformshiptime;

    private Date datewarehouseshipping;

    private String currency;

    private Float amountpaid;

    private Float subtotal;

    private Float shipfee;

    private Float platformfeetotal;

    private Float finalvaluefeetotal;

    private Float otherfee;

    private Float costshipfee;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRefno() {
        return refno;
    }

    public void setRefno(String refno) {
        this.refno = refno == null ? null : refno.trim();
    }

    public String getSaleordercode() {
        return saleordercode;
    }

    public void setSaleordercode(String saleordercode) {
        this.saleordercode = saleordercode == null ? null : saleordercode.trim();
    }

    public String getSysordercode() {
        return sysordercode;
    }

    public void setSysordercode(String sysordercode) {
        this.sysordercode = sysordercode == null ? null : sysordercode.trim();
    }

    public String getWarehouseordercode() {
        return warehouseordercode;
    }

    public void setWarehouseordercode(String warehouseordercode) {
        this.warehouseordercode = warehouseordercode == null ? null : warehouseordercode.trim();
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Date getDatepaidplatform() {
        return datepaidplatform;
    }

    public void setDatepaidplatform(Date datepaidplatform) {
        this.datepaidplatform = datepaidplatform;
    }

    public Date getDatecreateplatform() {
        return datecreateplatform;
    }

    public void setDatecreateplatform(Date datecreateplatform) {
        this.datecreateplatform = datecreateplatform;
    }

    public Integer getPlatformshipstatus() {
        return platformshipstatus;
    }

    public void setPlatformshipstatus(Integer platformshipstatus) {
        this.platformshipstatus = platformshipstatus;
    }

    public Date getPlatformshiptime() {
        return platformshiptime;
    }

    public void setPlatformshiptime(Date platformshiptime) {
        this.platformshiptime = platformshiptime;
    }

    public Date getDatewarehouseshipping() {
        return datewarehouseshipping;
    }

    public void setDatewarehouseshipping(Date datewarehouseshipping) {
        this.datewarehouseshipping = datewarehouseshipping;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Float getAmountpaid() {
        return amountpaid;
    }

    public void setAmountpaid(Float amountpaid) {
        this.amountpaid = amountpaid;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Float getShipfee() {
        return shipfee;
    }

    public void setShipfee(Float shipfee) {
        this.shipfee = shipfee;
    }

    public Float getPlatformfeetotal() {
        return platformfeetotal;
    }

    public void setPlatformfeetotal(Float platformfeetotal) {
        this.platformfeetotal = platformfeetotal;
    }

    public Float getFinalvaluefeetotal() {
        return finalvaluefeetotal;
    }

    public void setFinalvaluefeetotal(Float finalvaluefeetotal) {
        this.finalvaluefeetotal = finalvaluefeetotal;
    }

    public Float getOtherfee() {
        return otherfee;
    }

    public void setOtherfee(Float otherfee) {
        this.otherfee = otherfee;
    }

    public Float getCostshipfee() {
        return costshipfee;
    }

    public void setCostshipfee(Float costshipfee) {
        this.costshipfee = costshipfee;
    }
}