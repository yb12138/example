package com.heeexy.example.model;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class WarehouseInWarrant implements Serializable {
    @JsonProperty(value = "inID")
    private Integer inid;
    @JsonProperty(value = "inNum")
    @Excel(name = "入库单号", orderNum = "1", needMerge = true)
    private String innum;
    @Excel(name = "入库类型", orderNum = "2", needMerge = true)
    private String type;

    private Integer status;

    private Integer userid;
    @Excel(name = "创建日期", orderNum = "4", needMerge = true, format = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;
    @JsonProperty(value = "purchaseID")
    private Integer purchaseid;
    @JsonProperty(value = "purchaseNum")
    @Excel(name = "采购单号", orderNum = "5", needMerge = true)
    private String purchasenum;
    @JsonProperty(value = "warehouseID")
    private Integer warehouseid;
    @Excel(name = "仓库名称", orderNum = "6", needMerge = true)
    private String warehousename;

    private String username;
    @Excel(name = "备注", orderNum = "7", needMerge = true)
    private String remark;

    private String headwaytype;
    @ExcelCollection(name = "产品信息", orderNum = "8")
    private List<WarehouseInWarrantSku> skus;

    public List<WarehouseInWarrantSku> getSkus() {
        return skus;
    }

    public void setSkus(List<WarehouseInWarrantSku> skus) {
        this.skus = skus;
    }

    public Integer getInid() {
        return inid;
    }

    public void setInid(Integer inid) {
        this.inid = inid;
    }

    public String getInnum() {
        return innum;
    }

    public void setInnum(String innum) {
        this.innum = innum == null ? null : innum.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(Integer purchaseid) {
        this.purchaseid = purchaseid;
    }

    public String getPurchasenum() {
        return purchasenum;
    }

    public void setPurchasenum(String purchasenum) {
        this.purchasenum = purchasenum == null ? null : purchasenum.trim();
    }

    public Integer getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getWarehousename() {
        return warehousename;
    }

    public void setWarehousename(String warehousename) {
        this.warehousename = warehousename == null ? null : warehousename.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getHeadwaytype() {
        return headwaytype;
    }

    public void setHeadwaytype(String headwaytype) {
        this.headwaytype = headwaytype == null ? null : headwaytype.trim();
    }
}