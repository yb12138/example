package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.ProductNew;
import com.heeexy.example.model.ProductNewExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ProductNewMapper {
    int countByExample(ProductNewExample example);

    int deleteByExample(ProductNewExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(ProductNew record);

    int insertSelective(ProductNew record);

    List<ProductNew> selectByExample(ProductNewExample example);

    ProductNew selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") ProductNew record, @Param("example") ProductNewExample example);

    int updateByExample(@Param("record") ProductNew record, @Param("example") ProductNewExample example);

    int updateByPrimaryKeySelective(ProductNew record);

    int updateByPrimaryKey(ProductNew record);


    @Select("<script>" +
            "select productID, cnName, enName, linkURL1, linkURL2, width, weight, length, height, imgURL1," +
            "imgURL2, remark, status, operateStatus, opplink_UK as opplinkUk, headwayType, deliverTime, cost," +
            "exceptSell_UK as exceptsellUk, profitrate_UK as profitrateUk, exceptSell_DE as exceptsellDe, profitrate_DE as profitrateDe, exceptSell_US as exceptsellUs, profitrate_US as profitrateUs," +
            "opplink_DE as opplinkDe, opplink_US as opplinkUs, price_UK as priceUk, price_DE as priceDe, price_US as priceUs, suppliername, account, userName, userID " +
            " from product_new " +
            "<where>" +
            " 1=1 " +
            "<if test='cnName!=null'>" +
            " and cnName like CONCAT('%',#{cnName},'%')" +
            "</if>" +
            "<if test='status!=null'>" +
            " and status =#{status}" +
            "</if>" +
            "</where>" +
            " order by productID DESC " +
            " limit #{start},#{pageSize}" +
            "</script>")
    List<ProductNew> listProduct(@Param("start") int start, @Param("pageSize") Integer pageSize, @Param("cnName") String cnName, @Param("status") Integer status);

    @Select("<script>" +
            "select count(1) from product_new " +
            "<where>" +
            " 1=1 " +
            "<if test='cnName!=null'>" +
            " and cnName like CONCAT('%',#{cnName},'%')" +
            "</if>" +
            "<if test='status!=null'>" +
            " and status =#{status}" +
            "</if>" +
            "</where>" +
            "</script>")
    Integer queryProductCount(@Param("cnName") String cnName, @Param("status") Integer status);
}