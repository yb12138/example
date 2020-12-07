package com.heeexy.example.model;

public class ProductCountry {
    private Integer pcid;

    private Integer productid;

    private String countrycode;

    private Double productlength;

    private Double productwidth;

    private Double productheight;

    private Double importprice;

    private Double exportprice;

    private Double volume;

    private Double weight;

    private String isnew;

    private Double rebaterate;

    private Double importrate;

    public Integer getPcid() {
        return pcid;
    }

    public void setPcid(Integer pcid) {
        this.pcid = pcid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    public Double getProductlength() {
        return productlength;
    }

    public void setProductlength(Double productlength) {
        this.productlength = productlength;
    }

    public Double getProductwidth() {
        return productwidth;
    }

    public void setProductwidth(Double productwidth) {
        this.productwidth = productwidth;
    }

    public Double getProductheight() {
        return productheight;
    }

    public void setProductheight(Double productheight) {
        this.productheight = productheight;
    }

    public Double getImportprice() {
        return importprice;
    }

    public void setImportprice(Double importprice) {
        this.importprice = importprice;
    }

    public Double getExportprice() {
        return exportprice;
    }

    public void setExportprice(Double exportprice) {
        this.exportprice = exportprice;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getIsnew() {
        return isnew;
    }

    public void setIsnew(String isnew) {
        this.isnew = isnew == null ? null : isnew.trim();
    }

    public Double getRebaterate() {
        return rebaterate;
    }

    public void setRebaterate(Double rebaterate) {
        this.rebaterate = rebaterate;
    }

    public Double getImportrate() {
        return importrate;
    }

    public void setImportrate(Double importrate) {
        this.importrate = importrate;
    }
}