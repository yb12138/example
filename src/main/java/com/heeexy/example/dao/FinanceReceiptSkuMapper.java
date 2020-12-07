package com.heeexy.example.dao;

import com.heeexy.example.model.FinanceReceiptSku;
import com.heeexy.example.model.FinanceReceiptSkuExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface FinanceReceiptSkuMapper {
    int countByExample(FinanceReceiptSkuExample example);

    int deleteByExample(FinanceReceiptSkuExample example);

    int deleteByPrimaryKey(Integer receiptskuid);

    int insert(FinanceReceiptSku record);

    int insertSelective(FinanceReceiptSku record);

    List<FinanceReceiptSku> selectByExample(FinanceReceiptSkuExample example);

    FinanceReceiptSku selectByPrimaryKey(Integer receiptskuid);

    int updateByExampleSelective(@Param("record") FinanceReceiptSku record, @Param("example") FinanceReceiptSkuExample example);

    int updateByExample(@Param("record") FinanceReceiptSku record, @Param("example") FinanceReceiptSkuExample example);

    int updateByPrimaryKeySelective(FinanceReceiptSku record);

    int updateByPrimaryKey(FinanceReceiptSku record);
}