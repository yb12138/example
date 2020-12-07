package com.heeexy.example.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;

public class EbayWarehouseoutSku {
    private Integer packageskuid;

    private Integer productid;
    @Excel(name = "产品数量")
    private Integer quantity;

    private Integer wowsid;
    @Excel(name = "采购价")
    private Double price;
    @Excel(name = "采购运费")
    private Double fare;
    @Excel(name = "包裹号")
    private Long packageid;

    public Integer getPackageskuid() {
        return packageskuid;
    }

    public void setPackageskuid(Integer packageskuid) {
        this.packageskuid = packageskuid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getWowsid() {
        return wowsid;
    }

    public void setWowsid(Integer wowsid) {
        this.wowsid = wowsid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public Long getPackageid() {
        return packageid;
    }

    public void setPackageid(Long packageid) {
        this.packageid = packageid;
    }
}