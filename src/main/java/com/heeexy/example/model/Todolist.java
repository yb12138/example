package com.heeexy.example.model;

import java.util.Date;

public class Todolist {
    private Integer todoid;

    private Integer userid;

    private String title;

    private Integer status;

    private Date createtime;

    public Integer getTodoid() {
        return todoid;
    }

    public void setTodoid(Integer todoid) {
        this.todoid = todoid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}