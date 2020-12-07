package com.heeexy.example.dao;

import com.heeexy.example.model.ProductSupplier;
import com.heeexy.example.model.ProductSupplierExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProductSupplierMapper {
    int countByExample(ProductSupplierExample example);

    int deleteByExample(ProductSupplierExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(ProductSupplier record);

    int insertSelective(ProductSupplier record);

    List<ProductSupplier> selectByExample(ProductSupplierExample example);

    ProductSupplier selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") ProductSupplier record, @Param("example") ProductSupplierExample example);

    int updateByExample(@Param("record") ProductSupplier record, @Param("example") ProductSupplierExample example);

    int updateByPrimaryKeySelective(ProductSupplier record);

    int updateByPrimaryKey(ProductSupplier record);
}