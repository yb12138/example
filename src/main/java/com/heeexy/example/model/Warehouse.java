package com.heeexy.example.model;

public class Warehouse {
    private Long warehouseid;

    private String warehousecode;

    private String warehousename;

    private Integer warehousetype;

    public Long getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Long warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getWarehousecode() {
        return warehousecode;
    }

    public void setWarehousecode(String warehousecode) {
        this.warehousecode = warehousecode == null ? null : warehousecode.trim();
    }

    public String getWarehousename() {
        return warehousename;
    }

    public void setWarehousename(String warehousename) {
        this.warehousename = warehousename == null ? null : warehousename.trim();
    }

    public Integer getWarehousetype() {
        return warehousetype;
    }

    public void setWarehousetype(Integer warehousetype) {
        this.warehousetype = warehousetype;
    }
}