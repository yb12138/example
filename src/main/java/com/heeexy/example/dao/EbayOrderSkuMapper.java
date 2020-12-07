package com.heeexy.example.dao;

import com.heeexy.example.model.EbayOrderSku;
import com.heeexy.example.model.EbayOrderSkuExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface EbayOrderSkuMapper {
    int countByExample(EbayOrderSkuExample example);

    int deleteByExample(EbayOrderSkuExample example);

    int deleteByPrimaryKey(Integer orderskuid);

    int insert(EbayOrderSku record);

    int insertSelective(EbayOrderSku record);

    List<EbayOrderSku> selectByExample(EbayOrderSkuExample example);

    EbayOrderSku selectByPrimaryKey(Integer orderskuid);

    int updateByExampleSelective(@Param("record") EbayOrderSku record, @Param("example") EbayOrderSkuExample example);

    int updateByExample(@Param("record") EbayOrderSku record, @Param("example") EbayOrderSkuExample example);

    int updateByPrimaryKeySelective(EbayOrderSku record);

    int updateByPrimaryKey(EbayOrderSku record);
}