package com.heeexy.example.model;

public class DatacaciquesPackage {
    private Long packageid;

    private String packagecode;

    private String syspackagestatus;

    private String shiptrackingid;

    private Double productweight;

    private Double realweight;

    private String createtime;

    private Long warehouseid;

    private String currencycode;

    private Double sysproductfee;

    private Double packageplatfee;

    private Double pftransferamount;

    private Double pfshippingamount;

    private Double refundamount;

    private Integer flag;

    public Long getPackageid() {
        return packageid;
    }

    public void setPackageid(Long packageid) {
        this.packageid = packageid;
    }

    public String getPackagecode() {
        return packagecode;
    }

    public void setPackagecode(String packagecode) {
        this.packagecode = packagecode == null ? null : packagecode.trim();
    }

    public String getSyspackagestatus() {
        return syspackagestatus;
    }

    public void setSyspackagestatus(String syspackagestatus) {
        this.syspackagestatus = syspackagestatus == null ? null : syspackagestatus.trim();
    }

    public String getShiptrackingid() {
        return shiptrackingid;
    }

    public void setShiptrackingid(String shiptrackingid) {
        this.shiptrackingid = shiptrackingid == null ? null : shiptrackingid.trim();
    }

    public Double getProductweight() {
        return productweight;
    }

    public void setProductweight(Double productweight) {
        this.productweight = productweight;
    }

    public Double getRealweight() {
        return realweight;
    }

    public void setRealweight(Double realweight) {
        this.realweight = realweight;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public Long getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Long warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getCurrencycode() {
        return currencycode;
    }

    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode == null ? null : currencycode.trim();
    }

    public Double getSysproductfee() {
        return sysproductfee;
    }

    public void setSysproductfee(Double sysproductfee) {
        this.sysproductfee = sysproductfee;
    }

    public Double getPackageplatfee() {
        return packageplatfee;
    }

    public void setPackageplatfee(Double packageplatfee) {
        this.packageplatfee = packageplatfee;
    }

    public Double getPftransferamount() {
        return pftransferamount;
    }

    public void setPftransferamount(Double pftransferamount) {
        this.pftransferamount = pftransferamount;
    }

    public Double getPfshippingamount() {
        return pfshippingamount;
    }

    public void setPfshippingamount(Double pfshippingamount) {
        this.pfshippingamount = pfshippingamount;
    }

    public Double getRefundamount() {
        return refundamount;
    }

    public void setRefundamount(Double refundamount) {
        this.refundamount = refundamount;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}