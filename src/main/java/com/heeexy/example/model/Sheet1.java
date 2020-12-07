package com.heeexy.example.model;

import java.util.Date;

public class Sheet1 {
    private Date createdate;

    private String purchasenum;

    private String skucode;

    private String cnname;

    private String suppliername;

    private Integer quantity;

    private Double unitprice;

    private Double amount;

    private Double fare;

    private String purchaseamount;

    private String suppliernum;

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getPurchasenum() {
        return purchasenum;
    }

    public void setPurchasenum(String purchasenum) {
        this.purchasenum = purchasenum == null ? null : purchasenum.trim();
    }

    public String getSkucode() {
        return skucode;
    }

    public void setSkucode(String skucode) {
        this.skucode = skucode == null ? null : skucode.trim();
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname == null ? null : cnname.trim();
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public String getPurchaseamount() {
        return purchaseamount;
    }

    public void setPurchaseamount(String purchaseamount) {
        this.purchaseamount = purchaseamount == null ? null : purchaseamount.trim();
    }

    public String getSuppliernum() {
        return suppliernum;
    }

    public void setSuppliernum(String suppliernum) {
        this.suppliernum = suppliernum == null ? null : suppliernum.trim();
    }
}