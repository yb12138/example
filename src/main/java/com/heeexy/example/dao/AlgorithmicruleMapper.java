package com.heeexy.example.dao;

import com.heeexy.example.model.Algorithmicrule;
import com.heeexy.example.model.AlgorithmicruleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlgorithmicruleMapper {
    int countByExample(AlgorithmicruleExample example);

    int deleteByExample(AlgorithmicruleExample example);

    int deleteByPrimaryKey(Integer alid);

    int insert(Algorithmicrule record);

    int insertSelective(Algorithmicrule record);

    List<Algorithmicrule> selectByExample(AlgorithmicruleExample example);

    Algorithmicrule selectByPrimaryKey(Integer alid);

    int updateByExampleSelective(@Param("record") Algorithmicrule record, @Param("example") AlgorithmicruleExample example);

    int updateByExample(@Param("record") Algorithmicrule record, @Param("example") AlgorithmicruleExample example);

    int updateByPrimaryKeySelective(Algorithmicrule record);

    int updateByPrimaryKey(Algorithmicrule record);
}