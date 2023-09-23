package com.romaneekang.service.impl;

import com.romaneekang.dto.PageDto;
import com.romaneekang.mapper.UserMapper;
import com.romaneekang.service.UserService;
import com.romaneekang.vo.PageVo;
import com.romaneekang.vo.UserVo;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
class UserServiceImplTest {
    @Resource
    private UserService userService;
    @Test
    void queryUserByPage() {
        PageDto pageDto = new PageDto();
        pageDto.setPageNo(1);
        pageDto.setPageSize(2);
        PageVo<UserVo> pageVo = userService.queryUserByPage(pageDto);
        log.info("{}",pageVo);
    }
}