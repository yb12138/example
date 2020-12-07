package com.heeexy.example.dao;

import com.heeexy.example.model.FbaWarehouseStorage;
import com.heeexy.example.model.FbaWarehouseStorageExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface FbaWarehouseStorageMapper {
    int countByExample(FbaWarehouseStorageExample example);

    int deleteByExample(FbaWarehouseStorageExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(FbaWarehouseStorage record);

    int insertSelective(FbaWarehouseStorage record);

    List<FbaWarehouseStorage> selectByExample(FbaWarehouseStorageExample example);

    FbaWarehouseStorage selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") FbaWarehouseStorage record, @Param("example") FbaWarehouseStorageExample example);

    int updateByExample(@Param("record") FbaWarehouseStorage record, @Param("example") FbaWarehouseStorageExample example);

    int updateByPrimaryKeySelective(FbaWarehouseStorage record);

    int updateByPrimaryKey(FbaWarehouseStorage record);
}