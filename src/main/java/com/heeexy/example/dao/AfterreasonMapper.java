package com.heeexy.example.dao;

import com.heeexy.example.model.Afterreason;
import com.heeexy.example.model.AfterreasonExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AfterreasonMapper {
    int countByExample(AfterreasonExample example);

    int deleteByExample(AfterreasonExample example);

    int deleteByPrimaryKey(Integer reasonid);

    int insert(Afterreason record);

    int insertSelective(Afterreason record);

    List<Afterreason> selectByExample(AfterreasonExample example);

    Afterreason selectByPrimaryKey(Integer reasonid);

    int updateByExampleSelective(@Param("record") Afterreason record, @Param("example") AfterreasonExample example);

    int updateByExample(@Param("record") Afterreason record, @Param("example") AfterreasonExample example);

    int updateByPrimaryKeySelective(Afterreason record);

    int updateByPrimaryKey(Afterreason record);

    @Select("select * from afterreason where reasonname=#{reasonname}")
    Afterreason search(@Param("reasonname") String reasonname);
}