package com.heeexy.example.dao;

import com.heeexy.example.model.PurchaseSku;
import com.heeexy.example.model.PurchaseSkuExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface PurchaseSkuMapper {
    int countByExample(PurchaseSkuExample example);

    int deleteByExample(PurchaseSkuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PurchaseSku record);

    int insertSelective(PurchaseSku record);

    List<PurchaseSku> selectByExample(PurchaseSkuExample example);

    PurchaseSku selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PurchaseSku record, @Param("example") PurchaseSkuExample example);

    int updateByExample(@Param("record") PurchaseSku record, @Param("example") PurchaseSkuExample example);

    int updateByPrimaryKeySelective(PurchaseSku record);

    int updateByPrimaryKey(PurchaseSku record);

    @Select("SELECT * from purchase_sku WHERE useQuantity>stockInQuantity")
    List<PurchaseSku> getPurchaseSkus();
}