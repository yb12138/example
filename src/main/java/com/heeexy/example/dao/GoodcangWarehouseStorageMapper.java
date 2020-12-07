package com.heeexy.example.dao;

import com.heeexy.example.model.GoodcangWarehouseStorage;
import com.heeexy.example.model.GoodcangWarehouseStorageExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GoodcangWarehouseStorageMapper {
    int countByExample(GoodcangWarehouseStorageExample example);

    int deleteByExample(GoodcangWarehouseStorageExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(GoodcangWarehouseStorage record);

    int insertSelective(GoodcangWarehouseStorage record);

    List<GoodcangWarehouseStorage> selectByExample(GoodcangWarehouseStorageExample example);

    GoodcangWarehouseStorage selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") GoodcangWarehouseStorage record, @Param("example") GoodcangWarehouseStorageExample example);

    int updateByExample(@Param("record") GoodcangWarehouseStorage record, @Param("example") GoodcangWarehouseStorageExample example);

    int updateByPrimaryKeySelective(GoodcangWarehouseStorage record);

    int updateByPrimaryKey(GoodcangWarehouseStorage record);
}