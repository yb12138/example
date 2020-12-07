package com.heeexy.example.model;

public class ProductSupplier {
    private Integer productid;

    private String supplierlink1;

    private String supplierlink2;

    private String supplierlink3;

    private Integer deliverytime;

    private String registerlink;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getSupplierlink1() {
        return supplierlink1;
    }

    public void setSupplierlink1(String supplierlink1) {
        this.supplierlink1 = supplierlink1 == null ? null : supplierlink1.trim();
    }

    public String getSupplierlink2() {
        return supplierlink2;
    }

    public void setSupplierlink2(String supplierlink2) {
        this.supplierlink2 = supplierlink2 == null ? null : supplierlink2.trim();
    }

    public String getSupplierlink3() {
        return supplierlink3;
    }

    public void setSupplierlink3(String supplierlink3) {
        this.supplierlink3 = supplierlink3 == null ? null : supplierlink3.trim();
    }

    public Integer getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(Integer deliverytime) {
        this.deliverytime = deliverytime;
    }

    public String getRegisterlink() {
        return registerlink;
    }

    public void setRegisterlink(String registerlink) {
        this.registerlink = registerlink == null ? null : registerlink.trim();
    }
}