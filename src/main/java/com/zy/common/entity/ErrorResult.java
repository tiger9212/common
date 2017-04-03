package com.zy.common.entity;

import java.io.Serializable;

/**
 * Created by Magic on 2017/4/1.
 */
public class ErrorResult implements Serializable{
    private static final long serialVersionUID = 7044898652439098168L;
    //错误编码
    private int errorCode;
    //错误名称
    private String errorName;
    //错误信息
    private String errorMessage;

    /**
     * 设置属性信息
     * @param errorCode
     * @param errorName
     * @param errorMessage
     */
    public void setError(int errorCode,String errorName,String errorMessage){
        this.errorCode = errorCode;
        this.errorName = errorName;
        this.errorMessage = errorMessage;
    }
    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorName() {
        return errorName;
    }

    public void setErrorName(String errorName) {
        this.errorName = errorName;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
