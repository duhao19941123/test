package com.dh.taobao.constant;

/**
 * 成功响应结果
 *
 * @author zhouliang
 * @date 2020/3/30 15:04
 */
public class SuccessResponseData extends ResponseData {

    public SuccessResponseData() {
        super(true, DEFAULT_SUCCESS_CODE, DEFAULT_SUCCESS_MSG, null);
    }

    public SuccessResponseData(Object object) {
        super(true, DEFAULT_SUCCESS_CODE, DEFAULT_SUCCESS_MSG, object);
    }

    public SuccessResponseData(Integer code, String message, Object object) {
        super(true, code, message, object);
    }
}
