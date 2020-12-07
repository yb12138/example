package com.heeexy.example.model;

public class GoodcangWarehouseStorage {
    private Integer productid;

    private String productSku;

    private String warehouseCode;

    private String warehousename;

    private Integer onway;

    private Integer pending;

    private Integer sellable;

    private Integer unsellable;

    private Integer reserved;

    private Integer shipped;

    private String productBarcode;

    private Integer soldShared;

    private Integer stocking;

    private Integer piNoStock;

    private Integer tuneOut;

    private Integer tuneIn;

    private Double productSalesValue;

    private String warehouseDesc;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductSku() {
        return productSku;
    }

    public void setProductSku(String productSku) {
        this.productSku = productSku == null ? null : productSku.trim();
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode == null ? null : warehouseCode.trim();
    }

    public String getWarehousename() {
        return warehousename;
    }

    public void setWarehousename(String warehousename) {
        this.warehousename = warehousename == null ? null : warehousename.trim();
    }

    public Integer getOnway() {
        return onway;
    }

    public void setOnway(Integer onway) {
        this.onway = onway;
    }

    public Integer getPending() {
        return pending;
    }

    public void setPending(Integer pending) {
        this.pending = pending;
    }

    public Integer getSellable() {
        return sellable;
    }

    public void setSellable(Integer sellable) {
        this.sellable = sellable;
    }

    public Integer getUnsellable() {
        return unsellable;
    }

    public void setUnsellable(Integer unsellable) {
        this.unsellable = unsellable;
    }

    public Integer getReserved() {
        return reserved;
    }

    public void setReserved(Integer reserved) {
        this.reserved = reserved;
    }

    public Integer getShipped() {
        return shipped;
    }

    public void setShipped(Integer shipped) {
        this.shipped = shipped;
    }

    public String getProductBarcode() {
        return productBarcode;
    }

    public void setProductBarcode(String productBarcode) {
        this.productBarcode = productBarcode == null ? null : productBarcode.trim();
    }

    public Integer getSoldShared() {
        return soldShared;
    }

    public void setSoldShared(Integer soldShared) {
        this.soldShared = soldShared;
    }

    public Integer getStocking() {
        return stocking;
    }

    public void setStocking(Integer stocking) {
        this.stocking = stocking;
    }

    public Integer getPiNoStock() {
        return piNoStock;
    }

    public void setPiNoStock(Integer piNoStock) {
        this.piNoStock = piNoStock;
    }

    public Integer getTuneOut() {
        return tuneOut;
    }

    public void setTuneOut(Integer tuneOut) {
        this.tuneOut = tuneOut;
    }

    public Integer getTuneIn() {
        return tuneIn;
    }

    public void setTuneIn(Integer tuneIn) {
        this.tuneIn = tuneIn;
    }

    public Double getProductSalesValue() {
        return productSalesValue;
    }

    public void setProductSalesValue(Double productSalesValue) {
        this.productSalesValue = productSalesValue;
    }

    public String getWarehouseDesc() {
        return warehouseDesc;
    }

    public void setWarehouseDesc(String warehouseDesc) {
        this.warehouseDesc = warehouseDesc == null ? null : warehouseDesc.trim();
    }
}