package com.heeexy.example.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PurchaseSku implements Serializable {
    private static final long serialVersionUID = 10000541254315L;
    private Integer id;

    private Integer productid;
    @Excel(name = "产品sku", orderNum = "1")
    private String sku;

    private Long warehouseid;

    private Integer purchaseid;

    private Integer supplierid;
    @Excel(name = "采购数量", orderNum = "2")
    private Integer purchasequantity;

    private Integer stockinquantity;

    private Integer defectivequantity;
    @Excel(name = "产品单价", orderNum = "3")
    private BigDecimal unitprice;

    private BigDecimal purchaseamount;

    private BigDecimal stockinamount;

    private BigDecimal defectiveamount;

    private Integer appendquantity;

    private Integer createid;

    private Date createtime;

    private Date updatetime;

    private Integer updateid;

    private String updatename;

    private String remake;

    private String createname;
    private String cnname;

    private Integer usequantity;

    private String imgurl;

    private String supplierlink1;


    public String getSupplierlink1() {
        return supplierlink1;
    }

    public void setSupplierlink1(String supplierlink1) {
        this.supplierlink1 = supplierlink1;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public Long getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Long warehouseid) {
        this.warehouseid = warehouseid;
    }

    public Integer getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(Integer purchaseid) {
        this.purchaseid = purchaseid;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Integer getPurchasequantity() {
        return purchasequantity;
    }

    public void setPurchasequantity(Integer purchasequantity) {
        this.purchasequantity = purchasequantity;
    }

    public Integer getStockinquantity() {
        return stockinquantity;
    }

    public void setStockinquantity(Integer stockinquantity) {
        this.stockinquantity = stockinquantity;
    }

    public Integer getDefectivequantity() {
        return defectivequantity;
    }

    public void setDefectivequantity(Integer defectivequantity) {
        this.defectivequantity = defectivequantity;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public BigDecimal getPurchaseamount() {
        return purchaseamount;
    }

    public void setPurchaseamount(BigDecimal purchaseamount) {
        this.purchaseamount = purchaseamount;
    }

    public BigDecimal getStockinamount() {
        return stockinamount;
    }

    public void setStockinamount(BigDecimal stockinamount) {
        this.stockinamount = stockinamount;
    }

    public BigDecimal getDefectiveamount() {
        return defectiveamount;
    }

    public void setDefectiveamount(BigDecimal defectiveamount) {
        this.defectiveamount = defectiveamount;
    }

    public Integer getAppendquantity() {
        return appendquantity;
    }

    public void setAppendquantity(Integer appendquantity) {
        this.appendquantity = appendquantity;
    }

    public Integer getCreateid() {
        return createid;
    }

    public void setCreateid(Integer createid) {
        this.createid = createid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getUpdateid() {
        return updateid;
    }

    public void setUpdateid(Integer updateid) {
        this.updateid = updateid;
    }

    public String getUpdatename() {
        return updatename;
    }

    public void setUpdatename(String updatename) {
        this.updatename = updatename == null ? null : updatename.trim();
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake == null ? null : remake.trim();
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname == null ? null : createname.trim();
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname == null ? null : cnname.trim();
    }

    public Integer getUsequantity() {
        return usequantity;
    }

    public void setUsequantity(Integer usequantity) {
        this.usequantity = usequantity;
    }

    public PurchaseSku() {
    }
}