package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.FinancePayment;
import com.heeexy.example.model.FinancePaymentExample;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface FinancePaymentMapper {
    int countByExample(FinancePaymentExample example);

    int deleteByExample(FinancePaymentExample example);

    int deleteByPrimaryKey(Integer paymentid);

    int insert(FinancePayment record);

    int insertSelective(FinancePayment record);

    List<FinancePayment> selectByExample(FinancePaymentExample example);

    FinancePayment selectByPrimaryKey(Integer paymentid);

    int updateByExampleSelective(@Param("record") FinancePayment record, @Param("example") FinancePaymentExample example);

    int updateByExample(@Param("record") FinancePayment record, @Param("example") FinancePaymentExample example);

    int updateByPrimaryKeySelective(FinancePayment record);

    int updateByPrimaryKey(FinancePayment record);

    @Select("<script>" +
            "SELECT fp.* FROM finance_payment fp LEFT JOIN purchase p on fp.purchaseID=p.purchaseID" +
            "<where>" +
            "1=1 " +
            "<if test='paymentNum!=null'>" +
            "and paymentNum =#{paymentNum}" +
            "</if>" +
            "<if test='purchaseNum!=null'>" +
            "and p.purchaseNum like  CONCAT('%',#{purchaseNum},'%') " +
            "</if>" +
            "<if test='status!=null and status &lt;= 3'>" +
            "and status =#{status} " +
            "</if>" +
            "<if test='status!=null and status &gt; 3'>" +
            "and status >3 " +
            "</if>" +
            "<if test='startday!=null'>" +
            "and fp.createTime between #{startday} and #{endday}" +
            "</if>" +
            "</where>" +
            "order by paymentID DESC " +
            "limit #{start},#{pageSize}" +
            "</script>")
    List<JSONObject> queryFinanceList(@Param("start") Integer start, @Param("pageSize") Integer pageSize, @Param("purchaseNum") String purchaseNum, @Param("paymentNum") String paymentNum, @Param("startday") String startday, @Param("endday") String endday, @Param("status") Integer status);

    @Select("<script>" +
            "SELECT count(1) FROM finance_payment fp LEFT JOIN purchase p on fp.purchaseID=p.purchaseID" +
            "<where>" +
            "1=1 " +
            "<if test='paymentNum!=null'>" +
            "and paymentNum =#{paymentNum}" +
            "</if>" +
            "<if test='purchaseNum!=null'>" +
            "and p.purchaseNum like  CONCAT('%',#{purchaseNum},'%') " +
            "</if>" +
            "<if test='status!=null'>" +
            "and status =#{status} " +
            "</if>" +
            "<if test='startday!=null'>" +
            "and fp.createTime between #{startday} and #{endday}" +
            "</if>" +
            "</where>" +
            "</script>")
    Integer queryFinanceListCount(@Param("purchaseNum") String purchaseNum, @Param("paymentNum") String paymentNum, @Param("startday") String startday, @Param("endday") String endday, @Param("status") Integer status);

    @Select("SELECT sum(needPayTotalAmount) from finance_payment where payTime between #{startday} and #{endday}")
    Double getTodayAmount(@Param("startday") String startday, @Param("endday") String endday);


    @Select("<script>" +
            "SELECT fp.* FROM finance_payment fp LEFT JOIN purchase p on fp.purchaseID=p.purchaseID" +
            "<where>" +
            "1=1 " +
            "<if test='paymentNum!=null'>" +
            "and paymentNum =#{paymentNum}" +
            "</if>" +
            "<if test='purchaseNum!=null'>" +
            "and p.purchaseNum like  CONCAT('%',#{purchaseNum},'%') " +
            "</if>" +
            "<if test='status!=null and status &lt;= 3'>" +
            "and status =#{status} " +
            "</if>" +
            "<if test='status!=null and status &gt; 3'>" +
            "and status >3 " +
            "</if>" +
            "<if test='startday!=null'>" +
            "and fp.createTime between #{startday} and #{endday}" +
            "</if>" +
            "</where>" +
            "order by fp.createTime DESC " +
            "</script>")
    List<FinancePayment> queryFinanceAll(@Param("purchaseNum") String purchaseNum, @Param("paymentNum") String paymentNum, @Param("startday") String startday, @Param("endday") String endday, @Param("status") Integer status);
}