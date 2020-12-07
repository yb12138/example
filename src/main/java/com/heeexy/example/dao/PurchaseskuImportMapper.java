package com.heeexy.example.dao;

import com.heeexy.example.model.PurchaseskuImport;
import com.heeexy.example.model.PurchaseskuImportExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PurchaseskuImportMapper {
    int countByExample(PurchaseskuImportExample example);

    int deleteByExample(PurchaseskuImportExample example);

    int insert(PurchaseskuImport record);

    int insertSelective(PurchaseskuImport record);

    List<PurchaseskuImport> selectByExample(PurchaseskuImportExample example);

    int updateByExampleSelective(@Param("record") PurchaseskuImport record, @Param("example") PurchaseskuImportExample example);

    int updateByExample(@Param("record") PurchaseskuImport record, @Param("example") PurchaseskuImportExample example);
}