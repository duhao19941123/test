package com.dh.taobao.constant;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DH
 * 系统异常信息
 */
public enum SYS {
    E00001("未登录"),
    ERROR001("系统异常"),
    SUCCESS("操作成功");

    private String value;
    public Map<String, Object> Msg = new HashMap<String, Object>();
    private SYS(String value) {
        this.value = value;
        this.Msg = msgMap();
    }

    public String getValue() {
        return value;
    }

    public Map<String, Object> msgMap() {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("code", this);
        resultMap.put("msg", value);
        resultMap.put("data", null);
        return resultMap;
    }

    public Map<String, Object> msgMap(Object data) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("code", this);
        resultMap.put("msg", value);
        resultMap.put("data" , data);
        return resultMap;
    }
}
