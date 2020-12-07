package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.Purchase;
import com.heeexy.example.model.PurchaseExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface PurchaseMapper {
    int countByExample(PurchaseExample example);

    int deleteByExample(PurchaseExample example);

    int deleteByPrimaryKey(Integer purchaseid);

    int insert(Purchase record);

    int insertSelective(Purchase record);

    List<Purchase> selectByExample(PurchaseExample example);

    Purchase selectByPrimaryKey(Integer purchaseid);

    int updateByExampleSelective(@Param("record") Purchase record, @Param("example") PurchaseExample example);

    int updateByExample(@Param("record") Purchase record, @Param("example") PurchaseExample example);

    int updateByPrimaryKeySelective(Purchase record);

    int updateByPrimaryKey(Purchase record);

    @Select("<script>" +
            "select distinct p.* from purchase p left join purchase_sku ps on ps.purchaseID=p.purchaseID" +
            "<where>" +
            "1=1 " +
            "<if test='warehouseid!=null'>" +
            "and warehouseID =#{warehouseid}" +
            "</if>" +
            "<if test='sku!=null'>" +
            "and sku like  CONCAT('%',#{sku},'%') " +
            "</if>" +
            "<if test='purchaseNum!=null'>" +
            "and purchaseNum like  CONCAT('%',#{purchaseNum},'%') " +
            "</if>" +
            "<if test='purchaseStatus!=null'>" +
            "and purchaseStatus =#{purchaseStatus} " +
            "</if>" +
            "<if test='financeStatus!=null'>" +
            "and financeStatus =#{financeStatus} " +
            "</if>" +
            "<if test='warehouseStatus!=null'>" +
            "and warehouseStatus =#{warehouseStatus} " +
            "</if>" +
            "<if test='cnWarehouseInStatus!=null'>" +
            "and cnWarehouseInStatus =#{cnWarehouseInStatus} " +
            "</if>" +
            "<if test='cnWarehouseOutStatus!=null'>" +
            "and cnWarehouseOutStatus =#{cnWarehouseOutStatus} " +
            "</if>" +
            "<if test='startday!=null'>" +
            "and p.createTime between #{startday} and #{endday} " +
            "</if>" +
            "<if test='flag!=null'>" +
            "and financeStatus>=3" +
            "</if>" +
            "<if test='specialStatus!=null'>" +
            " and specialStatus=#{specialStatus}" +
            "</if>" +
            "</where>" +
            "order by p.createTime DESC " +
            "<if test='start!=null'>" +
            "limit #{start},#{size}" +
            "</if>" +
            "</script>")
    List<JSONObject> queryPurchase(@Param("start") Integer start, @Param("size") Integer size, @Param("warehouseid") Long warehouseid, @Param("sku") String sku, @Param("purchaseNum") String purchaseNum, @Param("purchaseStatus") Integer purchaseStatus, @Param("financeStatus") Integer financeStatus, @Param("warehouseStatus") Integer warehouseStatus, @Param("cnWarehouseInStatus") Integer cnWarehouseInStatus, @Param("cnWarehouseOutStatus") Integer cnWarehouseOutStatus, @Param("startday") String startday, @Param("endday") String endday, @Param("flag") Integer flag, @Param("specialStatus") Integer specialStatus);

    @Select("<script>" +
            "select count(1) from purchase p left join purchase_sku ps on ps.purchaseID=p.purchaseID " +
            "<where>" +
            "1=1 " +
            "<if test='warehouseid!=null'>" +
            "and warehouseID =#{warehouseid}" +
            "</if>" +
            "<if test='sku!=null'>" +
            "and sku like  CONCAT('%',#{sku},'%') " +
            "</if>" +
            "<if test='purchaseNum!=null'>" +
            "and purchaseNum like  CONCAT('%',#{purchaseNum},'%') " +
            "</if>" +
            "<if test='purchaseStatus!=null'>" +
            "and purchaseStatus =#{purchaseStatus} " +
            "</if>" +
            "<if test='financeStatus!=null'>" +
            "and financeStatus =#{financeStatus} " +
            "</if>" +
            "<if test='warehouseStatus!=null'>" +
            "and warehouseStatus =#{warehouseStatus} " +
            "</if>" +
            "<if test='cnWarehouseInStatus!=null'>" +
            "and cnWarehouseInStatus =#{cnWarehouseInStatus} " +
            "</if>" +
            "<if test='cnWarehouseOutStatus!=null'>" +
            "and cnWarehouseOutStatus =#{cnWarehouseOutStatus} " +
            "</if>" +
            "<if test='startday!=null'>" +
            "and p.createTime between #{startday} and #{endday} " +
            "</if>" +
            "<if test='specialStatus!=null'>" +
            " and specialStatus=#{specialStatus} " +
            "</if>" +
            "<if test='flag!=null'>" +
            "and financeStatus>=3" +
            "</if>" +
            "</where>" +
            "</script>")
    Integer getCount(@Param("warehouseid") Long warehouseid, @Param("sku") String sku, @Param("purchaseNum") String purchaseNum, @Param("purchaseStatus") Integer purchaseStatus, @Param("financeStatus") Integer financeStatus, @Param("warehouseStatus") Integer warehouseStatus, @Param("cnWarehouseInStatus") Integer cnWarehouseInStatus, @Param("cnWarehouseOutStatus") Integer cnWarehouseOutStatus, @Param("startday") String startday, @Param("endday") String endday, @Param("flag") Integer flag, @Param("specialStatus") Integer specialStatus);

    @Select("<script>" +
            "select distinct p.* from purchase p left join purchase_sku ps on ps.purchaseID=p.purchaseID" +
            "<where>" +
            "1=1 " +
            "<if test='warehouseid!=null'>" +
            "and warehouseID =#{warehouseid}" +
            "</if>" +
            "<if test='sku!=null'>" +
            "and sku like  CONCAT('%',#{sku},'%') " +
            "</if>" +
            "<if test='purchaseNum!=null'>" +
            "and purchaseNum like  CONCAT('%',#{purchaseNum},'%') " +
            "</if>" +
            "<if test='purchaseStatus!=null'>" +
            "and purchaseStatus =#{purchaseStatus} " +
            "</if>" +
            "<if test='financeStatus!=null'>" +
            "and financeStatus =#{financeStatus} " +
            "</if>" +
            "<if test='warehouseStatus!=null'>" +
            "and warehouseStatus =#{warehouseStatus} " +
            "</if>" +
            "<if test='cnWarehouseInStatus!=null'>" +
            "and cnWarehouseInStatus =#{cnWarehouseInStatus} " +
            "</if>" +
            "<if test='cnWarehouseOutStatus!=null'>" +
            "and cnWarehouseOutStatus =#{cnWarehouseOutStatus} " +
            "</if>" +
            "<if test='startday!=null'>" +
            "and p.createTime between #{startday} and #{endday} " +
            "</if>" +
            "<if test='flag!=null'>" +
            "and financeStatus>=3" +
            "</if>" +
            "<if test='specialStatus!=null'>" +
            " and specialStatus=#{specialStatus}" +
            "</if>" +
            "</where>" +
            "order by p.createTime DESC " +
            "</script>")
    List<Purchase> queryAllPurchase(@Param("warehouseid") Long warehouseid, @Param("sku") String sku, @Param("purchaseNum") String purchaseNum, @Param("purchaseStatus") Integer purchaseStatus, @Param("financeStatus") Integer financeStatus, @Param("warehouseStatus") Integer warehouseStatus, @Param("cnWarehouseInStatus") Integer cnWarehouseInStatus, @Param("cnWarehouseOutStatus") Integer cnWarehouseOutStatus, @Param("startday") String startday, @Param("endday") String endday, @Param("flag") Integer flag, @Param("specialStatus") Integer specialStatus);


}