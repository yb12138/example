package com.heeexy.example.model;

import java.util.Date;

public class PurchaseImport {
    private String suppliername;

    private String supplierorder;

    private String transaction;

    private String remark;

    private Integer cnwarehouseoutstatus;

    private Double fare;

    private Integer purchaseallcount;

    private Double purchaseallamount;

    private Date createtime;

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getSupplierorder() {
        return supplierorder;
    }

    public void setSupplierorder(String supplierorder) {
        this.supplierorder = supplierorder == null ? null : supplierorder.trim();
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction == null ? null : transaction.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getCnwarehouseoutstatus() {
        return cnwarehouseoutstatus;
    }

    public void setCnwarehouseoutstatus(Integer cnwarehouseoutstatus) {
        this.cnwarehouseoutstatus = cnwarehouseoutstatus;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public Integer getPurchaseallcount() {
        return purchaseallcount;
    }

    public void setPurchaseallcount(Integer purchaseallcount) {
        this.purchaseallcount = purchaseallcount;
    }

    public Double getPurchaseallamount() {
        return purchaseallamount;
    }

    public void setPurchaseallamount(Double purchaseallamount) {
        this.purchaseallamount = purchaseallamount;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}