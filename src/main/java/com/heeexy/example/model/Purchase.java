package com.heeexy.example.model;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Purchase implements Serializable {
    private static final long serialVersionUID = 125614823156L;

    private Integer purchaseid;
    @Excel(name = "采购单号", orderNum = "0", needMerge = true)
    private String purchasenum;

    private Long warehouseid;

    @Excel(name = "仓库名称", orderNum = "1", needMerge = true)
    private String warehousename;

    private Integer supplierid;
    @Excel(name = "供应商名称", orderNum = "2", needMerge = true)
    private String suppliername;
    @Excel(name = "供应商订单号", orderNum = "3", needMerge = true)
    private String supplierordernumber;

    private Byte specialstatus;

    private Byte purchasestatus;

    private Byte financestatus;

    private Byte cnwarehouseinstatus;

    private Byte cnwarehouseoutstatus;

    @Excel(name = "采购库存", orderNum = "4", needMerge = true)
    private Integer purchasetotalquantity;

    @Excel(name = "采购金额", orderNum = "5", needMerge = true)
    private BigDecimal purchasetotalamount;
    @Excel(name = "已付金额", orderNum = "8", needMerge = true)
    private BigDecimal haspaytotalamount;

    @Excel(name = "交易号", orderNum = "9", needMerge = true)
    private String transactionnumber;

    @Excel(name = "应付金额", orderNum = "7", needMerge = true)
    private BigDecimal paidtotalamount;

    @Excel(name = "运费", orderNum = "6", needMerge = true)
    private BigDecimal freighttotalamount;

    private Integer createid;

    @Excel(name = "创建人", orderNum = "10", needMerge = true)
    private String createname;

    private Integer financeauditorid;

    @Excel(name = "财务审核员", orderNum = "11", needMerge = true)
    private String financeauditorname;

    @Excel(name = "创建日期", orderNum = "12", needMerge = true, format = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    @Excel(name = "在库库存", orderNum = "13", needMerge = true)
    private Integer stockintotalquantity;

    @Excel(name = "退货库存", orderNum = "14", needMerge = true)
    private Integer defectivetotalquantity;
    @Excel(name = "在库金额", orderNum = "15", needMerge = true)
    private BigDecimal stockintotalamount;
    @Excel(name = "退货金额", orderNum = "16", needMerge = true)
    private BigDecimal defectivetotalamount;

    private Integer updateid;

    private String updatename;

    private Date updatetime;

    @Excel(name = "备注", orderNum = "17", needMerge = true)
    private String remark;
    @Excel(name = "付款时间", orderNum = "18", needMerge = true, format = "yyyy-MM-dd HH:mm:ss")
    private Date paytime;
    @ExcelCollection(name = "产品sku", orderNum = "19")
    private List<PurchaseSku> skuList;

    public List<PurchaseSku> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<PurchaseSku> skuList) {
        this.skuList = skuList;
    }

    public Integer getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(Integer purchaseid) {
        this.purchaseid = purchaseid;
    }

    public String getPurchasenum() {
        return purchasenum;
    }

    public void setPurchasenum(String purchasenum) {
        this.purchasenum = purchasenum == null ? null : purchasenum.trim();
    }

    public Long getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Long warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getWarehousename() {
        return warehousename;
    }

    public void setWarehousename(String warehousename) {
        this.warehousename = warehousename == null ? null : warehousename.trim();
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getSupplierordernumber() {
        return supplierordernumber;
    }

    public void setSupplierordernumber(String supplierordernumber) {
        this.supplierordernumber = supplierordernumber == null ? null : supplierordernumber.trim();
    }

    public Byte getSpecialstatus() {
        return specialstatus;
    }

    public void setSpecialstatus(Byte specialstatus) {
        this.specialstatus = specialstatus;
    }

    public Byte getPurchasestatus() {
        return purchasestatus;
    }

    public void setPurchasestatus(Byte purchasestatus) {
        this.purchasestatus = purchasestatus;
    }

    public Byte getFinancestatus() {
        return financestatus;
    }

    public void setFinancestatus(Byte financestatus) {
        this.financestatus = financestatus;
    }

    public Byte getCnwarehouseinstatus() {
        return cnwarehouseinstatus;
    }

    public void setCnwarehouseinstatus(Byte cnwarehouseinstatus) {
        this.cnwarehouseinstatus = cnwarehouseinstatus;
    }

    public Byte getCnwarehouseoutstatus() {
        return cnwarehouseoutstatus;
    }

    public void setCnwarehouseoutstatus(Byte cnwarehouseoutstatus) {
        this.cnwarehouseoutstatus = cnwarehouseoutstatus;
    }

    public Integer getPurchasetotalquantity() {
        return purchasetotalquantity;
    }

    public void setPurchasetotalquantity(Integer purchasetotalquantity) {
        this.purchasetotalquantity = purchasetotalquantity;
    }

    public BigDecimal getPurchasetotalamount() {
        return purchasetotalamount;
    }

    public void setPurchasetotalamount(BigDecimal purchasetotalamount) {
        this.purchasetotalamount = purchasetotalamount;
    }

    public BigDecimal getHaspaytotalamount() {
        return haspaytotalamount;
    }

    public void setHaspaytotalamount(BigDecimal haspaytotalamount) {
        this.haspaytotalamount = haspaytotalamount;
    }

    public String getTransactionnumber() {
        return transactionnumber;
    }

    public void setTransactionnumber(String transactionnumber) {
        this.transactionnumber = transactionnumber == null ? null : transactionnumber.trim();
    }

    public BigDecimal getPaidtotalamount() {
        return paidtotalamount;
    }

    public void setPaidtotalamount(BigDecimal paidtotalamount) {
        this.paidtotalamount = paidtotalamount;
    }

    public BigDecimal getFreighttotalamount() {
        return freighttotalamount;
    }

    public void setFreighttotalamount(BigDecimal freighttotalamount) {
        this.freighttotalamount = freighttotalamount;
    }

    public Integer getCreateid() {
        return createid;
    }

    public void setCreateid(Integer createid) {
        this.createid = createid;
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname == null ? null : createname.trim();
    }

    public Integer getFinanceauditorid() {
        return financeauditorid;
    }

    public void setFinanceauditorid(Integer financeauditorid) {
        this.financeauditorid = financeauditorid;
    }

    public String getFinanceauditorname() {
        return financeauditorname;
    }

    public void setFinanceauditorname(String financeauditorname) {
        this.financeauditorname = financeauditorname == null ? null : financeauditorname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStockintotalquantity() {
        return stockintotalquantity;
    }

    public void setStockintotalquantity(Integer stockintotalquantity) {
        this.stockintotalquantity = stockintotalquantity;
    }

    public Integer getDefectivetotalquantity() {
        return defectivetotalquantity;
    }

    public void setDefectivetotalquantity(Integer defectivetotalquantity) {
        this.defectivetotalquantity = defectivetotalquantity;
    }

    public BigDecimal getStockintotalamount() {
        return stockintotalamount;
    }

    public void setStockintotalamount(BigDecimal stockintotalamount) {
        this.stockintotalamount = stockintotalamount;
    }

    public BigDecimal getDefectivetotalamount() {
        return defectivetotalamount;
    }

    public void setDefectivetotalamount(BigDecimal defectivetotalamount) {
        this.defectivetotalamount = defectivetotalamount;
    }

    public Integer getUpdateid() {
        return updateid;
    }

    public void setUpdateid(Integer updateid) {
        this.updateid = updateid;
    }

    public String getUpdatename() {
        return updatename;
    }

    public void setUpdatename(String updatename) {
        this.updatename = updatename == null ? null : updatename.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Purchase() {
    }
}