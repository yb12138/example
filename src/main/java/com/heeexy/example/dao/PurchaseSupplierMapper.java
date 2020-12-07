package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.PurchaseSupplier;
import com.heeexy.example.model.PurchaseSupplierExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface PurchaseSupplierMapper {
    int countByExample(PurchaseSupplierExample example);

    int deleteByExample(PurchaseSupplierExample example);

    int deleteByPrimaryKey(Integer supplierid);

    int insert(PurchaseSupplier record);

    int insertSelective(PurchaseSupplier record);

    List<PurchaseSupplier> selectByExampleWithBLOBs(PurchaseSupplierExample example);

    List<PurchaseSupplier> selectByExample(PurchaseSupplierExample example);

    PurchaseSupplier selectByPrimaryKey(Integer supplierid);

    int updateByExampleSelective(@Param("record") PurchaseSupplier record, @Param("example") PurchaseSupplierExample example);

    int updateByExampleWithBLOBs(@Param("record") PurchaseSupplier record, @Param("example") PurchaseSupplierExample example);

    int updateByExample(@Param("record") PurchaseSupplier record, @Param("example") PurchaseSupplierExample example);

    int updateByPrimaryKeySelective(PurchaseSupplier record);

    int updateByPrimaryKeyWithBLOBs(PurchaseSupplier record);

    int updateByPrimaryKey(PurchaseSupplier record);

    @Select("select supplierID,supplierName,linkurl from purchase_supplier")
    List<JSONObject> getSuppliers();

    @Select("<script>" +
            "select * from purchase_supplier " +
            "<where>" +
            "<if test='name!=null'>" +
            " supplierName like CONCAT('%',#{name},'%')" +
            "</if>" +
            "</where>" +
            "order by supplierID DESC " +
            "limit #{start},#{pageSize}" +
            "</script>")
    List<PurchaseSupplier> queryAllSupplier(@Param("start") int start, @Param("pageSize") Integer pageSize, @Param("name") String name);

    @Select("<script>" +
            "select count(1) from purchase_supplier " +
            "<where>" +
            "<if test='name!=null'>" +
            " supplierName like CONCAT('%',#{name},'%')" +
            "</if>" +
            "</where>" +
            "</script>")
    Integer getCount(@Param("name") String name);

    @Select("<script>" +
            "select count(1) from purchase_supplier " +
            "<where>" +
            "<if test='name!=null'>" +
            " supplierName =#{name}" +
            "</if>" +
            "</where>" +
            "</script>")
    Integer getSupplierCount(@Param("name") String name);

    @Select("select * from purchase_supplier where supplierName=#{supplierName}")
    PurchaseSupplier getSupplierByName(@Param("supplierName") String supplierName);
}