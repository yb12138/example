package com.heeexy.example.model;

public class WinitOrderDetail {
    private String orderno;

    private String planshelfcompleteddate;

    private String sku;

    private Integer quantity;

    private Integer actualquantity;

    private String createddate;

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getPlanshelfcompleteddate() {
        return planshelfcompleteddate;
    }

    public void setPlanshelfcompleteddate(String planshelfcompleteddate) {
        this.planshelfcompleteddate = planshelfcompleteddate == null ? null : planshelfcompleteddate.trim();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getActualquantity() {
        return actualquantity;
    }

    public void setActualquantity(Integer actualquantity) {
        this.actualquantity = actualquantity;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate == null ? null : createddate.trim();
    }
}