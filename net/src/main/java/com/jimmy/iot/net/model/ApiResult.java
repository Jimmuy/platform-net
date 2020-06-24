

package com.jimmy.iot.net.model;

/**
 * <p>描述：提供的默认的标注返回api</p>
 */
public class ApiResult<T> {
    public static final int DEFAULT_SUCCESS_CODE = 200;
    private int code;
    private String msg;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 需要根据实际类型进行返回
     */
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isOk() {
        return code == DEFAULT_SUCCESS_CODE;
    }

    @Override
    public String toString() {
        return "ApiResult{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", baseData=" + data +
                '}';
    }
}
