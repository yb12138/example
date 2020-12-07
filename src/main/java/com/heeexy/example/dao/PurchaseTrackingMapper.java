package com.heeexy.example.dao;

import com.heeexy.example.model.PurchaseTracking;
import com.heeexy.example.model.PurchaseTrackingExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PurchaseTrackingMapper {
    int countByExample(PurchaseTrackingExample example);

    int deleteByExample(PurchaseTrackingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PurchaseTracking record);

    int insertSelective(PurchaseTracking record);

    List<PurchaseTracking> selectByExample(PurchaseTrackingExample example);

    PurchaseTracking selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PurchaseTracking record, @Param("example") PurchaseTrackingExample example);

    int updateByExample(@Param("record") PurchaseTracking record, @Param("example") PurchaseTrackingExample example);

    int updateByPrimaryKeySelective(PurchaseTracking record);

    int updateByPrimaryKey(PurchaseTracking record);
}