package com.heeexy.example.dao;

import com.heeexy.example.model.ProductMotherCode;
import com.heeexy.example.model.ProductMotherCodeExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ProductMotherCodeMapper {
    int countByExample(ProductMotherCodeExample example);

    int deleteByExample(ProductMotherCodeExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(ProductMotherCode record);

    int insertSelective(ProductMotherCode record);

    List<ProductMotherCode> selectByExample(ProductMotherCodeExample example);

    ProductMotherCode selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") ProductMotherCode record, @Param("example") ProductMotherCodeExample example);

    int updateByExample(@Param("record") ProductMotherCode record, @Param("example") ProductMotherCodeExample example);

    int updateByPrimaryKeySelective(ProductMotherCode record);

    int updateByPrimaryKey(ProductMotherCode record);

    @Select("<script>" +
            "select * from product_mother_code " +
            "<where>" +
            "<if test='mname!=null'>" +
            "and mname like  CONCAT('%',#{mname},'%') " +
            "</if>" +
            "</where>" +
            "order by mid DESC " +
            "limit #{start},#{size}" +
            "</script>")
    List<ProductMotherCode> getMothers(@Param("start") int start, @Param("size") int limit, @Param("mname") String mname);

    @Select("<script>" +
            "select count(1) from product_mother_code " +
            "<where>" +
            "<if test='mname!=null'>" +
            "and mname like  CONCAT('%',#{mname},'%') " +
            "</if>" +
            "</where>" +
            "</script>")
    Integer getCount(@Param("mname") String mname);
}