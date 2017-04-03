package com.zy.common.dao;


/**
 * Created by Magic on 2017/4/3.
 */
public class QueryBase {
    //每页大小 -- 提供前段传入
    private int pageSize;
    //当前页页码 -- 提供前段传入
    private int currentPage;
    //总条数 -- 后端计算
    private long total;
    //开始条数-- 后端计算 sql使用
    private int start;
    //结束条数-- 后端计算 sql使用
    private int end;

    public QueryBase(){
        this.pageSize = 20;
        this.currentPage = 1;
        this.start = 0;
        this.end = 20;
    }
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if(pageSize !=null&& pageSize.intValue()>0){
            this.pageSize = pageSize.intValue();
        }
        this.setStartAndEnd();
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        if(currentPage !=null&&currentPage.intValue()>0){
            this.currentPage = currentPage.intValue();
        }
        this.setStartAndEnd();
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
    protected void setStartAndEnd(){
        this.start = (this.getCurrentPage() - 1)*this.getPageSize();
        if(this.start<0){
            this.start = 0;
        }
        this.end = this.start+this.getPageSize();
    }
}
