package com.heeexy.example.model;

import java.util.Date;

public class EbayWarehouseout {
    private Integer ebaywarehouseid;

    private Long packageid;

    private Integer outid;

    private String sku;

    private Integer productid;

    private Date createtime;

    private String type;

    private Integer wowsid;

    public Integer getEbaywarehouseid() {
        return ebaywarehouseid;
    }

    public void setEbaywarehouseid(Integer ebaywarehouseid) {
        this.ebaywarehouseid = ebaywarehouseid;
    }

    public Long getPackageid() {
        return packageid;
    }

    public void setPackageid(Long packageid) {
        this.packageid = packageid;
    }

    public Integer getOutid() {
        return outid;
    }

    public void setOutid(Integer outid) {
        this.outid = outid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getWowsid() {
        return wowsid;
    }

    public void setWowsid(Integer wowsid) {
        this.wowsid = wowsid;
    }
}