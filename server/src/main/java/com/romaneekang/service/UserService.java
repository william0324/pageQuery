package com.romaneekang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.romaneekang.dto.PageDto;
import com.romaneekang.entity.User;
import com.romaneekang.vo.PageVo;
import com.romaneekang.vo.UserVo;


public interface UserService extends IService<User> {
    PageVo<UserVo> queryUserByPage(PageDto pageDto);
}
