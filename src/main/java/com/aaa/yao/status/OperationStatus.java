package com.aaa.yao.status;

/**
 * Package: com.aaa.yao.status
 * Description： TODO
 * Author: yao
 * Date: Created in 2020/7/9 15:15
 * Copyright: Copyright (c) 2017
 * Version: 0.0.1
 */
public enum OperationStatus {
    SUCCESS("1","操作成功"),
    FAILED("2","操作失败"),
    DELETE_OPERATION("3","删除操作"),
    UPDATE_OPERATION("4", "修改操作"),
    INSERT_OPERATION("5", "新增操作"),
    ZUUL_FILTER_SUCCESS("6", "路由过滤成功"),
    ZUUL_FILTER_FAILED("7", "路由过滤失败"),
    ZUUL_FILTER_TOKEN_SUCCESS("8", "token值存在"),
    ZUUL_FILTER_TOKEN_FAILED("9", "token值不存在"),
    REQUEST_IS_NULL("10", "request对象为null");
    OperationStatus(String code,String msg){
        this.code = code;
        this.msg = msg;
    }
    private  String code;
    private  String msg;

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
