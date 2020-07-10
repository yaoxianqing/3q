package com.aaa.yao.base;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Package: com.aaa.yao.base
 * Description： TODO
 * Author: yao
 * Date: Created in 2020/7/8 16:28
 * Copyright: Copyright (c) 2017
 * Version: 0.0.1
 */
@Data
@Accessors(chain = true)
public class ResultData<T>implements Serializable {
    private String code;
    private String msg;
    private String detail;
    private  T data;
}
