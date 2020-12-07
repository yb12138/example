package com.heeexy.example.dao;

import com.heeexy.example.model.WinitOrderDetailSku;
import com.heeexy.example.model.WinitOrderDetailSkuExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface WinitOrderDetailSkuMapper {
    int countByExample(WinitOrderDetailSkuExample example);

    int deleteByExample(WinitOrderDetailSkuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WinitOrderDetailSku record);

    int insertSelective(WinitOrderDetailSku record);

    List<WinitOrderDetailSku> selectByExample(WinitOrderDetailSkuExample example);

    WinitOrderDetailSku selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WinitOrderDetailSku record, @Param("example") WinitOrderDetailSkuExample example);

    int updateByExample(@Param("record") WinitOrderDetailSku record, @Param("example") WinitOrderDetailSkuExample example);

    int updateByPrimaryKeySelective(WinitOrderDetailSku record);

    int updateByPrimaryKey(WinitOrderDetailSku record);
}