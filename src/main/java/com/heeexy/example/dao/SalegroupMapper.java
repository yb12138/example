package com.heeexy.example.dao;

import com.heeexy.example.model.Salegroup;
import com.heeexy.example.model.SalegroupExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SalegroupMapper {
    int countByExample(SalegroupExample example);

    int deleteByExample(SalegroupExample example);

    int deleteByPrimaryKey(Integer salegroupid);

    int insert(Salegroup record);

    int insertSelective(Salegroup record);

    List<Salegroup> selectByExample(SalegroupExample example);

    Salegroup selectByPrimaryKey(Integer salegroupid);

    int updateByExampleSelective(@Param("record") Salegroup record, @Param("example") SalegroupExample example);

    int updateByExample(@Param("record") Salegroup record, @Param("example") SalegroupExample example);

    int updateByPrimaryKeySelective(Salegroup record);

    int updateByPrimaryKey(Salegroup record);
}