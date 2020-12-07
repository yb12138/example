package com.heeexy.example.model;

public class Salegroup {
    private Integer salegroupid;

    private String salegroupname;

    public Integer getSalegroupid() {
        return salegroupid;
    }

    public void setSalegroupid(Integer salegroupid) {
        this.salegroupid = salegroupid;
    }

    public String getSalegroupname() {
        return salegroupname;
    }

    public void setSalegroupname(String salegroupname) {
        this.salegroupname = salegroupname == null ? null : salegroupname.trim();
    }
}