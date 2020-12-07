package com.heeexy.example.dao;

import com.heeexy.example.model.ProductWarehouseStorageBack;
import com.heeexy.example.model.ProductWarehouseStorageBackExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ProductWarehouseStorageBackMapper {
    int countByExample(ProductWarehouseStorageBackExample example);

    int deleteByExample(ProductWarehouseStorageBackExample example);

    int deleteByPrimaryKey(Integer backid);

    int insert(ProductWarehouseStorageBack record);

    int insertSelective(ProductWarehouseStorageBack record);

    List<ProductWarehouseStorageBack> selectByExample(ProductWarehouseStorageBackExample example);

    ProductWarehouseStorageBack selectByPrimaryKey(Integer backid);

    int updateByExampleSelective(@Param("record") ProductWarehouseStorageBack record, @Param("example") ProductWarehouseStorageBackExample example);

    int updateByExample(@Param("record") ProductWarehouseStorageBack record, @Param("example") ProductWarehouseStorageBackExample example);

    int updateByPrimaryKeySelective(ProductWarehouseStorageBack record);

    @Select("<script>" +
            "select * from product_warehouse_storage_back " +
            "<where>" +
            "<if test='sku!=null'>" +
            "and skuCode like  CONCAT('%',#{sku},'%') " +
            "</if>" +
            "<if test='month!=null'>" +
            "and month =#{month} and day =1 " +
            "</if>" +
            "</where>" +
            "order by productID DESC " +
            "<if test='start!=null'>" +
            "limit #{start},#{pageSize}" +
            "</if>" +
            "</script>")
    List<ProductWarehouseStorageBack> queryProduct(@Param("start") Integer start, @Param("pageSize") Integer pageSize, @Param("sku") String sku, @Param("month") Integer month);

    @Select("<script>" +
            "select count(1) from product_warehouse_storage_back " +
            "<where>" +
            "<if test='sku!=null'>" +
            "and skuCode like  CONCAT('%',#{sku},'%') " +
            "</if>" +
            "<if test='month!=null'>" +
            "and month =#{month} and day =1 " +
            "</if>" +
            "</where>" +
            "</script>")
    Integer getCount(@Param("sku") String sku, @Param("month") Integer month);

}