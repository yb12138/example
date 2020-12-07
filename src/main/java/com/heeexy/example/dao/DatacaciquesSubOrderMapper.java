package com.heeexy.example.dao;

import com.heeexy.example.model.DatacaciquesSubOrder;
import com.heeexy.example.model.DatacaciquesSubOrderExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DatacaciquesSubOrderMapper {
    int countByExample(DatacaciquesSubOrderExample example);

    int deleteByExample(DatacaciquesSubOrderExample example);

    int insert(DatacaciquesSubOrder record);

    int insertSelective(DatacaciquesSubOrder record);

    List<DatacaciquesSubOrder> selectByExample(DatacaciquesSubOrderExample example);

    int updateByExampleSelective(@Param("record") DatacaciquesSubOrder record, @Param("example") DatacaciquesSubOrderExample example);

    int updateByExample(@Param("record") DatacaciquesSubOrder record, @Param("example") DatacaciquesSubOrderExample example);
}