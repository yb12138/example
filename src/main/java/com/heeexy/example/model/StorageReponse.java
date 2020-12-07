package com.heeexy.example.model;


public class StorageReponse {
    private int code;
    private String msg;
    public StorageReponseData data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public StorageReponseData getData() {
        return data;
    }

    public void setData(StorageReponseData data) {
        this.data = data;
    }
}
