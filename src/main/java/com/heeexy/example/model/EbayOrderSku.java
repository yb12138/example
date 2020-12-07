package com.heeexy.example.model;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;

import java.io.Serializable;
import java.util.List;

public class EbayOrderSku implements Serializable {
    private Integer orderskuid;

    private String orderid;

    private Integer productid;
    @Excel(name = "产品sku", needMerge = true)
    private String sku;
    private String imgurl;
    @Excel(name = "中文名称", needMerge = true)
    private String cnname;

    private Long packageid;
    @Excel(name = "出库单号", needMerge = true)
    private String warehouseCode;
    @Excel(name = "出库数量")
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }


    public Integer getOrderskuid() {
        return orderskuid;
    }

    public void setOrderskuid(Integer orderskuid) {
        this.orderskuid = orderskuid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
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

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname == null ? null : cnname.trim();
    }

    public Long getPackageid() {
        return packageid;
    }

    public void setPackageid(Long packageid) {
        this.packageid = packageid;
    }
}