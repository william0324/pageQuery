package com.romaneekang.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.romaneekang.dto.PageDto;
import com.romaneekang.entity.User;
import com.romaneekang.mapper.UserMapper;
import com.romaneekang.service.UserService;
import com.romaneekang.vo.PageVo;
import com.romaneekang.vo.UserVo;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
    @Override
    public PageVo<UserVo> queryUserByPage(PageDto pageDto) {
        //1. 构建条件
        //1.1分页条件
        Page<User> page = Page.of(pageDto.getPageNo(), pageDto.getPageSize());
        //1.2排序条件
        if (pageDto.getSortBy() != null) {
            page.addOrder(new OrderItem(pageDto.getSortBy(),pageDto.getIsAsc()));
        } else {
            //默认按照更新时间排序
            page.addOrder(new OrderItem("update_time",false));
        }
        //2.查询
        page(page);
        //3.数据非空校验
        List<User> users = page.getRecords();
        if (users == null || users.size() <= 0) {
            //无数据，返回空结果
            return new PageVo<>((int) page.getTotal(), (int) page.getPages(), Collections.emptyList());
        }
        //4.有数据，转换
        List<UserVo> userVoList = BeanUtil.copyToList(users, UserVo.class);
        //5.封装返回
        return new PageVo<>((int) page.getTotal(), (int) page.getPages(),userVoList);
    }
}
