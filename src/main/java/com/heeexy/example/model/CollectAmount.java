package com.heeexy.example.model;

public class CollectAmount {
    private Integer amountid;

    private Integer year;

    private Integer month;

    private Double onsellallamount;

    private Double purchaseallamount;

    public Integer getAmountid() {
        return amountid;
    }

    public void setAmountid(Integer amountid) {
        this.amountid = amountid;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Double getOnsellallamount() {
        return onsellallamount;
    }

    public void setOnsellallamount(Double onsellallamount) {
        this.onsellallamount = onsellallamount;
    }

    public Double getPurchaseallamount() {
        return purchaseallamount;
    }

    public void setPurchaseallamount(Double purchaseallamount) {
        this.purchaseallamount = purchaseallamount;
    }
}