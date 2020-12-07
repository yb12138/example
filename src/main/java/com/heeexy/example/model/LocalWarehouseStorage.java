package com.heeexy.example.model;

public class LocalWarehouseStorage {
    private Integer productid;

    private String skucode;

    private String warehousename;

    private Long warehouseid;

    private Integer onsell;

    private Integer onpurchase;

    private Integer oncnwarehouse;

    private Integer onway;

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
}