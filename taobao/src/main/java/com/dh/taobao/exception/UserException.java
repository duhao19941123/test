package com.dh.taobao.exception;


import com.dh.taobao.constant.CommonException;

/**
 * @author DH
 */

public enum UserException implements CommonException {


    NOT_USER( 1, "用户不存在"),
    ERR_PWD( 2, "密码错误"),
    ;
    private final Integer code;

    private final String message;

    UserException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
