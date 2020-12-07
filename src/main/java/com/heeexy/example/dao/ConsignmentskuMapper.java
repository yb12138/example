package com.heeexy.example.dao;

import com.heeexy.example.model.Consignmentsku;
import com.heeexy.example.model.ConsignmentskuExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ConsignmentskuMapper {
    int countByExample(ConsignmentskuExample example);

    int deleteByExample(ConsignmentskuExample example);

    int deleteByPrimaryKey(Integer conskuid);

    int insert(Consignmentsku record);

    int insertSelective(Consignmentsku record);

    List<Consignmentsku> selectByExample(ConsignmentskuExample example);

    Consignmentsku selectByPrimaryKey(Integer conskuid);

    int updateByExampleSelective(@Param("record") Consignmentsku record, @Param("example") ConsignmentskuExample example);

    int updateByExample(@Param("record") Consignmentsku record, @Param("example") ConsignmentskuExample example);

    int updateByPrimaryKeySelective(Consignmentsku record);

    int updateByPrimaryKey(Consignmentsku record);
}