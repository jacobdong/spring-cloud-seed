package com.ifireye.cloud.common;

import lombok.Data;

import java.util.List;

@Data
public class PaginationData<T> {
    private Pagination pagination;
    private List<T> paginationData;
}
