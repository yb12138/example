package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.WarehouseInWarrant;
import com.heeexy.example.model.WarehouseInWarrantExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface WarehouseInWarrantMapper {
    int countByExample(WarehouseInWarrantExample example);

    int deleteByExample(WarehouseInWarrantExample example);

    int deleteByPrimaryKey(Integer inid);

    int insert(WarehouseInWarrant record);

    int insertSelective(WarehouseInWarrant record);

    List<WarehouseInWarrant> selectByExample(WarehouseInWarrantExample example);

    WarehouseInWarrant selectByPrimaryKey(Integer inid);

    int updateByExampleSelective(@Param("record") WarehouseInWarrant record, @Param("example") WarehouseInWarrantExample example);

    int updateByExample(@Param("record") WarehouseInWarrant record, @Param("example") WarehouseInWarrantExample example);

    int updateByPrimaryKeySelective(WarehouseInWarrant record);

    int updateByPrimaryKey(WarehouseInWarrant record);

    @Select("<script>" +
            "SELECT wiw.* FROM warehouse_in_warrant wiw" +
            "<where>" +
            " 1=1 " +
            "<if test='inNum!=null'>" +
            " and inNum like  CONCAT('%',#{inNum},'%')" +
            "</if>" +
            "<if test='purchaseNum!=null'>" +
            " and purchaseNum like  CONCAT('%',#{purchaseNum},'%') " +
            "</if>" +
            "<if test='status!=null '>" +
            " and status =#{status} " +
            "</if>" +
            "<if test='startday!=null'>" +
            " and wiw.createTime between #{startday} and #{endday}" +
            "</if>" +
            "<if test='warehouseID!=null'>" +
            " and wiw.warehouseID= #{warehouseID}" +
            "</if>" +
            "<if test='userID!=null'>" +
            " and wiw.userID=#{userID}" +
            "</if>" +
            "<if test='headwayType!=null'>" +
            " and wiw.headwayType=#{headwayType}" +
            "</if>" +
            "</where>" +
            "order by inID DESC " +
            "limit #{start},#{pageSize}" +
            "</script>")
    List<JSONObject> queryWarehouseInWarrantList(@Param("start") Integer start, @Param("pageSize") Integer pageSize, @Param("purchaseNum") String purchaseNum, @Param("inNum") String inNum, @Param("startday") String startday, @Param("endday") String endday, @Param("status") Integer status, @Param("warehouseID") Long warehouseID, @Param("userID") Long userID, @Param("headwayType") String headwayType);

    @Select("<script>" +
            "SELECT count(1) FROM warehouse_in_warrant wiw" +
            "<where>" +
            " 1=1 " +
            "<if test='inNum!=null'>" +
            " and inNum like  CONCAT('%',#{inNum},'%')" +
            "</if>" +
            "<if test='purchaseNum!=null'>" +
            " and purchaseNum like  CONCAT('%',#{purchaseNum},'%') " +
            "</if>" +
            "<if test='status!=null '>" +
            " and status =#{status} " +
            "</if>" +
            "<if test='startday!=null'>" +
            " and wiw.createTime between #{startday} and #{endday}" +
            "</if>" +
            "<if test='warehouseID!=null'>" +
            " and wiw.warehouseID= #{warehouseID}" +
            "</if>" +
            "<if test='userID!=null'>" +
            " and wiw.userID=#{userID}" +
            "</if>" +
            "<if test='headwayType!=null'>" +
            " and wiw.headwayType=#{headwayType}" +
            "</if>" +
            "</where>" +
            "</script>")
    Integer queryWarehouseCount(@Param("purchaseNum") String purchaseNum, @Param("inNum") String inNum, @Param("startday") String startday, @Param("endday") String endday, @Param("status") Integer status, @Param("warehouseID") Long warehouseID, @Param("userID") Long userID, @Param("headwayType") String headwayType);

    @Select("<script>" +
            "SELECT wiw.* FROM warehouse_in_warrant wiw" +
            "<where>" +
            " 1=1 " +
            "<if test='inNum!=null'>" +
            " and inNum like  CONCAT('%',#{inNum},'%')" +
            "</if>" +
            "<if test='purchaseNum!=null'>" +
            " and purchaseNum like  CONCAT('%',#{purchaseNum},'%') " +
            "</if>" +
            "<if test='status!=null '>" +
            " and status =#{status} " +
            "</if>" +
            "<if test='startday!=null'>" +
            " and wiw.createTime between #{startday} and #{endday}" +
            "</if>" +
            "<if test='warehouseID!=null'>" +
            " and wiw.warehouseID= #{warehouseID}" +
            "</if>" +
            "<if test='userID!=null'>" +
            " and wiw.userID=#{userID}" +
            "</if>" +
            "<if test='headwayType!=null'>" +
            " and wiw.headwayType=#{headwayType}" +
            "</if>" +
            "</where>" +
            "order by inID DESC " +
            "</script>")
    List<WarehouseInWarrant> excelWarehouseInWarrantList( @Param("purchaseNum") String purchaseNum, @Param("inNum") String inNum, @Param("startday") String startday, @Param("endday") String endday, @Param("status") Integer status, @Param("warehouseID") Long warehouseID, @Param("userID") Long userID, @Param("headwayType") String headwayType);
}