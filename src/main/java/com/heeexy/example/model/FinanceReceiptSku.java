package com.heeexy.example.model;

public class FinanceReceiptSku {
    private Integer receiptskuid;

    private Integer receiptid;

    private String receiptnum;

    private Integer outquantity;

    private Integer productid;

    private String skucode;

    private Integer purchaseskuid;

    public Integer getReceiptskuid() {
        return receiptskuid;
    }

    public void setReceiptskuid(Integer receiptskuid) {
        this.receiptskuid = receiptskuid;
    }

    public Integer getReceiptid() {
        return receiptid;
    }

    public void setReceiptid(Integer receiptid) {
        this.receiptid = receiptid;
    }

    public String getReceiptnum() {
        return receiptnum;
    }

    public void setReceiptnum(String receiptnum) {
        this.receiptnum = receiptnum == null ? null : receiptnum.trim();
    }

    public Integer getOutquantity() {
        return outquantity;
    }

    public void setOutquantity(Integer outquantity) {
        this.outquantity = outquantity;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getSkucode() {
        return skucode;
    }

    public void setSkucode(String skucode) {
        this.skucode = skucode == null ? null : skucode.trim();
    }

    public Integer getPurchaseskuid() {
        return purchaseskuid;
    }

    public void setPurchaseskuid(Integer purchaseskuid) {
        this.purchaseskuid = purchaseskuid;
    }
}