package com.heeexy.example.dao;

import com.heeexy.example.model.Consignment;
import com.heeexy.example.model.ConsignmentExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ConsignmentMapper {
    int countByExample(ConsignmentExample example);

    int deleteByExample(ConsignmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Consignment record);

    int insertSelective(Consignment record);

    List<Consignment> selectByExample(ConsignmentExample example);

    Consignment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Consignment record, @Param("example") ConsignmentExample example);

    int updateByExample(@Param("record") Consignment record, @Param("example") ConsignmentExample example);

    int updateByPrimaryKeySelective(Consignment record);

    int updateByPrimaryKey(Consignment record);
}