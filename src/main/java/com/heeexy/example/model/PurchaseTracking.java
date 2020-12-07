package com.heeexy.example.model;

import java.util.Date;

public class PurchaseTracking {
    private Integer id;

    private String shiptrackingid;

    private Integer purchaseid;

    private Date createtime;

    private String purchasenum;

    private String logics;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShiptrackingid() {
        return shiptrackingid;
    }

    public void setShiptrackingid(String shiptrackingid) {
        this.shiptrackingid = shiptrackingid == null ? null : shiptrackingid.trim();
    }

    public Integer getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(Integer purchaseid) {
        this.purchaseid = purchaseid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getPurchasenum() {
        return purchasenum;
    }

    public void setPurchasenum(String purchasenum) {
        this.purchasenum = purchasenum == null ? null : purchasenum.trim();
    }

    public String getLogics() {
        return logics;
    }

    public void setLogics(String logics) {
        this.logics = logics == null ? null : logics.trim();
    }
}