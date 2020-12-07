package com.heeexy.example.model;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class WarehouseOutWarrant implements Serializable {
    @Excel(name = "出库编号", needMerge = true)
    @JsonProperty(value = "outID")
    private Integer outid;
    @Excel(name = "出库单号", needMerge = true)
    @JsonProperty(value = "outNum")
    private String outnum;
    @Excel(name = "出库类型", needMerge = true)
    private String type;

    private Integer status;

    private Integer userid;
    @Excel(name = "创建日期", needMerge = true, format = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;
    @JsonProperty(value = "warehouseID")

    private Long warehouseid;
    @Excel(name = "海外仓库", needMerge = true)
    @JsonProperty(value = "warehouseName")
    private String warehousename;
    @Excel(name = "创建人", needMerge = true)
    private String createname;

    private Integer arrivestatus;
    @JsonProperty(value = "warehouseOrder")
    @Excel(name = "海外仓入库单", needMerge = true)
    private String warehouseorder;
    @Excel(name = "备注", needMerge = true)
    private String remark;
    @JsonProperty(value = "cnWarehouseName")
    @Excel(name = "中仓名称", needMerge = true)
    private String cnwarehousename;

    private String nickname;

    @ExcelCollection(name = "产品sku")
    private List<WarehouseOutWarrantSku> skus;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<WarehouseOutWarrantSku> getSkus() {
        return skus;
    }

    public void setSkus(List<WarehouseOutWarrantSku> skus) {
        this.skus = skus;
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

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname == null ? null : createname.trim();
    }

    public Integer getArrivestatus() {
        return arrivestatus;
    }

    public void setArrivestatus(Integer arrivestatus) {
        this.arrivestatus = arrivestatus;
    }

    public String getWarehouseorder() {
        return warehouseorder;
    }

    public void setWarehouseorder(String warehouseorder) {
        this.warehouseorder = warehouseorder == null ? null : warehouseorder.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCnwarehousename() {
        return cnwarehousename;
    }

    public void setCnwarehousename(String cnwarehousename) {
        this.cnwarehousename = cnwarehousename == null ? null : cnwarehousename.trim();
    }
}