package com.heeexy.example.model;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WarehouseInWarrantSku implements Serializable {
    @JsonProperty(value = "inSkuID")
    private Integer inskuid;
    @JsonProperty(value = "inID")
    private Integer inid;
    @JsonProperty(value = "productID")
    private Integer productid;
    @Excel(name = "计划入库数量", orderNum = "4")
    private Integer typecount;
    @JsonProperty(value = "inCount")
    @Excel(name = "实际入库数量", orderNum = "5")
    private Integer incount;

    private Date createtime;
    @JsonProperty(value = "skuCode")
    @Excel(name = "产品sku", orderNum = "1")
    private String skucode;
    @Excel(name = "单价", orderNum = "2")
    private BigDecimal unitprice;
    @Excel(name = "平均运费", orderNum = "3")
    private BigDecimal fare;

    private Byte status;
    @Excel(name = "已出库数量", orderNum = "6")
    private Integer outcount;

    private String innum;

    private String imgurl;

    private String cnName;

    private Integer useCount;

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
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

    public Integer getUseCount() {
        return useCount;
    }

    private Integer purchaseskuid;

    private String remark;

    public Integer getInskuid() {
        return inskuid;
    }

    public void setInskuid(Integer inskuid) {
        this.inskuid = inskuid;
    }

    public Integer getInid() {
        return inid;
    }

    public void setInid(Integer inid) {
        this.inid = inid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
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

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public BigDecimal getFare() {
        return fare;
    }

    public void setFare(BigDecimal fare) {
        this.fare = fare;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getOutcount() {
        return outcount;
    }

    public void setOutcount(Integer outcount) {
        this.outcount = outcount;
    }

    public String getInnum() {
        return innum;
    }

    public void setInnum(String innum) {
        this.innum = innum == null ? null : innum.trim();
    }

    public Integer getPurchaseskuid() {
        return purchaseskuid;
    }

    public void setPurchaseskuid(Integer purchaseskuid) {
        this.purchaseskuid = purchaseskuid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}