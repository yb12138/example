package com.heeexy.example.dao;

import com.heeexy.example.model.WinitRebateMoney;
import com.heeexy.example.model.WinitRebateMoneyExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface WinitRebateMoneyMapper {
    int countByExample(WinitRebateMoneyExample example);

    int deleteByExample(WinitRebateMoneyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WinitRebateMoney record);

    int insertSelective(WinitRebateMoney record);

    List<WinitRebateMoney> selectByExample(WinitRebateMoneyExample example);

    WinitRebateMoney selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WinitRebateMoney record, @Param("example") WinitRebateMoneyExample example);

    int updateByExample(@Param("record") WinitRebateMoney record, @Param("example") WinitRebateMoneyExample example);

    int updateByPrimaryKeySelective(WinitRebateMoney record);

    int updateByPrimaryKey(WinitRebateMoney record);
}