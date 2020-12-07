package com.heeexy.example.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;
import java.math.BigDecimal;

public class AlloOutSku implements Serializable {
    private Integer alloskuid;

    private Integer alloid;

    private String allonum;
    @Excel(name = "计划入库数量", orderNum = "1")
    private Integer typecount;
    @Excel(name = "实际入库数量", orderNum = "2")
    private Integer incount;

    private Integer productid;
    @Excel(name = "sku名称", orderNum = "0")
    private String skucode;
    @Excel(name = "已使用数量", orderNum = "3")
    private Integer usecount;
    @Excel(name = "平均单价", orderNum = "4")
    private BigDecimal price;

    private String imgurl;
    private String cnName;

    private Integer newcount;

    public Integer getNewcount() {
        return newcount;
    }

    public void setNewcount(Integer newcount) {
        this.newcount = newcount;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public Integer getAlloskuid() {
        return alloskuid;
    }

    public void setAlloskuid(Integer alloskuid) {
        this.alloskuid = alloskuid;
    }

    public Integer getAlloid() {
        return alloid;
    }

    public void setAlloid(Integer alloid) {
        this.alloid = alloid;
    }

    public String getAllonum() {
        return allonum;
    }

    public void setAllonum(String allonum) {
        this.allonum = allonum == null ? null : allonum.trim();
    }

    public Integer getTypecount() {
        return typecount;
    }

    public void setTypecount(Integer typecount) {
        this.typecount = typecount;
    }

    public Integer getIncount() {
        return incount;
    }

    public void setIncount(Integer incount) {
        this.incount = incount;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getSkucode() {
        return skucode;
    }

    public void setSkucode(String skucode) {
        this.skucode = skucode == null ? null : skucode.trim();
    }

    public Integer getUsecount() {
        return usecount;
    }

    public void setUsecount(Integer usecount) {
        this.usecount = usecount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}