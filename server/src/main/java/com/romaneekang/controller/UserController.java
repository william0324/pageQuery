package com.romaneekang.controller;

import com.romaneekang.dto.PageDto;
import com.romaneekang.result.Result;
import com.romaneekang.service.UserService;
import com.romaneekang.vo.PageVo;
import com.romaneekang.vo.UserVo;
//import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping("/query")
    public Result<PageVo<UserVo>> queryUserByPage(@RequestBody PageDto pageDto) {
        PageVo<UserVo> pageVo = userService.queryUserByPage(pageDto);
        return Result.ok(pageVo);
    }


}
