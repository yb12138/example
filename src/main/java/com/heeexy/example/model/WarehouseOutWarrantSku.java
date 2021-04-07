package com.heeexy.example.model;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class WarehouseOutWarrantSku implements Serializable,Comparable<WarehouseOutWarrantSku>{
    @JsonProperty(value = "wowsID")
    private Integer wowsid;
    @JsonProperty(value = "inID")
    private Integer outid;
    @JsonProperty(value = "productID")
    private Integer productid;
    @JsonProperty(value = "outCount")
    @Excel(name = "出库数量", orderNum = "3")
    private Integer outcount;

    private Date createtime;
    @JsonProperty(value = "skuCode")
    @Excel(name = "产品sku", orderNum = "1")
    private String skucode;
    @JsonProperty(value = "inSkuID")
    private Integer inskuid;
    @Excel(name = "备注", orderNum = "6")
    private String remark;

    private String imgurl;
    @Excel(name = "中文名称", orderNum = "2")
    private String cnName;
    @Excel(name = "对应入库单", orderNum = "5")
    private String inNum;

    @Excel(name = "已使用数量", orderNum = "4")
    private Integer usecount;

    private List<JSONObject> inList;

    public List<JSONObject> getInList() {
        return inList;
    }

    public void setInList(List<JSONObject> inList) {
        this.inList = inList;
    }

    public Integer getWowsid() {
        return wowsid;
    }

    public void setWowsid(Integer wowsid) {
        this.wowsid = wowsid;
    }

    public Integer getOutid() {
        return outid;
    }

    public void setOutid(Integer outid) {
        this.outid = outid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getOutcount() {
        return outcount;
    }

    public void setOutcount(Integer outcount) {
        this.outcount = outcount;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getSkucode() {
        return skucode;
    }

    public void setSkucode(String skucode) {
        this.skucode = skucode == null ? null : skucode.trim();
    }

    public Integer getInskuid() {
        return inskuid;
    }

    public void setInskuid(Integer inskuid) {
        this.inskuid = inskuid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getUsecount() {
        return usecount;
    }

    public void setUsecount(Integer usecount) {
        this.usecount = usecount;
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

    public String getInNum() {
        return inNum;
    }

    public void setInNum(String inNum) {
        this.inNum = inNum;
    }


    @Override
    public int compareTo(WarehouseOutWarrantSku warehouseOutWarrantSku) {
        return this.createtime.compareTo(warehouseOutWarrantSku.getCreatetime());
    }
}