package com.heeexy.example.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;

public class ProductWarehouseStorage implements Serializable {

    private Integer productid;
    @Excel(name = "产品sku", orderNum = "0")
    private String skucode;
    @Excel(name = "仓库名称", orderNum = "2")
    private String warehousename;

    private Long warehouseid;
    @Excel(name = "海外仓库存", orderNum = "3")
    private Integer onsell;
    @Excel(name = "采购库存", orderNum = "5")
    private Integer onpurchase;
    @Excel(name = "中仓库存", orderNum = "6")
    private Integer oncnwarehouse;
    @Excel(name = "在途库存", orderNum = "7")
    private Integer onway;

    @Excel(name = "中文名称", orderNum = "1")
    private String cnname;

    private String imgurl;
    @Excel(name = "产品单价", orderNum = "9")
    private Double cost;
    @Excel(name = "库存合计", orderNum = "8")
    private Integer onall;
    @Excel(name = "总计金额", orderNum = "14")
    private Double onallprice;
    @Excel(name = "在售金额", orderNum = "13")
    private Double onsellprice;
    @Excel(name = "采购金额", orderNum = "10")
    private Double onpurchaseprice;
    @Excel(name = "中仓库存", orderNum = "11")
    private Double oncnwarehouseprice;
    @Excel(name = "在途库存", orderNum = "12")
    private Double onwayprice;
    @Excel(name = "本地库存", orderNum = "4")
    private Integer onselllocal;


    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getOnall() {
        return onall;
    }

    public void setOnall(Integer onall) {
        this.onall = onall;
    }

    public Double getOnallprice() {
        return onallprice;
    }

    public void setOnallprice(Double onallprice) {
        this.onallprice = onallprice;
    }

    public Double getOnsellprice() {
        return onsellprice;
    }

    public void setOnsellprice(Double onsellprice) {
        this.onsellprice = onsellprice;
    }

    public Double getOnpurchaseprice() {
        return onpurchaseprice;
    }

    public void setOnpurchaseprice(Double onpurchaseprice) {
        this.onpurchaseprice = onpurchaseprice;
    }

    public Double getOncnwarehouseprice() {
        return oncnwarehouseprice;
    }

    public void setOncnwarehouseprice(Double oncnwarehouseprice) {
        this.oncnwarehouseprice = oncnwarehouseprice;
    }

    public Double getOnwayprice() {
        return onwayprice;
    }

    public void setOnwayprice(Double onwayprice) {
        this.onwayprice = onwayprice;
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

    public String getWarehousename() {
        return warehousename;
    }

    public void setWarehousename(String warehousename) {
        this.warehousename = warehousename == null ? null : warehousename.trim();
    }

    public Long getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Long warehouseid) {
        this.warehouseid = warehouseid;
    }

    public Integer getOnsell() {
        return onsell;
    }

    public void setOnsell(Integer onsell) {
        this.onsell = onsell;
    }

    public Integer getOnpurchase() {
        return onpurchase;
    }

    public void setOnpurchase(Integer onpurchase) {
        this.onpurchase = onpurchase;
    }

    public Integer getOncnwarehouse() {
        return oncnwarehouse;
    }

    public void setOncnwarehouse(Integer oncnwarehouse) {
        this.oncnwarehouse = oncnwarehouse;
    }

    public Integer getOnway() {
        return onway;
    }

    public void setOnway(Integer onway) {
        this.onway = onway;
    }

    public Integer getOnselllocal() {
        return onselllocal;
    }

    public void setOnselllocal(Integer onselllocal) {
        this.onselllocal = onselllocal;
    }
}