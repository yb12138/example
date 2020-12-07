package com.heeexy.example.model;

import java.util.Date;

public class DatacaciquesOrderPackageRelation {
    private Long syssuborderid;

    private Long sysorderid;

    private Long packageid;

    private Integer pfquantity;

    private Integer sysquantity;

    private Date createtime;

    public Long getSyssuborderid() {
        return syssuborderid;
    }

    public void setSyssuborderid(Long syssuborderid) {
        this.syssuborderid = syssuborderid;
    }

    public Long getSysorderid() {
        return sysorderid;
    }

    public void setSysorderid(Long sysorderid) {
        this.sysorderid = sysorderid;
    }

    public Long getPackageid() {
        return packageid;
    }

    public void setPackageid(Long packageid) {
        this.packageid = packageid;
    }

    public Integer getPfquantity() {
        return pfquantity;
    }

    public void setPfquantity(Integer pfquantity) {
        this.pfquantity = pfquantity;
    }

    public Integer getSysquantity() {
        return sysquantity;
    }

    public void setSysquantity(Integer sysquantity) {
        this.sysquantity = sysquantity;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}