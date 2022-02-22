package com.zzx.utils;

/**
 * @Author zzx
 * @Date 2021/8/17 16:24
 **/
public class ResultObj {
    private Integer code;
    private String msg;

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

    public ResultObj(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultObj(Integer code) {

        this.code = code;
    }

    public ResultObj() {

    }
}

