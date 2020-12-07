package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.AlloOut;
import com.heeexy.example.model.AlloOutExample;

import java.util.List;

import com.heeexy.example.model.Product;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AlloOutMapper {
    int countByExample(AlloOutExample example);

    int deleteByExample(AlloOutExample example);

    int deleteByPrimaryKey(Integer alloid);

    int insert(AlloOut record);

    int insertSelective(AlloOut record);

    List<AlloOut> selectByExample(AlloOutExample example);

    AlloOut selectByPrimaryKey(Integer alloid);

    int updateByExampleSelective(@Param("record") AlloOut record, @Param("example") AlloOutExample example);

    int updateByExample(@Param("record") AlloOut record, @Param("example") AlloOutExample example);

    int updateByPrimaryKeySelective(AlloOut record);

    int updateByPrimaryKey(AlloOut record);

    @Select("<script>" +
            "select DISTINCT al.* from allo_out al left join allo_out_sku alos on alos.alloID=al.alloID " +
            "<where>" +
            "1=1 " +
            "<if test='warehouseOrder!=null'>" +
            "and al.warehouseOrder like  CONCAT('%',#{warehouseOrder},'%')" +
            "</if>" +
            "<if test='warehouseID!=null'>" +
            "and al.warehouseID=#{warehouseID} " +
            "</if>" +
            "<if test='status!=null '>" +
            "and al.status =#{status} " +
            "</if>" +
            "<if test='create_Start!=null'>" +
            "and al.createTime between #{create_Start} and #{create_End}" +
            "</if>" +
            "<if test='arrive_Start!=null'>" +
            "and al.arriveTime between #{arrive_Start} and #{arrive_End}" +
            "</if>" +
            "<if test='sku!=null '>" +
            "and alos.skuCode like  CONCAT('%',#{sku},'%')" +
            "</if>" +
            "</where>" +
            "order by alloid DESC " +
            "<if test='start!=null'>" +
            "limit #{start},#{pageSize}" +
            "</if>" +
            "</script>")
    List<AlloOut> queryAlloOutList(@Param("start") Integer start, @Param("pageSize") Integer pageSize, @Param("warehouseOrder") String warehouseOrder, @Param("warehouseID") Long warehouseID, @Param("create_Start") String create_Start, @Param("create_End") String create_End, @Param("arrive_Start") String arrive_Start, @Param("arrive_End") String arrive_End, @Param("status") Integer status, @Param("sku") String sku);

    @Select("<script>" +
            "select count(1) from allo_out al left join allo_out_sku alos on alos.alloID=al.alloID" +
            "<where>" +
            "1=1 " +
            "<if test='warehouseOrder!=null'>" +
            "and al.warehouseOrder like  CONCAT('%',#{warehouseOrder},'%')" +
            "</if>" +
            "<if test='warehouseID!=null'>" +
            "and al.warehouseID=#{warehouseID} " +
            "</if>" +
            "<if test='status!=null '>" +
            "and al.status =#{status} " +
            "</if>" +
            "<if test='create_Start!=null'>" +
            "and al.createTime between #{create_Start} and #{create_End}" +
            "</if>" +
            "<if test='arrive_Start!=null'>" +
            "and al.arriveTime between #{arrive_Start} and #{arrive_End}" +
            "</if>" +
            "<if test='sku!=null '>" +
            "and alos.skuCode like  CONCAT('%',#{sku},'%')" +
            "</if>" +
            "</where>" +
            "</script>")
    Integer getCount(@Param("warehouseOrder") String warehouseOrder, @Param("warehouseID") Long warehouseID, @Param("create_Start") String create_Start, @Param("create_End") String create_End, @Param("arrive_Start") String arrive_Start, @Param("arrive_End") String arrive_End, @Param("status") Integer status, @Param("sku") String sku);

}