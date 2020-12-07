package com.heeexy.example.dao;

import com.heeexy.example.model.ProductHoliday;
import com.heeexy.example.model.ProductHolidayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductHolidayMapper {
    int countByExample(ProductHolidayExample example);

    int deleteByExample(ProductHolidayExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(ProductHoliday record);

    int insertSelective(ProductHoliday record);

    List<ProductHoliday> selectByExample(ProductHolidayExample example);

    ProductHoliday selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") ProductHoliday record, @Param("example") ProductHolidayExample example);

    int updateByExample(@Param("record") ProductHoliday record, @Param("example") ProductHolidayExample example);

    int updateByPrimaryKeySelective(ProductHoliday record);

    int updateByPrimaryKey(ProductHoliday record);
}