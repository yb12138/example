package com.heeexy.example.dao;

import com.heeexy.example.model.EbayWarehouseout;
import com.heeexy.example.model.EbayWarehouseoutExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface EbayWarehouseoutMapper {
    int countByExample(EbayWarehouseoutExample example);

    int deleteByExample(EbayWarehouseoutExample example);

    int deleteByPrimaryKey(Integer ebaywarehouseid);

    int insert(EbayWarehouseout record);

    int insertSelective(EbayWarehouseout record);

    List<EbayWarehouseout> selectByExample(EbayWarehouseoutExample example);

    EbayWarehouseout selectByPrimaryKey(Integer ebaywarehouseid);

    int updateByExampleSelective(@Param("record") EbayWarehouseout record, @Param("example") EbayWarehouseoutExample example);

    int updateByExample(@Param("record") EbayWarehouseout record, @Param("example") EbayWarehouseoutExample example);

    int updateByPrimaryKeySelective(EbayWarehouseout record);

    int updateByPrimaryKey(EbayWarehouseout record);
}