package com.heeexy.example.dao;

import com.heeexy.example.model.GcOutOrderDetailSku;
import com.heeexy.example.model.GcOutOrderDetailSkuExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GcOutOrderDetailSkuMapper {
    int countByExample(GcOutOrderDetailSkuExample example);

    int deleteByExample(GcOutOrderDetailSkuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GcOutOrderDetailSku record);

    int insertSelective(GcOutOrderDetailSku record);

    List<GcOutOrderDetailSku> selectByExample(GcOutOrderDetailSkuExample example);

    GcOutOrderDetailSku selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GcOutOrderDetailSku record, @Param("example") GcOutOrderDetailSkuExample example);

    int updateByExample(@Param("record") GcOutOrderDetailSku record, @Param("example") GcOutOrderDetailSkuExample example);

    int updateByPrimaryKeySelective(GcOutOrderDetailSku record);

    int updateByPrimaryKey(GcOutOrderDetailSku record);
}