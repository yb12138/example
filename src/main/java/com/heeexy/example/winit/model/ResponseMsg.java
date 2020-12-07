package com.heeexy.example.winit.model;


/**
 * 返回报文对象
 *
 * @version <pre>
 * Author	Version		Date		Changes
 * kang.wang 	1.0  		2014-12-30 	Created
 *
 * </pre>
 * @since 1.
 */
public class ResponseMsg {

    /**
     * 返回码
     */
    private String code = "0";
    /**
     * 返回消息
     */
    private String msg = "";
    /**
     * 返回结果集
     */
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
