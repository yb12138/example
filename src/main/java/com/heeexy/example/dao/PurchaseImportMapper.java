package com.heeexy.example.dao;

import com.heeexy.example.model.PurchaseImport;
import com.heeexy.example.model.PurchaseImportExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface PurchaseImportMapper {
    int countByExample(PurchaseImportExample example);

    int deleteByExample(PurchaseImportExample example);

    int insert(PurchaseImport record);

    int insertSelective(PurchaseImport record);

    List<PurchaseImport> selectByExample(PurchaseImportExample example);

    int updateByExampleSelective(@Param("record") PurchaseImport record, @Param("example") PurchaseImportExample example);

    int updateByExample(@Param("record") PurchaseImport record, @Param("example") PurchaseImportExample example);

}