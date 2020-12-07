package com.heeexy.example.model;

import java.util.Date;

public class Warninfo {

    private Integer productid;

    private String skucode;

    private Integer storagequantity;

    private Integer purchasequantity;

    private Integer cnquantity;

    private Integer wayquantity;

    private Integer warnquantity;

    private Integer actualquantity;

    private String averagesalesqty7;

    private String averagesalesqty15;

    private String averagesalesqty;

    private Byte status;

    private Date updatetime;

    private String type;

    private String imgurl;

    private String cnname;

    private String warehousename;

    private String headwaytype;

    public String getHeadwaytype() {
        return headwaytype;
    }

    public void setHeadwaytype(String headwaytype) {
        this.headwaytype = headwaytype;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname;
    }

    public String getWarehousename() {
        return warehousename;
    }

    public void setWarehousename(String warehousename) {
        this.warehousename = warehousename;
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

    public Integer getStoragequantity() {
        return storagequantity;
    }

    public void setStoragequantity(Integer storagequantity) {
        this.storagequantity = storagequantity;
    }

    public Integer getPurchasequantity() {
        return purchasequantity;
    }

    public void setPurchasequantity(Integer purchasequantity) {
        this.purchasequantity = purchasequantity;
    }

    public Integer getCnquantity() {
        return cnquantity;
    }

    public void setCnquantity(Integer cnquantity) {
        this.cnquantity = cnquantity;
    }

    public Integer getWayquantity() {
        return wayquantity;
    }

    public void setWayquantity(Integer wayquantity) {
        this.wayquantity = wayquantity;
    }

    public Integer getWarnquantity() {
        return warnquantity;
    }

    public void setWarnquantity(Integer warnquantity) {
        this.warnquantity = warnquantity;
    }

    public Integer getActualquantity() {
        return actualquantity;
    }

    public void setActualquantity(Integer actualquantity) {
        this.actualquantity = actualquantity;
    }

    public String getAveragesalesqty7() {
        return averagesalesqty7;
    }

    public void setAveragesalesqty7(String averagesalesqty7) {
        this.averagesalesqty7 = averagesalesqty7 == null ? null : averagesalesqty7.trim();
    }

    public String getAveragesalesqty15() {
        return averagesalesqty15;
    }

    public void setAveragesalesqty15(String averagesalesqty15) {
        this.averagesalesqty15 = averagesalesqty15 == null ? null : averagesalesqty15.trim();
    }

    public String getAveragesalesqty() {
        return averagesalesqty;
    }

    public void setAveragesalesqty(String averagesalesqty) {
        this.averagesalesqty = averagesalesqty == null ? null : averagesalesqty.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}