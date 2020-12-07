package com.heeexy.example.dao;

import com.heeexy.example.model.WinitOutOrder;
import com.heeexy.example.model.WinitOutOrderExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface WinitOutOrderMapper {
    int countByExample(WinitOutOrderExample example);

    int deleteByExample(WinitOutOrderExample example);

    int deleteByPrimaryKey(String exwarehouseid);

    int insert(WinitOutOrder record);

    int insertSelective(WinitOutOrder record);

    List<WinitOutOrder> selectByExample(WinitOutOrderExample example);

    WinitOutOrder selectByPrimaryKey(String exwarehouseid);

    int updateByExampleSelective(@Param("record") WinitOutOrder record, @Param("example") WinitOutOrderExample example);

    int updateByExample(@Param("record") WinitOutOrder record, @Param("example") WinitOutOrderExample example);

    int updateByPrimaryKeySelective(WinitOutOrder record);

    int updateByPrimaryKey(WinitOutOrder record);
}