package com.heeexy.example.dao;

import com.heeexy.example.model.ProductWarehouseStorage;
import com.heeexy.example.model.ProductWarehouseStorageExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ProductWarehouseStorageMapper {
    int countByExample(ProductWarehouseStorageExample example);

    int deleteByExample(ProductWarehouseStorageExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(ProductWarehouseStorage record);

    int insertSelective(ProductWarehouseStorage record);

    List<ProductWarehouseStorage> selectByExample(ProductWarehouseStorageExample example);

    ProductWarehouseStorage selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") ProductWarehouseStorage record, @Param("example") ProductWarehouseStorageExample example);

    int updateByExample(@Param("record") ProductWarehouseStorage record, @Param("example") ProductWarehouseStorageExample example);

    int updateByPrimaryKeySelective(ProductWarehouseStorage record);

    int updateByPrimaryKey(ProductWarehouseStorage record);

    @Select("<script>" +
            "select pws.*,p.headwayType,p.cnName,p.imgurl from product_warehouse_storage pws left join product p on p.productID=pws.productID " +
            "<where>" +
            "<if test='name!=null'>" +
            " p.cnName like CONCAT('%',#{name},'%')" +
            "</if>" +
            "<if test='sku!=null'>" +
            "and p.skuCode like  CONCAT('%',#{sku},'%') " +
            "</if>" +
            "<if test='warehouseid!=null'>" +
            "and pws.warehouseID =#{warehouseid} " +
            "</if>" +
            "</where>" +
            "order by pws.productID DESC " +
            "<if test='start!=null'>" +
            "limit #{start},#{pageSize}" +
            "</if>" +
            "</script>")
    List<ProductWarehouseStorage> queryProduct(@Param("start") Integer start, @Param("pageSize") Integer pageSize, @Param("name") String name, @Param("sku") String sku, @Param("warehouseid") Long warehouseid);

    @Select("<script>" +
            "select count(1) from product_warehouse_storage pws left join product p on p.productID=pws.productID " +
            "<where>" +
            "<if test='name!=null'>" +
            " p.cnName like CONCAT('%',#{name},'%')" +
            "</if>" +
            "<if test='sku!=null'>" +
            "and p.skuCode like  CONCAT('%',#{sku},'%') " +
            "</if>" +
            "<if test='warehouseid!=null'>" +
            "and pws.warehouseID =#{warehouseid} " +
            "</if>" +
            "</where>" +
            "</script>")
    Integer getCount(@Param("name") String name, @Param("sku") String sku, @Param("warehouseid") Long warehouseid);

    @Update("update product_warehouse_storage set onSell=0")
    void clearStorage();
}