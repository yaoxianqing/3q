package com.aaa.yao.base;
import com.sun.xml.internal.bind.v2.TODO;

import static com.aaa.yao.status.LoginStatus.*;
import static com.aaa.yao.status.OperationStatus.*;


/**
 * Package: com.aaa.yao.base
 * Description： TODO
 * Author: yao
 * Date: Created in 2020/7/8 16:15
 * Copyright: Copyright (c) 2017
 * Version: 0.0.1
 */
public class BaseController {
    // TODO 登录成功 使用系统信息
    protected ResultData loginSuccess(){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        return  resultData;
    }
    // TODO 登录成功 自定义返回信息
    protected  ResultData loginSuccess(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        return  resultData;
    }
    // TODO 登录成功，返回数据消息，使用系统消息
    protected  ResultData loginSuccess(Object data){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        resultData.setData(data);
        return  resultData;
    }
    // TODO 登录成功 返回数据信息，自定义消息
    protected ResultData LoginSuccess(String msg,Object data){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        resultData.setData(data);
        return  resultData;
    }
    // TODO 登录失败，使用系统消息
    protected  ResultData LoginFailed(){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_FAILED.getCode());
        resultData.setMsg(LOGIN_FAILED.getMsg());
        return  resultData;
    }
    // TODO 登录失败，使用系统消息,详细解释说明
    protected  ResultData loginFailed(String detail){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_FAILED.getCode());
        resultData.setMsg(LOGIN_FAILED.getMsg());
        resultData.setDetail(detail);
        return  resultData;
    }
    // TODO 操作成功，返回系统消息
    protected  ResultData operationSuccess(){
        ResultData resultData = new ResultData();
        resultData.setCode(SUCCESS.getCode());
        resultData.setMsg(SUCCESS.getMsg());
        return  resultData;
    }
    // TODO 操作成功，返回自定义消息
    protected  ResultData operationSuccess(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(SUCCESS.getCode());
        resultData.setMsg(msg);
        return  resultData;
    }
    // TODO 操作成功，返回数据消息，使用系统消息
    protected  ResultData operationSuccess(Object data){
        ResultData resultData = new ResultData();
        resultData.setCode(SUCCESS.getCode());
        resultData.setMsg(SUCCESS.getMsg());
        resultData.setData(data);
        return resultData;
    }
    // TODO 操作成功，返回数据消息，使用自定义消息
    protected  ResultData operationSuccess(String msg,Object data){
        ResultData resultData = new ResultData();
        resultData.setCode(SUCCESS.getCode());
        resultData.setMsg(msg);
        resultData.setData(data);
        return  resultData;

    }
    // TODO 操作失败，返回系统消息
    protected  ResultData operationFailed(){
        ResultData resultData = new ResultData();
        resultData.setCode(FAILED.getCode());
        resultData.setMsg(FAILED.getMsg());
        return  resultData;
    }

    // TODO 操作失败，返回数据，使用系统消息
    protected ResultData operationFailed(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(FAILED.getCode());
        resultData.setMsg(msg);
        return  resultData;
    }

    //TODO

}
