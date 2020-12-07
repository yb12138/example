package com.heeexy.example.model;

public class WinitOutOrder {
    private String exwarehouseid;

    private String sku;

    private Integer itemqty;

    private Double weight;

    private String countryname;

    private String documentnum;

    private String status;

    private String ebaysellerid;

    private String sellerorderno;

    private String statusname;

    private Integer warehouseid;

    private String warehousename;

    public String getExwarehouseid() {
        return exwarehouseid;
    }

    public void setExwarehouseid(String exwarehouseid) {
        this.exwarehouseid = exwarehouseid == null ? null : exwarehouseid.trim();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public Integer getItemqty() {
        return itemqty;
    }

    public void setItemqty(Integer itemqty) {
        this.itemqty = itemqty;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname == null ? null : countryname.trim();
    }

    public String getDocumentnum() {
        return documentnum;
    }

    public void setDocumentnum(String documentnum) {
        this.documentnum = documentnum == null ? null : documentnum.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getEbaysellerid() {
        return ebaysellerid;
    }

    public void setEbaysellerid(String ebaysellerid) {
        this.ebaysellerid = ebaysellerid == null ? null : ebaysellerid.trim();
    }

    public String getSellerorderno() {
        return sellerorderno;
    }

    public void setSellerorderno(String sellerorderno) {
        this.sellerorderno = sellerorderno == null ? null : sellerorderno.trim();
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname == null ? null : statusname.trim();
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
}