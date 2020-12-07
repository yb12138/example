package com.heeexy.example.model;

public class FbaWarehouseStorage {
    private Integer productid;

    private Long warehouseid;

    private Integer actualquantity;

    private String sku;

    private Integer availablequantity;

    private Integer transitquantity;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Long getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Long warehouseid) {
        this.warehouseid = warehouseid;
    }

    public Integer getActualquantity() {
        return actualquantity;
    }

    public void setActualquantity(Integer actualquantity) {
        this.actualquantity = actualquantity;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public Integer getAvailablequantity() {
        return availablequantity;
    }

    public void setAvailablequantity(Integer availablequantity) {
        this.availablequantity = availablequantity;
    }

    public Integer getTransitquantity() {
        return transitquantity;
    }

    public void setTransitquantity(Integer transitquantity) {
        this.transitquantity = transitquantity;
    }
}