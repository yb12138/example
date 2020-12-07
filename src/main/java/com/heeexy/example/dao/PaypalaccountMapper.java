package com.heeexy.example.dao;

import com.heeexy.example.model.Afterreason;
import com.heeexy.example.model.Paypalaccount;
import com.heeexy.example.model.PaypalaccountExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface PaypalaccountMapper {
    int countByExample(PaypalaccountExample example);

    int deleteByExample(PaypalaccountExample example);

    int deleteByPrimaryKey(Integer payid);

    int insert(Paypalaccount record);

    int insertSelective(Paypalaccount record);

    List<Paypalaccount> selectByExample(PaypalaccountExample example);

    Paypalaccount selectByPrimaryKey(Integer payid);

    int updateByExampleSelective(@Param("record") Paypalaccount record, @Param("example") PaypalaccountExample example);

    int updateByExample(@Param("record") Paypalaccount record, @Param("example") PaypalaccountExample example);

    int updateByPrimaryKeySelective(Paypalaccount record);

    int updateByPrimaryKey(Paypalaccount record);

    @Select("select * from paypalaccount where payaccount=#{payaccount}")
    Paypalaccount search(@Param("payaccount") String payaccount);
}