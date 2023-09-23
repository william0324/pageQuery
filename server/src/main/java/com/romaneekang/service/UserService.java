package com.romaneekang.service;

import com.romaneekang.dto.PageDto;
import com.romaneekang.vo.PageVo;
import com.romaneekang.vo.UserVo;

public interface UserService {
    PageVo<UserVo> queryUserByPage(PageDto pageDto);
}
