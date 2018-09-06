package com.gateway.common.web.domain;

/**
 * @author: lipengcheng3
 * @create: 2018-09-06 11:22
 * @description: 分页对象
 **/
public class Paging {

    private Integer page = 1;

    private Integer pageSize = 10;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        if (page != null) {
            this.page = page;
        }
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if (pageSize != null) {
            this.pageSize = pageSize;
        }
    }

    @Override
    public String toString() {
        return "Paging{" +
                "page=" + page +
                ", pageSize=" + pageSize +
                '}';
    }
}
