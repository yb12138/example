package com.heeexy.example.model;

public class Productgroup {
    private Integer productgroupid;

    private String productgroupname;

    public Integer getProductgroupid() {
        return productgroupid;
    }

    public void setProductgroupid(Integer productgroupid) {
        this.productgroupid = productgroupid;
    }

    public String getProductgroupname() {
        return productgroupname;
    }

    public void setProductgroupname(String productgroupname) {
        this.productgroupname = productgroupname == null ? null : productgroupname.trim();
    }
}