package com.heeexy.example.dao;

import com.heeexy.example.model.GcOutOrder;
import com.heeexy.example.model.GcOutOrderExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GcOutOrderMapper {
    int countByExample(GcOutOrderExample example);

    int deleteByExample(GcOutOrderExample example);

    int deleteByPrimaryKey(String orderCode);

    int insert(GcOutOrder record);

    int insertSelective(GcOutOrder record);

    List<GcOutOrder> selectByExample(GcOutOrderExample example);

    GcOutOrder selectByPrimaryKey(String orderCode);

    int updateByExampleSelective(@Param("record") GcOutOrder record, @Param("example") GcOutOrderExample example);

    int updateByExample(@Param("record") GcOutOrder record, @Param("example") GcOutOrderExample example);

    int updateByPrimaryKeySelective(GcOutOrder record);

    int updateByPrimaryKey(GcOutOrder record);
}