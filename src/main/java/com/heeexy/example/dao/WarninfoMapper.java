package com.heeexy.example.dao;

import com.heeexy.example.model.Warninfo;
import com.heeexy.example.model.WarninfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface WarninfoMapper {
    int countByExample(WarninfoExample example);

    int deleteByExample(WarninfoExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(Warninfo record);

    int insertSelective(Warninfo record);

    List<Warninfo> selectByExample(WarninfoExample example);

    Warninfo selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") Warninfo record, @Param("example") WarninfoExample example);

    int updateByExample(@Param("record") Warninfo record, @Param("example") WarninfoExample example);

    int updateByPrimaryKeySelective(Warninfo record);

    int updateByPrimaryKey(Warninfo record);

    @Select("<script>" +
            "SELECT wi.*,p.cnName,p.imgurl,p.warehousename,p.headwayType FROM warninfo wi left join product p on p.productID=wi.productID" +
            "<where>" +
            "1=1 " +
            "<if test='sku!=null'>" +
            "and p.skuCode like  CONCAT('%',#{sku},'%')" +
            "</if>" +
            "<if test='cnName!=null'>" +
            "and p.cnName like  CONCAT('%',#{cnName},'%') " +
            "</if>" +
            "<if test='status!=null '>" +
            "and wi.status =#{status} " +
            "</if>" +
            "<if test='warehouseid!=null'>" +
            " and p.warehouseID =#{warehouseid} " +
            "</if>" +
            "</where>" +
            "order by productID DESC " +
            "limit #{start},#{pageSize}" +
            "</script>")
    List<Warninfo> queryAllWarnInfo(@Param("start") int start, @Param("pageSize") Integer pageSize, @Param("sku") String sku, @Param("cnName") String cnName, @Param("warehouseid") Long warehouseid, @Param("status") Integer status);

    @Select("<script>" +
            "SELECT count(1) FROM warninfo wi left join product p on p.productID=wi.productID" +
            "<where>" +
            "1=1 " +
            "<if test='sku!=null'>" +
            "and p.skuCode like  CONCAT('%',#{sku},'%')" +
            "</if>" +
            "<if test='cnName!=null'>" +
            "and p.cnName like  CONCAT('%',#{cnName},'%') " +
            "</if>" +
            "<if test='warehouseid!=null'>" +
            "and p.warehouseID =#{warehouseid} " +
            "</if>" +
            "<if test='status!=null '>" +
            " and wi.status =#{status} " +
            "</if>" +
            "</where>" +
            "</script>")
    Integer getCount(@Param("sku") String sku, @Param("cnName") String cnName, @Param("warehouseid") Long warehouseid, @Param("status") Integer status);

}