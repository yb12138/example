package com.heeexy.example.service;


import com.alibaba.fastjson.JSONObject;

public interface TrackService {

    void updateTrack();

    JSONObject searchTracking(String shipTrackingID);
}
