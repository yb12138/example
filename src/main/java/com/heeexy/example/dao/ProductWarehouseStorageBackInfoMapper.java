package com.heeexy.example.dao;

import com.heeexy.example.model.ProductWarehouseStorageBackInfo;
import com.heeexy.example.model.ProductWarehouseStorageBackInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProductWarehouseStorageBackInfoMapper {
    int countByExample(ProductWarehouseStorageBackInfoExample example);

    int deleteByExample(ProductWarehouseStorageBackInfoExample example);

    int deleteByPrimaryKey(Integer backid);

    int insert(ProductWarehouseStorageBackInfo record);

    int insertSelective(ProductWarehouseStorageBackInfo record);

    List<ProductWarehouseStorageBackInfo> selectByExample(ProductWarehouseStorageBackInfoExample example);

    ProductWarehouseStorageBackInfo selectByPrimaryKey(Integer backid);

    int updateByExampleSelective(@Param("record") ProductWarehouseStorageBackInfo record, @Param("example") ProductWarehouseStorageBackInfoExample example);

    int updateByExample(@Param("record") ProductWarehouseStorageBackInfo record, @Param("example") ProductWarehouseStorageBackInfoExample example);

    int updateByPrimaryKeySelective(ProductWarehouseStorageBackInfo record);

    int updateByPrimaryKey(ProductWarehouseStorageBackInfo record);
}