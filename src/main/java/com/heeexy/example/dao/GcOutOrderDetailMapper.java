package com.heeexy.example.dao;

import com.heeexy.example.model.GcOutOrderDetail;
import com.heeexy.example.model.GcOutOrderDetailExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GcOutOrderDetailMapper {
    int countByExample(GcOutOrderDetailExample example);

    int deleteByExample(GcOutOrderDetailExample example);

    int deleteByPrimaryKey(String orderCode);

    int insert(GcOutOrderDetail record);

    int insertSelective(GcOutOrderDetail record);

    List<GcOutOrderDetail> selectByExample(GcOutOrderDetailExample example);

    GcOutOrderDetail selectByPrimaryKey(String orderCode);

    int updateByExampleSelective(@Param("record") GcOutOrderDetail record, @Param("example") GcOutOrderDetailExample example);

    int updateByExample(@Param("record") GcOutOrderDetail record, @Param("example") GcOutOrderDetailExample example);

    int updateByPrimaryKeySelective(GcOutOrderDetail record);

    int updateByPrimaryKey(GcOutOrderDetail record);
}