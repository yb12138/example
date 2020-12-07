package com.heeexy.example.util.constants;

/**
 * @author: hxy
 * @description: 通用常量类, 单个业务的常量请单开一个类, 方便常量的分类管理
 * @date: 2017/10/24 10:15
 */
public class Constants {

    public static final String SUCCESS_CODE = "100";
    public static final String SUCCESS_MSG = "请求成功";

    /**
     * session中存放用户信息的key值
     */
    public static final String SESSION_USER_INFO = "userInfo";
    public static final String SESSION_USER_PERMISSION = "userPermission";

    public static final String warninfo_new_type = "新品首次补货";
    public static final String warninfo_mother_type = "母代码补货";
    public static final String warninfo_twice_type = "新品二次补货";
    public static final String warninfo_custom = "常规补货";
}
