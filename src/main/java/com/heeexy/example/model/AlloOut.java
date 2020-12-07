package com.heeexy.example.model;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AlloOut implements Serializable {
    private Integer alloid;
    @Excel(name = "入库编号", needMerge = true)
    private String allonum;

    private Integer status;

    private Integer userid;
    @Excel(name = "创建日期", needMerge = true, format = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    private Long warehouseid;
    @Excel(name = "仓库名称", needMerge = true)
    private String warehousename;
    @Excel(name = "创建人", needMerge = true)
    private String username;

    private Integer outid;
    @Excel(name = "对应出库单号", needMerge = true)
    private String outnum;
    @Excel(name = "修改日期", needMerge = true, format = "yyyy-MM-dd HH:mm:ss")
    private Date updatetime;
    @Excel(name = "运费", needMerge = true)
    private Double fare;
    @Excel(name = "入库费", needMerge = true)
    private Double storagefare;
    @Excel(name = "税费", needMerge = true)
    private Double valuetax;
    @Excel(name = "入库类型", needMerge = true)
    private String type;
    @Excel(name = "平台单号", needMerge = true)
    private String warehouseorder;
    @Excel(name = "总重量", needMerge = true)
    private Double allweight;
    @Excel(name = "总体积", needMerge = true)
    private Double allvolume;
    @Excel(name = "sku总数", needMerge = true)
    private Integer skuquantity;
    @Excel(name = "上架日期", needMerge = true, format = "yyyy-MM-dd HH:mm:ss")
    private Date arrivetime;
    @ExcelCollection(name = "产品sku")
    private List<AlloOutSku> skus;

    public List<AlloOutSku> getSkus() {
        return skus;
    }

    public void setSkus(List<AlloOutSku> skus) {
        this.skus = skus;
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

    public Long getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Long warehouseid) {
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

    public Integer getOutid() {
        return outid;
    }

    public void setOutid(Integer outid) {
        this.outid = outid;
    }

    public String getOutnum() {
        return outnum;
    }

    public void setOutnum(String outnum) {
        this.outnum = outnum == null ? null : outnum.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public Double getStoragefare() {
        return storagefare;
    }

    public void setStoragefare(Double storagefare) {
        this.storagefare = storagefare;
    }

    public Double getValuetax() {
        return valuetax;
    }

    public void setValuetax(Double valuetax) {
        this.valuetax = valuetax;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getWarehouseorder() {
        return warehouseorder;
    }

    public void setWarehouseorder(String warehouseorder) {
        this.warehouseorder = warehouseorder == null ? null : warehouseorder.trim();
    }

    public Double getAllweight() {
        return allweight;
    }

    public void setAllweight(Double allweight) {
        this.allweight = allweight;
    }

    public Double getAllvolume() {
        return allvolume;
    }

    public void setAllvolume(Double allvolume) {
        this.allvolume = allvolume;
    }

    public Integer getSkuquantity() {
        return skuquantity;
    }

    public void setSkuquantity(Integer skuquantity) {
        this.skuquantity = skuquantity;
    }

    public Date getArrivetime() {
        return arrivetime;
    }

    public void setArrivetime(Date arrivetime) {
        this.arrivetime = arrivetime;
    }
}