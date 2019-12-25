package com.yfshi.crm.query;

public class QueryObject {
    private Integer page;   //当前页
    private Integer rows;   //每页行数

    public Integer getStart(){
        return (this.page-1)*rows;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
