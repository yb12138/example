package com.heeexy.example.dao;

import com.heeexy.example.model.Afteraccount;
import com.heeexy.example.model.AfteraccountExample;

import java.util.List;

import com.heeexy.example.model.Paypalaccount;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AfteraccountMapper {
    int countByExample(AfteraccountExample example);

    int deleteByExample(AfteraccountExample example);

    int deleteByPrimaryKey(Integer accountid);

    int insert(Afteraccount record);

    int insertSelective(Afteraccount record);

    List<Afteraccount> selectByExample(AfteraccountExample example);

    Afteraccount selectByPrimaryKey(Integer accountid);

    int updateByExampleSelective(@Param("record") Afteraccount record, @Param("example") AfteraccountExample example);

    int updateByExample(@Param("record") Afteraccount record, @Param("example") AfteraccountExample example);

    int updateByPrimaryKeySelective(Afteraccount record);

    int updateByPrimaryKey(Afteraccount record);

    @Select("select * from afteraccount where accountname=#{accountname}")
    Afteraccount search(@Param("accountname") String accountname);
}