package com.heeexy.example.model;

public class ProductWarehouseStorageBackInfo {
    private Integer backid;

    private String purchasestr;

    private String cnwarehousestr;

    private String onwaystr;

    private String onwarehousestr;

    public Integer getBackid() {
        return backid;
    }

    public void setBackid(Integer backid) {
        this.backid = backid;
    }

    public String getPurchasestr() {
        return purchasestr;
    }

    public void setPurchasestr(String purchasestr) {
        this.purchasestr = purchasestr == null ? null : purchasestr.trim();
    }

    public String getCnwarehousestr() {
        return cnwarehousestr;
    }

    public void setCnwarehousestr(String cnwarehousestr) {
        this.cnwarehousestr = cnwarehousestr == null ? null : cnwarehousestr.trim();
    }

    public String getOnwaystr() {
        return onwaystr;
    }

    public void setOnwaystr(String onwaystr) {
        this.onwaystr = onwaystr == null ? null : onwaystr.trim();
    }

    public String getOnwarehousestr() {
        return onwarehousestr;
    }

    public void setOnwarehousestr(String onwarehousestr) {
        this.onwarehousestr = onwarehousestr == null ? null : onwarehousestr.trim();
    }
}