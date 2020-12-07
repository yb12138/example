package com.heeexy.example.dao;

import com.heeexy.example.model.Aftermarket;
import com.heeexy.example.model.AftermarketExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AftermarketMapper {
    int countByExample(AftermarketExample example);

    int deleteByExample(AftermarketExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Aftermarket record);

    int insertSelective(Aftermarket record);

    List<Aftermarket> selectByExampleWithBLOBs(AftermarketExample example);

    List<Aftermarket> selectByExample(AftermarketExample example);

    Aftermarket selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Aftermarket record, @Param("example") AftermarketExample example);

    int updateByExampleWithBLOBs(@Param("record") Aftermarket record, @Param("example") AftermarketExample example);

    int updateByExample(@Param("record") Aftermarket record, @Param("example") AftermarketExample example);

    int updateByPrimaryKeySelective(Aftermarket record);

    int updateByPrimaryKeyWithBLOBs(Aftermarket record);

    int updateByPrimaryKey(Aftermarket record);

    @Select("<script>" +
            "select  * from aftermarket " +
            "<where>" +
            " 1=1 " +
            "<if test='startTime!=null'>" +
            " and createTime between #{startTime} and #{end}" +
            "</if>" +
            "<if test='sku!=null'>" +
            " and  sku like  CONCAT('%',#{sku},'%') " +
            "</if>" +
            "<if test='order!=null'>" +
            " and orderID like  CONCAT('%',#{order},'%') " +
            "</if>" +
            "</where>" +
            "order by createTime DESC " +
            "<if test='start!=null'>" +
            "limit #{start},#{size}" +
            "</if>" +
            "</script>")
    List<Aftermarket> listAfter(@Param("start") Integer start, @Param("size") Integer size, @Param("sku") String sku, @Param("order") String order, @Param("startTime") String startTime, @Param("end") String endTime);

    @Select("<script>" +
            "select  count(1) from aftermarket " +
            "<where>" +
            " 1=1 " +
            "<if test='start!=null'>" +
            " and createTime between #{start} and #{end}" +
            "</if>" +
            "<if test='sku!=null'>" +
            " and  sku like  CONCAT('%',#{sku},'%') " +
            "</if>" +
            "<if test='order!=null'>" +
            " and orderID like  CONCAT('%',#{order},'%') " +
            "</if>" +
            "</where>" +
            "</script>")
    Integer countAfter(@Param("sku") String sku, @Param("order") String order, @Param("start") String startTime, @Param("end") String endTime);

    @Select("select * from aftermarket where orderID=#{orderID}")
    Aftermarket search(@Param("orderID") String orderID);
}