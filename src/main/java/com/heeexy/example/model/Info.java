package com.heeexy.example.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;

public class Info implements Serializable {
    @Excel(name = "单号")
    private String num;
    @Excel(name = "数量")
    private Integer quantity;
    @Excel(name = "单价")
    private Double price;
    @Excel(name = "金额")
    private Double amount;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
