package com.aaa.yao.status;

/**
 * Package: com.aaa.yao.status
 * Description： TODO
 * Author: yao
 * Date: Created in 2020/7/8 16:07
 * Copyright: Copyright (c) 2017
 * Version: 0.0.1
 */
public enum LoginStatus {
    LOGIN_SUCCESS("200","登录成功"),
    LOGIN_FAILED("400","登录失败,系统异常"),
    USER_EXIST("201","用户已经存在"),
    USER_NOT_EXIST("401","用户不存在"),
    PASSWORD_WRONG("402","密码错误"),
    LOGOUT_WEONG("405","用户退出异常");
    LoginStatus(String code,String msg){
    this.code = code;
        this.msg = msg;
}
    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
