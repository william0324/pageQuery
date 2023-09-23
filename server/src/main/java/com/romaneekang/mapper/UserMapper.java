package com.romaneekang.mapper;

import com.romaneekang.dto.PageDto;
import com.romaneekang.entity.User;

import java.util.List;

/**
* @author William
* {@code @description} 针对表【user(用户表)】的数据库操作Mapper
* {@code @createDate} 2023-09-23 15:32:52
* {@code @Entity} com.romaneekang.entity.User
 */
public interface UserMapper {
    /**
     * 查询用户总行数
     * @return 用户总行数
     */
    public int findAllUser();

    /**
     * 分页查询用户信息
     * @param pageDto 前端传入的参数
     * @return 当前页面的数据库中的用户信息
     */
    public List<User> queryUserByPage(PageDto pageDto);

}




