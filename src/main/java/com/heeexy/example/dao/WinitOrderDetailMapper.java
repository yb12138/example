package com.heeexy.example.dao;

import com.heeexy.example.model.WinitOrderDetail;
import com.heeexy.example.model.WinitOrderDetailExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface WinitOrderDetailMapper {
    int countByExample(WinitOrderDetailExample example);

    int deleteByExample(WinitOrderDetailExample example);

    int insert(WinitOrderDetail record);

    int insertSelective(WinitOrderDetail record);

    List<WinitOrderDetail> selectByExample(WinitOrderDetailExample example);

    int updateByExampleSelective(@Param("record") WinitOrderDetail record, @Param("example") WinitOrderDetailExample example);

    int updateByExample(@Param("record") WinitOrderDetail record, @Param("example") WinitOrderDetailExample example);
}