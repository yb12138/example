package com.heeexy.example.dao;

import com.heeexy.example.model.DatacaciquesOrder;
import com.heeexy.example.model.DatacaciquesOrderExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface DatacaciquesOrderMapper {
    int countByExample(DatacaciquesOrderExample example);

    int deleteByExample(DatacaciquesOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DatacaciquesOrder record);

    int insertSelective(DatacaciquesOrder record);

    List<DatacaciquesOrder> selectByExample(DatacaciquesOrderExample example);

    DatacaciquesOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DatacaciquesOrder record, @Param("example") DatacaciquesOrderExample example);

    int updateByExample(@Param("record") DatacaciquesOrder record, @Param("example") DatacaciquesOrderExample example);

    int updateByPrimaryKeySelective(DatacaciquesOrder record);

    int updateByPrimaryKey(DatacaciquesOrder record);

    @Select("<script>" +
            "select  * from datacaciques_order dorder " +
            "<where>" +
            "<if test='start!=null'>" +
            " createTime between #{start} and #{end}" +
            "</if>" +
            "</where>" +
            "</script>")
    List<DatacaciquesOrder> exportAllOrder(@Param("start") String start, @Param("end") String end);


}