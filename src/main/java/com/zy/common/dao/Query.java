package com.zy.common.dao;

import java.io.Serializable;

/**
 * Created by Magic on 2017/4/3.
 */
public class Query<T> extends QueryBase implements Serializable {
    private static final long serialVersionUID = -8975366038049650252L;
    //查询传入参数
    private T Data;
    //排序字段
    private String sortField;
    //排序类型   desc  asc
    private String sortType;

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }
}
