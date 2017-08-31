package com.outab.common.result;

import java.io.Serializable;

/**
 * Created by Magic on 2017/4/1.
 */
public class Result<T> extends ErrorResult implements Serializable{
    private static final long serialVersionUID = -376533656010981090L;
    private boolean success = true;
    private T data;

    public void setError(int errorCode,String errorName,String errorMessage){
        super.setError(errorCode,errorName,errorMessage);
        this.success = false;
    }
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
