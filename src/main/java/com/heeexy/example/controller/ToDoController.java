package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.TodolistMapper;
import com.heeexy.example.model.Todolist;
import com.heeexy.example.model.TodolistExample;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.constants.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/todo")
public class ToDoController {
    @Autowired
    TodolistMapper todolistMapper;

    @GetMapping("/list")
    public JSONObject list(@RequestParam Integer userID) {
        TodolistExample example = new TodolistExample();
        example.createCriteria().andUseridEqualTo(userID);
        List<Todolist> todolists = todolistMapper.selectByExample(example);
        return CommonUtil.successJson(todolists);
    }

    @PostMapping("/update")
    public JSONObject update(@RequestBody Todolist todo) {
        todolistMapper.updateByPrimaryKeySelective(todo);
        return CommonUtil.successJson();
    }

    @GetMapping("/delete")
    public JSONObject delete(@RequestParam Integer todoid) {
        todolistMapper.deleteByPrimaryKey(todoid);
        return CommonUtil.successJson();
    }

    @PostMapping("/create")
    public JSONObject create(@RequestBody Todolist todolist) {
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute(Constants.SESSION_USER_INFO);
        Integer userid = userInfo.getIntValue("userId");
        todolist.setUserid(userid);
        todolist.setStatus(0);
        todolist.setCreatetime(new Date());
        todolistMapper.insertSelective(todolist);
        return CommonUtil.successJson();
    }

}
