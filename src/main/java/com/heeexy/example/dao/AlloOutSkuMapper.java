package com.heeexy.example.dao;

import com.heeexy.example.model.AlloOutSku;
import com.heeexy.example.model.AlloOutSkuExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AlloOutSkuMapper {
    int countByExample(AlloOutSkuExample example);

    int deleteByExample(AlloOutSkuExample example);

    int deleteByPrimaryKey(Integer alloskuid);

    int insert(AlloOutSku record);

    int insertSelective(AlloOutSku record);

    List<AlloOutSku> selectByExample(AlloOutSkuExample example);

    AlloOutSku selectByPrimaryKey(Integer alloskuid);

    int updateByExampleSelective(@Param("record") AlloOutSku record, @Param("example") AlloOutSkuExample example);

    int updateByExample(@Param("record") AlloOutSku record, @Param("example") AlloOutSkuExample example);

    int updateByPrimaryKeySelective(AlloOutSku record);

    int updateByPrimaryKey(AlloOutSku record);
}