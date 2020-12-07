package com.heeexy.example.model;


import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;

import java.io.Serializable;
import java.util.List;

public class EbayOrderProfit implements Serializable {

    @Excel(name = "订单号", needMerge = true)
    private String orderid;
    @Excel(name = "利润", type = 10, needMerge = true)
    private Double profit;
    @Excel(name = "金额", type = 10, needMerge = true)
    private Double amount;
    @Excel(name = "销售平台佣金", type = 10, needMerge = true)
    private Double packageplatfee;
    @Excel(name = "收款平台佣金", type = 10, needMerge = true)
    private Double pftransferamount;
    @Excel(name = "派送费用", type = 10, needMerge = true)
    private Double deliverycosts;
    @Excel(name = "winit订单处理费", type = 10, needMerge = true)
    private Double handlingfee;
    @Excel(name = "返利", type = 10, needMerge = true)
    private Double rebate;
    @Excel(name = "入库处理费（RMB）", type = 10, needMerge = true)
    private Double paidamount;
    @Excel(name = "头程运费+税收（RMB）", type = 10, needMerge = true)
    private Double fare;
    @Excel(name = "中仓处理费", type = 10, needMerge = true)
    private Double price;
    @Excel(name = "采购成本", type = 10, needMerge = true)
    private Double cost;
    @Excel(name = "采购运费", needMerge = true)
    private Double freight;
    @Excel(name = "创建日期", needMerge = true)
    private String createtime;
    @Excel(name = "汇率", type = 10, needMerge = true)
    private Double rate;
    @Excel(name = "币种", needMerge = true)
    private String gbp;
    private String sku;
    private String cnName;
    @ExcelCollection(name = "产品sku")
    private List<EbayOrderSku> skus;

    @Excel(name = "毛利a", needMerge = true)
    private Double profita;
    @Excel(name = "毛利b", needMerge = true)
    private Double profitb;
    @Excel(name = "毛利c", needMerge = true)
    private Double profitc;
    @Excel(name = "毛利c率", needMerge = true)
    private Double profitcrate;
    @Excel(name = "产品成本占比%", needMerge = true)
    private Double costrate;


    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getPackageplatfee() {
        return packageplatfee;
    }

    public void setPackageplatfee(Double packageplatfee) {
        this.packageplatfee = packageplatfee;
    }

    public Double getPftransferamount() {
        return pftransferamount;
    }

    public void setPftransferamount(Double pftransferamount) {
        this.pftransferamount = pftransferamount;
    }

    public Double getDeliverycosts() {
        return deliverycosts;
    }

    public void setDeliverycosts(Double deliverycosts) {
        this.deliverycosts = deliverycosts;
    }

    public Double getHandlingfee() {
        return handlingfee;
    }

    public void setHandlingfee(Double handlingfee) {
        this.handlingfee = handlingfee;
    }

    public Double getRebate() {
        return rebate;
    }

    public void setRebate(Double rebate) {
        this.rebate = rebate;
    }

    public Double getPaidamount() {
        return paidamount;
    }

    public void setPaidamount(Double paidamount) {
        this.paidamount = paidamount;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getGbp() {
        return gbp;
    }

    public void setGbp(String gbp) {
        this.gbp = gbp == null ? null : gbp.trim();
    }

    public Double getProfita() {
        return profita;
    }

    public void setProfita(Double profita) {
        this.profita = profita;
    }

    public Double getProfitb() {
        return profitb;
    }

    public void setProfitb(Double profitb) {
        this.profitb = profitb;
    }

    public Double getProfitc() {
        return profitc;
    }

    public void setProfitc(Double profitc) {
        this.profitc = profitc;
    }

    public Double getProfitcrate() {
        return profitcrate;
    }

    public void setProfitcrate(Double profitcrate) {
        this.profitcrate = profitcrate;
    }

    public Double getCostrate() {
        return costrate;
    }

    public void setCostrate(Double costrate) {
        this.costrate = costrate;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public List<EbayOrderSku> getSkus() {
        return skus;
    }

    public void setSkus(List<EbayOrderSku> skus) {
        this.skus = skus;
    }

    public Double getFreight() {
        return freight;
    }

    public void setFreight(Double freight) {
        this.freight = freight;
    }
}