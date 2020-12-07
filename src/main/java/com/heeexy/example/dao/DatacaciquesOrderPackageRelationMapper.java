package com.heeexy.example.dao;

import com.heeexy.example.model.DatacaciquesOrderPackageRelation;
import com.heeexy.example.model.DatacaciquesOrderPackageRelationExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface DatacaciquesOrderPackageRelationMapper {
    int countByExample(DatacaciquesOrderPackageRelationExample example);

    int deleteByExample(DatacaciquesOrderPackageRelationExample example);

    int insert(DatacaciquesOrderPackageRelation record);

    int insertSelective(DatacaciquesOrderPackageRelation record);

    List<DatacaciquesOrderPackageRelation> selectByExample(DatacaciquesOrderPackageRelationExample example);

    int updateByExampleSelective(@Param("record") DatacaciquesOrderPackageRelation record, @Param("example") DatacaciquesOrderPackageRelationExample example);

    int updateByExample(@Param("record") DatacaciquesOrderPackageRelation record, @Param("example") DatacaciquesOrderPackageRelationExample example);

    @Select("SELECT * from  datacaciques_order_package_relation GROUP BY packageID HAVING COUNT(packageID)>1")
    List<DatacaciquesOrderPackageRelation> getAllRelation();

}