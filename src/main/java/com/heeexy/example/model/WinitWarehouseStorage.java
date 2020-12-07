package com.heeexy.example.model;

public class WinitWarehouseStorage {
    private Integer productid;

    private Long worehouseid;

    private String worehousename;

    private Double productlength;

    private Double weight;

    private Double height;

    private Double volume;

    private String qtyavailable;

    private String doi;

    private String averagesalesqty7;

    private String averagesalesqty15;

    private String averagesalesqty;

    private String qtyordered;

    private String qtyreserved;

    private Double avaday;

    private String skucode;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Long getWorehouseid() {
        return worehouseid;
    }

    public void setWorehouseid(Long worehouseid) {
        this.worehouseid = worehouseid;
    }

    public String getWorehousename() {
        return worehousename;
    }

    public void setWorehousename(String worehousename) {
        this.worehousename = worehousename == null ? null : worehousename.trim();
    }

    public Double getProductlength() {
        return productlength;
    }

    public void setProductlength(Double productlength) {
        this.productlength = productlength;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public String getQtyavailable() {
        return qtyavailable;
    }

    public void setQtyavailable(String qtyavailable) {
        this.qtyavailable = qtyavailable == null ? null : qtyavailable.trim();
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi == null ? null : doi.trim();
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

    public String getQtyordered() {
        return qtyordered;
    }

    public void setQtyordered(String qtyordered) {
        this.qtyordered = qtyordered == null ? null : qtyordered.trim();
    }

    public String getQtyreserved() {
        return qtyreserved;
    }

    public void setQtyreserved(String qtyreserved) {
        this.qtyreserved = qtyreserved == null ? null : qtyreserved.trim();
    }

    public Double getAvaday() {
        return avaday;
    }

    public void setAvaday(Double avaday) {
        this.avaday = avaday;
    }

    public String getSkucode() {
        return skucode;
    }

    public void setSkucode(String skucode) {
        this.skucode = skucode == null ? null : skucode.trim();
    }
}