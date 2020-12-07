package com.heeexy.example.dao;

import com.heeexy.example.model.Sheet1;
import com.heeexy.example.model.Sheet1Example;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface Sheet1Mapper {
    int countByExample(Sheet1Example example);

    int deleteByExample(Sheet1Example example);

    int insert(Sheet1 record);

    int insertSelective(Sheet1 record);

    List<Sheet1> selectByExample(Sheet1Example example);

    int updateByExampleSelective(@Param("record") Sheet1 record, @Param("example") Sheet1Example example);

    int updateByExample(@Param("record") Sheet1 record, @Param("example") Sheet1Example example);
}