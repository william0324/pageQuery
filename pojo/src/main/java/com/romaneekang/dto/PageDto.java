package com.romaneekang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 前端提交的查询参数
 */
@Data
public class PageDto {
    //页码
    @JsonProperty("pageNo")
    private Integer pageNo;
    //每页数据条数
    @JsonProperty("pageSize")
    private Integer pageSize;
    //排序字段
    @JsonProperty("sortBy")
    private String sortBy;
    //是否升序
    @JsonProperty("isAsc")
    private Boolean isAsc;

//    /**
//     * 得到数据库中的起始下标
//     * @return 起始下标。下标从0开始
//     */
//    public int getStartIndex() {
//        return (pageNo - 1) * pageSize;
//    }
}
