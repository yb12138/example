package com.heeexy.example.model;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import com.alibaba.fastjson.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.List;

public class ProductWarehouseStorageBack implements Serializable {
    private Integer backid;

    private Integer productid;
    @Excel(name = "产品sku", orderNum = "0", needMerge = true)
    private String skucode;
    @Excel(name = "仓库名称", orderNum = "2", needMerge = true)
    private String warehousename;

    private Long warehouseid;
    @Excel(name = "在售库存", orderNum = "3", needMerge = true)
    private Integer onsell;
    @Excel(name = "采购库存", orderNum = "4", needMerge = true)
    private Integer onpurchase;
    @Excel(name = "中仓库存", orderNum = "5", needMerge = true)
    private Integer oncnwarehouse;
    @Excel(name = "在途库存", orderNum = "6", needMerge = true)
    private Integer onway;

    private Integer month;

    private Integer day;
    @Excel(name = "产品单价", orderNum = "8", needMerge = true)
    private Double cost;
    @Excel(name = "库存合计", orderNum = "7", needMerge = true)
    private Integer onall;
    @Excel(name = "中文名称", orderNum = "1", needMerge = true)
    private String cnname;
    @ExcelCollection(name = "采购信息", orderNum = "9")
    private List<Info> purchasestr;
    @ExcelCollection(name = "中仓信息", orderNum = "10")
    private List<Info> cnwarehousestr;
    @ExcelCollection(name = "在途信息", orderNum = "11")
    private List<Info> onwaystr;
    @ExcelCollection(name = "海外仓信息", orderNum = "12")
    private List<Info> onwarehousestr;

    public Integer getBackid() {
        return backid;
    }

    public void setBackid(Integer backid) {
        this.backid = backid;
    }


    private String imgurl;


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

    public Integer getOnall() {
        return onall;
    }

    public void setOnall(Integer onall) {
        this.onall = onall;
    }


    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
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

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public List<Info> getPurchasestr() {
        return purchasestr;
    }

    public void setPurchasestr(List<Info> purchasestr) {
        this.purchasestr = purchasestr;
    }

    public List<Info> getCnwarehousestr() {
        return cnwarehousestr;
    }

    public void setCnwarehousestr(List<Info> cnwarehousestr) {
        this.cnwarehousestr = cnwarehousestr;
    }

    public List<Info> getOnwaystr() {
        return onwaystr;
    }

    public void setOnwaystr(List<Info> onwaystr) {
        this.onwaystr = onwaystr;
    }

    public List<Info> getOnwarehousestr() {
        return onwarehousestr;
    }

    public void setOnwarehousestr(List<Info> onwarehousestr) {
        this.onwarehousestr = onwarehousestr;
    }
}