package com.heeexy.example.dao;

import com.heeexy.example.model.CollectAmount;
import com.heeexy.example.model.CollectAmountExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CollectAmountMapper {
    int countByExample(CollectAmountExample example);

    int deleteByExample(CollectAmountExample example);

    int deleteByPrimaryKey(Integer amountid);

    int insert(CollectAmount record);

    int insertSelective(CollectAmount record);

    List<CollectAmount> selectByExample(CollectAmountExample example);

    CollectAmount selectByPrimaryKey(Integer amountid);

    int updateByExampleSelective(@Param("record") CollectAmount record, @Param("example") CollectAmountExample example);

    int updateByExample(@Param("record") CollectAmount record, @Param("example") CollectAmountExample example);

    int updateByPrimaryKeySelective(CollectAmount record);

    int updateByPrimaryKey(CollectAmount record);

    @Select("<script>" +
            "SELECT * from collect_amount" +
            "<where>" +
            "1=1 " +
            "<if test='month!=null '>" +
            "and month =#{month} " +
            "</if>" +
            "<if test='year!=null'>" +
            " and year =#{year} " +
            "</if>" +
            "</where>" +
            "limit #{start},#{size}" +
            "</script>")
    List<CollectAmount> list(@Param("start") int start, @Param("size") int size, @Param("year") Integer year, @Param("month") Integer month);

    @Select("<script>" +
            "SELECT count(1) from collect_amount" +
            "<where>" +
            "1=1 " +
            "<if test='month!=null '>" +
            "and month =#{month} " +
            "</if>" +
            "<if test='year!=null'>" +
            " and year =#{year} " +
            "</if>" +
            "</where>" +
            "</script>")
    Integer count(@Param("year") Integer year, @Param("month") Integer month);

}