package com.heeexy.example.dao;

import com.heeexy.example.model.EcOrder;
import com.heeexy.example.model.EcOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcOrderMapper {
    int countByExample(EcOrderExample example);

    int deleteByExample(EcOrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(EcOrder record);

    int insertSelective(EcOrder record);

    List<EcOrder> selectByExample(EcOrderExample example);

    EcOrder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") EcOrder record, @Param("example") EcOrderExample example);

    int updateByExample(@Param("record") EcOrder record, @Param("example") EcOrderExample example);

    int updateByPrimaryKeySelective(EcOrder record);

    int updateByPrimaryKey(EcOrder record);
}