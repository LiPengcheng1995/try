package com.gateway.common.web.domain;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author: lipengcheng3
 * @create: 2018-09-04 16:03
 * @description:
 **/

public class Response<T> {

    @ApiModelProperty("状态码")
    private Integer code;

    @ApiModelProperty("描述信息")
    private String message;

    @ApiModelProperty("返回数据")
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
