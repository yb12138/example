package com.heeexy.example.dao;

import com.heeexy.example.model.Productgroup;
import com.heeexy.example.model.ProductgroupExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProductgroupMapper {
    int countByExample(ProductgroupExample example);

    int deleteByExample(ProductgroupExample example);

    int deleteByPrimaryKey(Integer productgroupid);

    int insert(Productgroup record);

    int insertSelective(Productgroup record);

    List<Productgroup> selectByExample(ProductgroupExample example);

    Productgroup selectByPrimaryKey(Integer productgroupid);

    int updateByExampleSelective(@Param("record") Productgroup record, @Param("example") ProductgroupExample example);

    int updateByExample(@Param("record") Productgroup record, @Param("example") ProductgroupExample example);

    int updateByPrimaryKeySelective(Productgroup record);

    int updateByPrimaryKey(Productgroup record);
}