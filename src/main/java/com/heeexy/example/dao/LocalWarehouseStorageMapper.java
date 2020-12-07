package com.heeexy.example.dao;

import com.heeexy.example.model.LocalWarehouseStorage;
import com.heeexy.example.model.LocalWarehouseStorageExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface LocalWarehouseStorageMapper {
    int countByExample(LocalWarehouseStorageExample example);

    int deleteByExample(LocalWarehouseStorageExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(LocalWarehouseStorage record);

    int insertSelective(LocalWarehouseStorage record);

    List<LocalWarehouseStorage> selectByExample(LocalWarehouseStorageExample example);

    LocalWarehouseStorage selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") LocalWarehouseStorage record, @Param("example") LocalWarehouseStorageExample example);

    int updateByExample(@Param("record") LocalWarehouseStorage record, @Param("example") LocalWarehouseStorageExample example);

    int updateByPrimaryKeySelective(LocalWarehouseStorage record);

    int updateByPrimaryKey(LocalWarehouseStorage record);
}