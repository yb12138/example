package com.heeexy.example.model;

public class Afterreason {
    private Integer reasonid;

    private String reasonname;

    public Integer getReasonid() {
        return reasonid;
    }

    public void setReasonid(Integer reasonid) {
        this.reasonid = reasonid;
    }

    public String getReasonname() {
        return reasonname;
    }

    public void setReasonname(String reasonname) {
        this.reasonname = reasonname == null ? null : reasonname.trim();
    }
}