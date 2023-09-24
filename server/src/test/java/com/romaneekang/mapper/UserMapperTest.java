package com.romaneekang.mapper;

import com.romaneekang.dto.PageDto;
import com.romaneekang.entity.User;
import com.romaneekang.enums.UserStatus;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
class UserMapperTest {
    @Resource
    private UserMapper userMapper;
    @Test
    void findAllUser() {

    }

    @Test
    void queryUserByPage() {

    }


}