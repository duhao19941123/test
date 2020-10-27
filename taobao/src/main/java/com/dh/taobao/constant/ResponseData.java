package com.dh.taobao.constant;

/**
 * 响应结果数据
 *
 * @author zhouliang
 * @date 2020/3/30 15:04
 */
public class ResponseData {

    public static final String DEFAULT_SUCCESS_MSG = "操作成功";

    public static final String DEFAULT_ERROR_msg = "网络异常";

    public static final Integer DEFAULT_SUCCESS_CODE = 200;

    public static final Integer DEFAULT_ERROR_CODE = 500;

    /**
     * 请求是否成功
     */
    private Boolean success;

    /**
     * 响应状态码
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String msg;

    /**
     * 响应对象
     */
    private Object data;

    public ResponseData() {
    }

    public ResponseData(Boolean success, Integer code, String msg, Object data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static SuccessResponseData success() {
        return new SuccessResponseData();
    }

    public static SuccessResponseData success(Object object) {
        return new SuccessResponseData(object);
    }

    public static SuccessResponseData success(Integer code, String msg, Object object) {
        return new SuccessResponseData(code, msg, object);
    }

    public static ErrorResponseData error(String msg) {
        return new ErrorResponseData(msg);
    }

    public static ErrorResponseData error(Integer code, String msg) {
        return new ErrorResponseData(code, msg);
    }

    public static ErrorResponseData error(Integer code, String msg, Object object) {
        return new ErrorResponseData(code, msg, object);
    }


    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
