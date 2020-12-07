package com.heeexy.example.dao;

import com.heeexy.example.model.DatacaciquesOrder;
import com.heeexy.example.model.DatacaciquesOrderPackageRelation;
import com.heeexy.example.model.DatacaciquesPackage;
import com.heeexy.example.model.DatacaciquesPackageExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface DatacaciquesPackageMapper {
    int countByExample(DatacaciquesPackageExample example);

    int deleteByExample(DatacaciquesPackageExample example);

    int deleteByPrimaryKey(Long packageid);

    int insert(DatacaciquesPackage record);

    int insertSelective(DatacaciquesPackage record);

    List<DatacaciquesPackage> selectByExample(DatacaciquesPackageExample example);

    DatacaciquesPackage selectByPrimaryKey(Long packageid);

    int updateByExampleSelective(@Param("record") DatacaciquesPackage record, @Param("example") DatacaciquesPackageExample example);

    int updateByExample(@Param("record") DatacaciquesPackage record, @Param("example") DatacaciquesPackageExample example);

    int updateByPrimaryKeySelective(DatacaciquesPackage record);

    int updateByPrimaryKey(DatacaciquesPackage record);

    @Select("<script>" +
            "select  * from datacaciques_package dpackage " +
            "<where>" +
            "<if test='start!=null'>" +
            " createTime between #{start} and #{end}" +
            "</if>" +
            "</where>" +
            "</script>")
    List<DatacaciquesPackage> exportAllOrder(@Param("start") String start, @Param("end") String end);


}