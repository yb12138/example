package com.heeexy.example.model;


import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class ResponseParam {
    private int code;
    private String message;
    private List<JSONObject> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<JSONObject> getData() {
        return data;
    }

    public void setData(List<JSONObject> data) {
        this.data = data;
    }
}
