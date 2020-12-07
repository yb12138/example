package com.heeexy.example.model;


import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@ExcelTarget("aftermarket")
public class Aftermarket implements Serializable {

    private Integer id;
    @Excel(name = "产品sku", orderNum = "0")
    private String sku;

    @Excel(name = "中文名称", orderNum = "1")
    private String cnname;

    @Excel(name = "订单编号", orderNum = "2")
    private String orderid;
    @Excel(name = "客户ID", orderNum = "3")
    private String customid;

    private Integer reasonid;
    @Excel(name = "损坏原因", orderNum = "4")
    private String reasonname;
    @Excel(name = "退款金额", orderNum = "5")
    private String money;
    @Excel(name = "沟通方案1", orderNum = "6")
    private String way1;
    @Excel(name = "沟通方案2", orderNum = "7")
    private String way2;

    private String imgurl;

    private Integer accountid;
    @Excel(name = "账户名称", orderNum = "8")
    private String accountname;

    private Integer paypalid;
    @Excel(name = "Paypal账户", orderNum = "9")
    private String paypaliname;
    @Excel(name = "备注", orderNum = "10")
    private String remark;
    @Excel(name = "创建日期", orderNum = "11", format = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;
    @Excel(name = "售后链接", orderNum = "12")
    private String afterurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname == null ? null : cnname.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getCustomid() {
        return customid;
    }

    public void setCustomid(String customid) {
        this.customid = customid == null ? null : customid.trim();
    }

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

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public String getWay1() {
        return way1;
    }

    public void setWay1(String way1) {
        this.way1 = way1 == null ? null : way1.trim();
    }

    public String getWay2() {
        return way2;
    }

    public void setWay2(String way2) {
        this.way2 = way2 == null ? null : way2.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public Integer getPaypalid() {
        return paypalid;
    }

    public void setPaypalid(Integer paypalid) {
        this.paypalid = paypalid;
    }

    public String getPaypaliname() {
        return paypaliname;
    }

    public void setPaypaliname(String paypaliname) {
        this.paypaliname = paypaliname == null ? null : paypaliname.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getAfterurl() {
        return afterurl;
    }

    public void setAfterurl(String afterurl) {
        this.afterurl = afterurl == null ? null : afterurl.trim();
    }

    public Aftermarket() {
    }
}