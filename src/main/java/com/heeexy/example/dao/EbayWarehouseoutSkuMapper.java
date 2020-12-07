package com.heeexy.example.dao;

import com.heeexy.example.model.EbayWarehouseoutSku;
import com.heeexy.example.model.EbayWarehouseoutSkuExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface EbayWarehouseoutSkuMapper {
    int countByExample(EbayWarehouseoutSkuExample example);

    int deleteByExample(EbayWarehouseoutSkuExample example);

    int deleteByPrimaryKey(Integer packageskuid);

    int insert(EbayWarehouseoutSku record);

    int insertSelective(EbayWarehouseoutSku record);

    List<EbayWarehouseoutSku> selectByExample(EbayWarehouseoutSkuExample example);

    EbayWarehouseoutSku selectByPrimaryKey(Integer packageskuid);

    int updateByExampleSelective(@Param("record") EbayWarehouseoutSku record, @Param("example") EbayWarehouseoutSkuExample example);

    int updateByExample(@Param("record") EbayWarehouseoutSku record, @Param("example") EbayWarehouseoutSkuExample example);

    int updateByPrimaryKeySelective(EbayWarehouseoutSku record);

    int updateByPrimaryKey(EbayWarehouseoutSku record);
}