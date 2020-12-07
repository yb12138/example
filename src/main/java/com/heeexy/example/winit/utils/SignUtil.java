package com.heeexy.example.winit.utils;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.heeexy.example.winit.model.RequestMsg;
import org.apache.commons.lang.StringUtils;

public class SignUtil {

    /**
     * 签名具体算法排序实现
     *
     * @param requestMsg 请求对象
     * @param token      加密秘钥：用户token或者client_secret
     *                   需要特别注意：系统参数language和client_id是后续加入，没有参与签名算法
     * @return
     */
    private static String buildJsonStr(RequestMsg requestMsg, String token) {
        StringBuffer buf = new StringBuffer();
        buf.append(token);
        buf.append("action").append(requestMsg.getAction());
        buf.append("app_key").append(requestMsg.getApp_key());
        String data = "";
        if (requestMsg.getData() != null && StringUtils.isNotBlank(requestMsg.getData().toString())) {
            // 此处需要注意com.alibaba.fastjson.JSONObject的默认行为是不显示值为null的键，且默认字段是强制排序的。故如果使用其他JSON工具需要注意这两点，不然会认证不过
            data = JSONObject.toJSONString(requestMsg.getData(), SerializerFeature.MapSortField);
        }
        buf.append("data").append(data);
        buf.append("format").append(requestMsg.getFormat() == null ? "" : requestMsg.getFormat());
        buf.append("platform").append(requestMsg.getPlatform() == null ? "" : requestMsg.getPlatform());
        buf.append("sign_method").append(requestMsg.getSign_method() == null ? "" : requestMsg.getSign_method());
        buf.append("timestamp").append(requestMsg.getTimestamp() == null ? "" : requestMsg.getTimestamp());
        buf.append("version").append(requestMsg.getVersion() == null ? "" : requestMsg.getVersion());
        buf.append(token);
        return buf.toString();
    }

    /**
     * 按字段名字母顺序排列 对参数进行MD5加密取得签名
     *
     * @param requestMsg
     * @param token
     * @return
     */
    public static String getSign(RequestMsg requestMsg, String token, String jsonStr) {
        return MD5Util.getMd5(jsonStr);
    }

    /**
     * 按字段名字母顺序排列 对参数进行MD5加密取得签名
     *
     * @param requestMsg
     * @param token
     * @return
     */
    public static String getSign(RequestMsg requestMsg, String token) {
        return MD5Util.getMd5(buildJsonStr(requestMsg, token));
    }

}
