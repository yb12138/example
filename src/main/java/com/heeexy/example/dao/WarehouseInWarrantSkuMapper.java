package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.WarehouseInWarrantSku;
import com.heeexy.example.model.WarehouseInWarrantSkuExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface WarehouseInWarrantSkuMapper {
    int countByExample(WarehouseInWarrantSkuExample example);

    int deleteByExample(WarehouseInWarrantSkuExample example);

    int deleteByPrimaryKey(Integer inskuid);

    int insert(WarehouseInWarrantSku record);

    int insertSelective(WarehouseInWarrantSku record);

    List<WarehouseInWarrantSku> selectByExample(WarehouseInWarrantSkuExample example);

    WarehouseInWarrantSku selectByPrimaryKey(Integer inskuid);

    int updateByExampleSelective(@Param("record") WarehouseInWarrantSku record, @Param("example") WarehouseInWarrantSkuExample example);

    int updateByExample(@Param("record") WarehouseInWarrantSku record, @Param("example") WarehouseInWarrantSkuExample example);

    int updateByPrimaryKeySelective(WarehouseInWarrantSku record);

    int updateByPrimaryKey(WarehouseInWarrantSku record);


    @Select("select * from warehouse_in_warrant_sku where inID=#{inID}")
    List<JSONObject> getSkus(@Param("inID") Integer inID);

    @Select("select distinct productID from warehouse_in_warrant_sku where status!=3 ")
    List<Integer> listAllInProduct();
}