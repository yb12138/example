package com.heeexy.example.winit.model;

/**
 * 请求报文对象
 *
 * @version <pre>
 * Author   Version     Date        Changes
 * kang.wang    1.0         2014-12-30  Created
 *
 * </pre>
 * @since 1.
 */
public class RequestMsg {

    /**
     * 请求方法
     */
    private String action;
    /**
     * 用户名
     */
    private String app_key;
    /**
     * 客户端ID，由注册client时系统分配，标识client身份，必填
     */
    private String client_id;

    private String client_sign;
    /**
     * 时间
     */
    private String timestamp;
    /**
     * 版本号
     */
    private String version = "1.0";
    /**
     * 签名
     */
    private String sign;
    /**
     * 签名方式
     */
    private String sign_method = "md5";
    /**
     * 返回格式
     */
    private String format = "json";
    /**
     * 平台
     */
    private String platform;
    /**
     * 语言
     */
    private String language = "zh_CN";
    /**
     * 业务参数 json string
     */
    private Object data;

    /**
     * 分销平台专用
     */
    /**
     * 分销平台用户
     **/
    private String auz_app_key;
    /**
     * 分销平台签名
     **/
    private String auz_sign;


    public String getAuz_app_key() {
        return auz_app_key;
    }

    public void setAuz_app_key(String auz_app_key) {
        this.auz_app_key = auz_app_key;
    }

    public String getAuz_sign() {
        return auz_sign;
    }

    public void setAuz_sign(String auz_sign) {
        this.auz_sign = auz_sign;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getApp_key() {
        return app_key;
    }

    public void setApp_key(String app_key) {
        this.app_key = app_key;
    }


    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_sign() {
        return client_sign;
    }

    public void setClient_sign(String client_sign) {
        this.client_sign = client_sign;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSign_method() {
        return sign_method;
    }

    public void setSign_method(String sign_method) {
        this.sign_method = sign_method;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "RequestMsg{" +
                "action='" + action + '\'' +
                ", app_key='" + app_key + '\'' +
                ", client_id='" + client_id + '\'' +
                ", client_sign='" + client_sign + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", version='" + version + '\'' +
                ", sign='" + sign + '\'' +
                ", sign_method='" + sign_method + '\'' +
                ", format='" + format + '\'' +
                ", platform='" + platform + '\'' +
                ", language='" + language + '\'' +
                ", data=" + data +
                ", auz_app_key='" + auz_app_key + '\'' +
                ", auz_sign='" + auz_sign + '\'' +
                '}';
    }
}
