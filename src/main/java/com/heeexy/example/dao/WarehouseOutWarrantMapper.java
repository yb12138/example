package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.WarehouseOutWarrant;
import com.heeexy.example.model.WarehouseOutWarrantExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface WarehouseOutWarrantMapper {
    int countByExample(WarehouseOutWarrantExample example);

    int deleteByExample(WarehouseOutWarrantExample example);

    int deleteByPrimaryKey(Integer outid);

    int insert(WarehouseOutWarrant record);

    int insertSelective(WarehouseOutWarrant record);

    List<WarehouseOutWarrant> selectByExample(WarehouseOutWarrantExample example);

    WarehouseOutWarrant selectByPrimaryKey(Integer outid);

    int updateByExampleSelective(@Param("record") WarehouseOutWarrant record, @Param("example") WarehouseOutWarrantExample example);

    int updateByExample(@Param("record") WarehouseOutWarrant record, @Param("example") WarehouseOutWarrantExample example);

    int updateByPrimaryKeySelective(WarehouseOutWarrant record);

    int updateByPrimaryKey(WarehouseOutWarrant record);

    @Select("<script>" +
            "select distinct wow.* from warehouse_out_warrant wow left join warehouse_out_warrant_sku wows on wows.outID=wow.outID " +
            "<where>" +
            "1=1 " +
            "<if test='outNum!=null'>" +
            " and wow.outNum like  CONCAT('%',#{outNum},'%')" +
            "</if>" +
            "<if test='sku!=null'>" +
            " and wows.skuCode like  CONCAT('%',#{sku},'%') " +
            "</if>" +
            "<if test='status!=null '>" +
            " and wow.status =#{status} " +
            "</if>" +
            "<if test='startday!=null'>" +
            " and wow.createTime between #{startday} and #{endday}" +
            "</if>" +
            "<if test='cnWarehouseName!=null'>" +
            " and wow.cnWarehouseName =#{cnWarehouseName}" +
            "</if>" +
            "</where>" +
            "order by outID DESC " +
            "limit #{start},#{pageSize}" +
            "</script>")
    List<JSONObject> queryWarehouseOutWarrantList(@Param("start") int start, @Param("pageSize") Integer pageSize, @Param("sku") String sku, @Param("outNum") String outNum, @Param("startday") String startday, @Param("endday") String endday, @Param("status") Integer status, @Param("cnWarehouseName") String cnWarehouseName);

    @Select("<script>" +
            "select distinct count(DISTINCT wow.outID) from warehouse_out_warrant wow left join warehouse_out_warrant_sku wows on wows.outID=wow.outID " +
            "<where>" +
            "1=1 " +
            "<if test='outNum!=null'>" +
            "and wow.outNum like  CONCAT('%',#{outNum},'%')" +
            "</if>" +
            "<if test='sku!=null'>" +
            "and wows.skuCode like  CONCAT('%',#{sku},'%') " +
            "</if>" +
            "<if test='status!=null '>" +
            "and wow.status =#{status} " +
            "</if>" +
            "<if test='startday!=null'>" +
            "and wow.createTime between #{startday} and #{endday}" +
            "</if>" +
            "<if test='cnWarehouseName!=null'>" +
            "and wow.cnWarehouseName =#{cnWarehouseName}" +
            "</if>" +
            "</where>" +
            "</script>")
    Integer queryWarehouseOutCount(@Param("sku") String sku, @Param("outNum") String outNum, @Param("startday") String startday, @Param("endday") String endday, @Param("status") Integer status, @Param("cnWarehouseName") String cnWarehouseName);


    @Select("<script>" +
            "select distinct wow.* from warehouse_out_warrant wow left join warehouse_out_warrant_sku wows on wows.outID=wow.outID " +
            "<where>" +
            "1=1 " +
            "<if test='outNum!=null'>" +
            " and wow.outNum like  CONCAT('%',#{outNum},'%')" +
            "</if>" +
            "<if test='sku!=null'>" +
            " and wows.skuCode like  CONCAT('%',#{sku},'%') " +
            "</if>" +
            "<if test='status!=null '>" +
            " and wow.status =#{status} " +
            "</if>" +
            "<if test='startday!=null'>" +
            " and wow.createTime between #{startday} and #{endday}" +
            "</if>" +
            "<if test='cnWarehouseName!=null'>" +
            " and wow.cnWarehouseName =#{cnWarehouseName}" +
            "</if>" +
            "</where>" +
            "order by outID DESC " +
            "</script>")
    List<WarehouseOutWarrant> queryWarehouseOutWarrantList2(@Param("sku") String sku, @Param("outNum") String outNum, @Param("startday") String startday, @Param("endday") String endday, @Param("status") Integer status, @Param("cnWarehouseName") String cnWarehouseName);
}