package com.robert.ms.dto;

public class BasePageDto extends BaseModel {
    private int pageNum = 1;// 页码
    private int pageSize = 10;// 页容量

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
