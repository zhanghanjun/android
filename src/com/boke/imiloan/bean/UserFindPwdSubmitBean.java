package com.boke.imiloan.bean;

/**
 * Created by Administrator on 2017/3/14.
 */

public class UserFindPwdSubmitBean {
    /**
     * data : null
     * errorCode : 0
     * status : 1
     * message : 获取验证码成功
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
