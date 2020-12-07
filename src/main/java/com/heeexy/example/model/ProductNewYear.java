package com.heeexy.example.model;


import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;

public class ProductNewYear implements Serializable {
    private Integer productID;
    @Excel(name = "sku")
    private String sku;
    @Excel(name = "消耗完时间")
    private String finishtime;
    @Excel(name = "最早到达时间")
    private String needtime;
    @Excel(name = "补货数")
    private Integer stock;
    @Excel(name = "价格")
    private Double price;

    public ProductNewYear() {
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(String finishtime) {
        this.finishtime = finishtime;
    }

    public String getNeedtime() {
        return needtime;
    }

    public void setNeedtime(String needtime) {
        this.needtime = needtime;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
