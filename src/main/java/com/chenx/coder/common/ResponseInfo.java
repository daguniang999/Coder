package com.chenx.coder.common;

import java.io.Serializable;

/**
 * @ClassName ResponseInfo
 * @Description 返回结构
 * @Author daguniang
 * @Date 2023/8/29 06:48
 **/
public class ResponseInfo<T> implements Serializable {

    private Integer code;

    private String msg;

    private T data;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public static ResponseInfo ok() {
        return ok(null, MessageConstants.OK);
    }

    public static <T> ResponseInfo ok(T data) {
        return ok(data, MessageConstants.OK);
    }

    public static <T> ResponseInfo ok(T data, String msg) {
        return info(CommonConstants.HTTP_OK, data, msg);
    }

    public static ResponseInfo fail() {
        return fail(null, MessageConstants.FAIL);
    }

    public static <T> ResponseInfo fail(T data) {
        return fail(data, MessageConstants.FAIL);
    }

    public static <T> ResponseInfo fail(T data, String msg) {
        return info(CommonConstants.HTTP_FAIL, data, msg);
    }

    private static <T> ResponseInfo info(Integer code, T data, String msg) {
        ResponseInfo<T> responseInfo = new ResponseInfo<>();
        responseInfo.code = code;
        responseInfo.data = data;
        responseInfo.msg = msg;
        return responseInfo;
    }
}
