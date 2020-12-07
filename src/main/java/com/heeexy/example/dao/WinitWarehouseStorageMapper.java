package com.heeexy.example.dao;

import com.heeexy.example.model.WinitWarehouseStorage;
import com.heeexy.example.model.WinitWarehouseStorageExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface WinitWarehouseStorageMapper {
    int countByExample(WinitWarehouseStorageExample example);

    int deleteByExample(WinitWarehouseStorageExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(WinitWarehouseStorage record);

    int insertSelective(WinitWarehouseStorage record);

    List<WinitWarehouseStorage> selectByExample(WinitWarehouseStorageExample example);

    WinitWarehouseStorage selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") WinitWarehouseStorage record, @Param("example") WinitWarehouseStorageExample example);

    int updateByExample(@Param("record") WinitWarehouseStorage record, @Param("example") WinitWarehouseStorageExample example);

    int updateByPrimaryKeySelective(WinitWarehouseStorage record);

    int updateByPrimaryKey(WinitWarehouseStorage record);
}