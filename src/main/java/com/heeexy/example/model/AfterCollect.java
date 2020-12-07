package com.heeexy.example.model;


import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;

public class AfterCollect implements Serializable {
    @Excel(name = "产品sku")
    private String sku;
    @Excel(name = "中文名称")
    private String cnname;
    @Excel(name = "退款金额")
    private Double price;
    @Excel(name = "退货数量")
    private int num;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
