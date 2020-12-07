package com.heeexy.example.dao;

import com.heeexy.example.model.EbayOrderProfit;
import com.heeexy.example.model.EbayOrderProfitExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface EbayOrderProfitMapper {
    int countByExample(EbayOrderProfitExample example);

    int deleteByExample(EbayOrderProfitExample example);

    int deleteByPrimaryKey(String orderid);

    int insert(EbayOrderProfit record);

    int insertSelective(EbayOrderProfit record);

    List<EbayOrderProfit> selectByExample(EbayOrderProfitExample example);

    EbayOrderProfit selectByPrimaryKey(String orderid);

    int updateByExampleSelective(@Param("record") EbayOrderProfit record, @Param("example") EbayOrderProfitExample example);

    int updateByExample(@Param("record") EbayOrderProfit record, @Param("example") EbayOrderProfitExample example);

    int updateByPrimaryKeySelective(EbayOrderProfit record);

    int updateByPrimaryKey(EbayOrderProfit record);

    @Select("<script>" +
            "select DISTINCT eop.* from ebay_order_profit eop LEFT JOIN ebay_order_sku eos on eos.orderID=eop.orderID " +
            "<where>" +
            "1=1 " +
            "<if test='order!=null'>" +
            " and eop.orderID like  CONCAT('%',#{order},'%')" +
            "</if>" +
            "<if test='sku!=null'>" +
            " and eos.sku =#{sku} " +
            "</if>" +
            "<if test='startTime!=null'>" +
            " and eop.createTime between #{startTime} and #{endTime}" +
            "</if>" +
            "</where>" +
            "order by orderID DESC " +
            "limit #{start},#{size}" +
            "</script>")
    List<EbayOrderProfit> getAllList(@Param("start") int start, @Param("size") int size, @Param("order") String order, @Param("sku") String sku, @Param("startTime") String startTime, @Param("endTime") String endTime);


    @Select("<script>" +
            "select eop.* from ebay_order_profit eop " +
            "<where>" +
            "1=1 " +
            "<if test='order!=null'>" +
            " and eop.orderID =#{order}" +
            "</if>" +
            "<if test='startTime!=null'>" +
            " and eop.createTime between #{startTime} and #{endTime}" +
            "</if>" +
            "</where>" +
            "order by orderID DESC " +
            "limit #{start},#{size}" +
            "</script>")
    List<EbayOrderProfit> getAllList2(@Param("start") int start, @Param("size") int size, @Param("order") String order, @Param("startTime") String startTime, @Param("endTime") String endTime);

    @Select("<script>" +
            "explain select count(DISTINCT eop.orderID) from ebay_order_profit eop LEFT JOIN ebay_order_sku eos on eos.orderID=eop.orderID " +
            "<where>" +
            "1=1 " +
            "<if test='order!=null'>" +
            "and eop.orderID =#{order}" +
            "</if>" +
            "<if test='sku!=null'>" +
            "and eos.sku =#{sku} " +
            "</if>" +
            "<if test='startTime!=null'>" +
            "and eop.createTime between #{startTime} and #{endTime}" +
            "</if>" +
            "</where>" +
            "</script>")
    List<Map<String, Object>> getCount(@Param("order") String order, @Param("sku") String sku, @Param("startTime") String startTime, @Param("endTime") String endTime);

    @Select("<script>" +
            "select count(eop.orderID) from ebay_order_profit eop" +
            "<where>" +
            "1=1 " +
            "<if test='order!=null'>" +
            "and eop.orderID =#{order}" +
            "</if>" +
            "<if test='startTime!=null'>" +
            "and eop.createTime between #{startTime} and #{endTime}" +
            "</if>" +
            "</where>" +
            "</script>")
    Integer getCount2(@Param("order") String order, @Param("startTime") String startTime, @Param("endTime") String endTime);
}