package com.dh.taobao.constant;


/**
 * 失败响应结果
 *
 * @author zhouliang
 * @date 2020/3/30 15:05
 */
public class ErrorResponseData extends ResponseData {

    /**
     * 异常的具体类名称
     */
    private String exceptionClazz;

    ErrorResponseData(String message) {
        super(false, DEFAULT_ERROR_CODE, message, null);
    }

    public ErrorResponseData(Integer code, String message) {
        super(false, code, message, null);
    }

    ErrorResponseData(Integer code, String message, Object object) {
        super(false, code, message, object);
    }

    public String getExceptionClazz() {
        return exceptionClazz;
    }

    public void setExceptionClazz(String exceptionClazz) {
        this.exceptionClazz = exceptionClazz;
    }
}
