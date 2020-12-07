package com.heeexy.example.model;

public class Consignmentsku {
    private Integer conskuid;

    private Long conid;

    private String productClientRef;

    private Integer quantity;

    public Integer getConskuid() {
        return conskuid;
    }

    public void setConskuid(Integer conskuid) {
        this.conskuid = conskuid;
    }

    public Long getConid() {
        return conid;
    }

    public void setConid(Long conid) {
        this.conid = conid;
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
}