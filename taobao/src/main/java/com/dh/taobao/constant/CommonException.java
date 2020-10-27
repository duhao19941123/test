package com.dh.taobao.constant;

/**
 * @author DH
 */
public interface CommonException {
    /**
     * 获取异常的状态码
     * @return
     */
    Integer getCode();

    /**
     *获取异常的提示信息
     * @return
     */
    String getMessage();

}
