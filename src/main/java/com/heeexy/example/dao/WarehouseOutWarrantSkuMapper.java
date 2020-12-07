package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.WarehouseOutWarrantSku;
import com.heeexy.example.model.WarehouseOutWarrantSkuExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface WarehouseOutWarrantSkuMapper {
    int countByExample(WarehouseOutWarrantSkuExample example);

    int deleteByExample(WarehouseOutWarrantSkuExample example);

    int deleteByPrimaryKey(Integer wowsid);

    int insert(WarehouseOutWarrantSku record);

    int insertSelective(WarehouseOutWarrantSku record);

    List<WarehouseOutWarrantSku> selectByExample(WarehouseOutWarrantSkuExample example);

    WarehouseOutWarrantSku selectByPrimaryKey(Integer wowsid);

    int updateByExampleSelective(@Param("record") WarehouseOutWarrantSku record, @Param("example") WarehouseOutWarrantSkuExample example);

    int updateByExample(@Param("record") WarehouseOutWarrantSku record, @Param("example") WarehouseOutWarrantSkuExample example);

    int updateByPrimaryKeySelective(WarehouseOutWarrantSku record);

    int updateByPrimaryKey(WarehouseOutWarrantSku record);

    @Select("select * from warehouse_out_warrant_sku where outID=#{outID}")
    List<JSONObject> getSkus(@Param("outID") Integer outID);

    @Select("select * from warehouse_out_warrant_sku where outID=#{outID}")
    List<WarehouseOutWarrantSku> getoutSkus(@Param("outID") Integer outID);
}