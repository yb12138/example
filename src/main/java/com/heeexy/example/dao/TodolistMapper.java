package com.heeexy.example.dao;

import com.heeexy.example.model.Todolist;
import com.heeexy.example.model.TodolistExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TodolistMapper {
    int countByExample(TodolistExample example);

    int deleteByExample(TodolistExample example);

    int deleteByPrimaryKey(Integer todoid);

    int insert(Todolist record);

    int insertSelective(Todolist record);

    List<Todolist> selectByExample(TodolistExample example);

    Todolist selectByPrimaryKey(Integer todoid);

    int updateByExampleSelective(@Param("record") Todolist record, @Param("example") TodolistExample example);

    int updateByExample(@Param("record") Todolist record, @Param("example") TodolistExample example);

    int updateByPrimaryKeySelective(Todolist record);

    int updateByPrimaryKey(Todolist record);
}