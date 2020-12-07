package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.Product;
import com.heeexy.example.model.ProductExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ProductMapper {
    int countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    @Select("<script>" +
            "select * from product " +
            "<where>" +
            "<if test='name!=null'>" +
            " cnName like CONCAT('%',#{name},'%')" +
            "</if>" +
            "<if test='sku!=null'>" +
            "and skuCode like  CONCAT('%',#{sku},'%') " +
            "</if>" +
            "<if test='warehouse!=null'>" +
            "and warehouseID =#{warehouse} " +
            "</if>" +
            "</where>" +
            "order by productID DESC " +
            "limit #{start},#{size}" +
            "</script>")
    List<Product> queryProduct(@Param("start") int start, @Param("size") int size, @Param("name") String name, @Param("sku") String sku, @Param("code") String code, @Param("warehouse") Long warehouse);

    @Select("<script>" +
            "select count(1) from product " +
            "<where>" +
            "<if test='name!=null'>" +
            " cnName like CONCAT('%',#{name},'%')" +
            "</if>" +
            "<if test='sku!=null'>" +
            "and skuCode like  CONCAT('%',#{sku},'%') " +
            "</if>" +
            "<if test='warehouse!=null'>" +
            "and warehouseID =#{warehouse} " +
            "</if>" +
            "</where>" +
            "</script>")
    Integer queryProductCount(@Param("name") String name, @Param("sku") String sku, @Param("code") String code, @Param("warehouse") Long warehouse);


    @Select("select * from product where supplierID=#{supplierId} ")
    List<Product> listBySupplierId(@Param("supplier") Integer supplierId);

    @Select("select * from product where skuCode=#{sku} ")
    Product queryBySku(@Param("sku") String sku);

    @Select("select * from product where warehouseID=#{warehouseId} and productlevel='在售' ")
    List<Product> queryByWarn(@Param("warehouseId") Long warehouseId);
}