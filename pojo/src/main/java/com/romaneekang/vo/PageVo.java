package com.romaneekang.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageVo<T> {
    private Integer total;  //总行数
    private Integer pages;  //总页数
    private List<T> list;   //返回数据
}
