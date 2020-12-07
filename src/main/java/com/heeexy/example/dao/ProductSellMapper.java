package com.heeexy.example.dao;

import com.heeexy.example.model.ProductSell;
import com.heeexy.example.model.ProductSellExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ProductSellMapper {
    int countByExample(ProductSellExample example);

    int deleteByExample(ProductSellExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(ProductSell record);

    int insertSelective(ProductSell record);

    List<ProductSell> selectByExample(ProductSellExample example);

    ProductSell selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") ProductSell record, @Param("example") ProductSellExample example);

    int updateByExample(@Param("record") ProductSell record, @Param("example") ProductSellExample example);

    int updateByPrimaryKeySelective(ProductSell record);

    int updateByPrimaryKey(ProductSell record);

    @Select("select month1,month2,month3,month4,month5,month6,month7,month8,month9,month10,month11,month12 from product_sell where productID =#{productID}")
    Map<String, Double> queryByProduct(Integer productID);

    @Select("<script>" +
            "select ps.*,p.skuCode,p.cnName,p.warehouseName,p.imgurl from product_sell ps left join product p on p.productID=ps.productID" +
            "<where>" +
            "<if test='sku!=null'>" +
            "and p.skuCode like  CONCAT('%',#{sku},'%') " +
            "</if>" +
            "<if test='name!=null'>" +
            "and p.cnName like  CONCAT('%',#{name},'%') " +
            "</if>" +
            "<if test='warehouseid!=null'>" +
            "and p.warehouseID =#{warehouseid}" +
            "</if>" +
            "<if test='productlevel!=null'>" +
            "and p.productlevel =#{productlevel}" +
            "</if>" +
            "</where>" +
            "order by ps.productID DESC " +
            "limit #{start},#{size}" +
            "</script>")
    List<ProductSell> getSells(@Param("start") int start, @Param("size") Integer size, @Param("sku") String sku, @Param("name") String name, @Param("warehouseid") Long warehouseid, @Param("productlevel") String productlevel);

    @Select("<script>" +
            "select count(1) from product_sell ps left join product p on p.productID=ps.productID" +
            "<where>" +
            "<if test='sku!=null'>" +
            "and p.skuCode like  CONCAT('%',#{sku},'%') " +
            "</if>" +
            "<if test='name!=null'>" +
            "and p.cnName like  CONCAT('%',#{name},'%') " +
            "</if>" +
            "<if test='productlevel!=null'>" +
            "and p.productlevel =#{productlevel}" +
            "</if>" +
            "<if test='warehouseid!=null'>" +
            "and p.warehouseID =#{warehouseid}" +
            "</if>" +
            "</where>" +
            "</script>")
    Integer getCount(@Param("sku") String sku, @Param("name") String name, @Param("warehouseid") Long warehouseid, @Param("productlevel") String productlevel);
}