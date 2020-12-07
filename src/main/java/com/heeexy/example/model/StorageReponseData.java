package com.heeexy.example.model;


import java.util.List;
import java.util.Map;


public class StorageReponseData {
    private Map<String, String> page;
    private List<Map<String, String>> list;

    public Map<String, String> getPage() {
        return page;
    }

    public void setPage(Map<String, String> page) {
        this.page = page;
    }

    public List<Map<String, String>> getList() {
        return list;
    }

    public void setList(List<Map<String, String>> list) {
        this.list = list;
    }
}
