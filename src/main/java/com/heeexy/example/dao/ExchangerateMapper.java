package com.heeexy.example.dao;

import com.heeexy.example.model.Exchangerate;
import com.heeexy.example.model.ExchangerateExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ExchangerateMapper {
    int countByExample(ExchangerateExample example);

    int deleteByExample(ExchangerateExample example);

    int deleteByPrimaryKey(String code);

    int insert(Exchangerate record);

    int insertSelective(Exchangerate record);

    List<Exchangerate> selectByExample(ExchangerateExample example);

    Exchangerate selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") Exchangerate record, @Param("example") ExchangerateExample example);

    int updateByExample(@Param("record") Exchangerate record, @Param("example") ExchangerateExample example);

    int updateByPrimaryKeySelective(Exchangerate record);

    int updateByPrimaryKey(Exchangerate record);

    @Select("select month1,month2,month3,month4,month5,month6,month7,month8,month9,month10,month11,month12 from exchangerate where code =#{code}")
    Map<String, Double> queryRateByMonth(@Param("code") String code);
}