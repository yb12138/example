package com.heeexy.example.dao;

import com.heeexy.example.model.WinitOutOrderDetail;
import com.heeexy.example.model.WinitOutOrderDetailExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface WinitOutOrderDetailMapper {
    int countByExample(WinitOutOrderDetailExample example);

    int deleteByExample(WinitOutOrderDetailExample example);

    int deleteByPrimaryKey(String outboundordernum);

    int insert(WinitOutOrderDetail record);

    int insertSelective(WinitOutOrderDetail record);

    List<WinitOutOrderDetail> selectByExample(WinitOutOrderDetailExample example);

    WinitOutOrderDetail selectByPrimaryKey(String outboundordernum);

    int updateByExampleSelective(@Param("record") WinitOutOrderDetail record, @Param("example") WinitOutOrderDetailExample example);

    int updateByExample(@Param("record") WinitOutOrderDetail record, @Param("example") WinitOutOrderDetailExample example);

    int updateByPrimaryKeySelective(WinitOutOrderDetail record);

    int updateByPrimaryKey(WinitOutOrderDetail record);
}