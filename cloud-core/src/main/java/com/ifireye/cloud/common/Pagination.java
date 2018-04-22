package com.ifireye.cloud.common;

import lombok.Data;

@Data
public class Pagination {
    private long pageIndex;
    private long totalPage;
    private long resultSize;
    private long pageSize;

    public Pagination() {
    }

    public Pagination(long pageIndex, long pageSize, long totalPage, long resultSize) {
        this.pageIndex = pageIndex;
        this.totalPage = totalPage;
        this.resultSize = resultSize;
        this.pageSize = pageSize;
    }

}
