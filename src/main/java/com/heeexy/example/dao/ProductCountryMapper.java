package com.heeexy.example.dao;

import com.heeexy.example.model.ProductCountry;
import com.heeexy.example.model.ProductCountryExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProductCountryMapper {
    int countByExample(ProductCountryExample example);

    int deleteByExample(ProductCountryExample example);

    int deleteByPrimaryKey(Integer pcid);

    int insert(ProductCountry record);

    int insertSelective(ProductCountry record);

    List<ProductCountry> selectByExample(ProductCountryExample example);

    ProductCountry selectByPrimaryKey(Integer pcid);

    int updateByExampleSelective(@Param("record") ProductCountry record, @Param("example") ProductCountryExample example);

    int updateByExample(@Param("record") ProductCountry record, @Param("example") ProductCountryExample example);

    int updateByPrimaryKeySelective(ProductCountry record);

    int updateByPrimaryKey(ProductCountry record);
}