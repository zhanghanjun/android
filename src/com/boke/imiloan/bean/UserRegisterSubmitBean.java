package com.boke.imiloan.bean;

/**
 * Created by Administrator on 2017/3/14.
 */

public class UserRegisterSubmitBean {
    /**
     * data : null
     * errorCode : 6
     * status : 0
     * message : 验证码不正确或已过期,请重新获取
     */

    private Object data;
    private String errorCode;
    private int status;
    private String message;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
