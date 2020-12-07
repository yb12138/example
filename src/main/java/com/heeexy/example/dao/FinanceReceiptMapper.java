package com.heeexy.example.dao;

import com.heeexy.example.model.FinanceReceipt;
import com.heeexy.example.model.FinanceReceiptExample;

import java.util.List;

import com.heeexy.example.model.ProductNew;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface FinanceReceiptMapper {
    int countByExample(FinanceReceiptExample example);

    int deleteByExample(FinanceReceiptExample example);

    int deleteByPrimaryKey(Integer receiptid);

    int insert(FinanceReceipt record);

    int insertSelective(FinanceReceipt record);

    List<FinanceReceipt> selectByExample(FinanceReceiptExample example);

    FinanceReceipt selectByPrimaryKey(Integer receiptid);

    int updateByExampleSelective(@Param("record") FinanceReceipt record, @Param("example") FinanceReceiptExample example);

    int updateByExample(@Param("record") FinanceReceipt record, @Param("example") FinanceReceiptExample example);

    int updateByPrimaryKeySelective(FinanceReceipt record);

    int updateByPrimaryKey(FinanceReceipt record);

    @Select("<script>" +
            "select * from finance_receipt " +
            "<where>" +
            " 1=1 " +
            "<if test='purchaseNum!=null'>" +
            " and purchaseNum like CONCAT('%',#{purchaseNum},'%')" +
            "</if>" +
            "<if test='receiptNum!=null'>" +
            " and receiptNum =#{receiptNum}" +
            "</if>" +
            "<if test='status!=null'>" +
            " and status =#{status}" +
            "</if>" +
            "</where>" +
            "order by createTime DESC " +
            "limit #{start},#{pageSize}" +
            "</script>")
    List<FinanceReceipt> listReceipt(@Param("start") int start, @Param("pageSize") Integer pageSize, @Param("purchaseNum") String purchaseNum, @Param("receiptNum") String receiptNum, @Param("status") Integer status);


    @Select("<script>" +
            "select count(1) from finance_receipt " +
            "<where>" +
            " 1=1 " +
            "<if test='purchaseNum!=null'>" +
            " and purchaseNum like CONCAT('%',#{purchaseNum},'%')" +
            "</if>" +
            "<if test='receiptNum!=null'>" +
            " and receiptNum =#{receiptNum}" +
            "</if>" +
            "<if test='status!=null'>" +
            " and status =#{status}" +
            "</if>" +
            "</where>" +
            "</script>")
    Integer queryProductCount(@Param("purchaseNum") String purchaseNum, @Param("receiptNum") String receiptNum, @Param("status") Integer status);

}