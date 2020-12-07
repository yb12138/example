package com.heeexy.example.model;

public class DatacaciquesSubOrder {
    private Long sysorderid;

    private String pftransactionid;

    private String pforderid;

    private String title;

    private String pfitemid;

    private String syssku;

    private String pfsku;

    private Double pfitemprice;

    private String pfquantity;

    private String pfshippingamount;

    private Integer platformid;

    private String coverurl;

    private String siteid;

    private String createtime;

    public Long getSysorderid() {
        return sysorderid;
    }

    public void setSysorderid(Long sysorderid) {
        this.sysorderid = sysorderid;
    }

    public String getPftransactionid() {
        return pftransactionid;
    }

    public void setPftransactionid(String pftransactionid) {
        this.pftransactionid = pftransactionid == null ? null : pftransactionid.trim();
    }

    public String getPforderid() {
        return pforderid;
    }

    public void setPforderid(String pforderid) {
        this.pforderid = pforderid == null ? null : pforderid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPfitemid() {
        return pfitemid;
    }

    public void setPfitemid(String pfitemid) {
        this.pfitemid = pfitemid == null ? null : pfitemid.trim();
    }

    public String getSyssku() {
        return syssku;
    }

    public void setSyssku(String syssku) {
        this.syssku = syssku == null ? null : syssku.trim();
    }

    public String getPfsku() {
        return pfsku;
    }

    public void setPfsku(String pfsku) {
        this.pfsku = pfsku == null ? null : pfsku.trim();
    }

    public Double getPfitemprice() {
        return pfitemprice;
    }

    public void setPfitemprice(Double pfitemprice) {
        this.pfitemprice = pfitemprice;
    }

    public String getPfquantity() {
        return pfquantity;
    }

    public void setPfquantity(String pfquantity) {
        this.pfquantity = pfquantity == null ? null : pfquantity.trim();
    }

    public String getPfshippingamount() {
        return pfshippingamount;
    }

    public void setPfshippingamount(String pfshippingamount) {
        this.pfshippingamount = pfshippingamount == null ? null : pfshippingamount.trim();
    }

    public Integer getPlatformid() {
        return platformid;
    }

    public void setPlatformid(Integer platformid) {
        this.platformid = platformid;
    }

    public String getCoverurl() {
        return coverurl;
    }

    public void setCoverurl(String coverurl) {
        this.coverurl = coverurl == null ? null : coverurl.trim();
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid == null ? null : siteid.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }
}