package com.romaneekang.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.romaneekang.dto.PageDto;
import com.romaneekang.entity.User;
import com.romaneekang.mapper.UserMapper;
import com.romaneekang.service.UserService;
import com.romaneekang.vo.PageVo;
import com.romaneekang.vo.UserVo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public PageVo<UserVo> queryUserByPage(PageDto pageDto) {
        //分页查询得到数据库中的当前页面user实体列表
        List<User> userList = userMapper.queryUserByPage(pageDto);
        //利用hutool工具类将entity列表转换为vo列表
        List<UserVo> userVoList = BeanUtil.copyToList(userList, UserVo.class);
        //得到总行数
        int totalNum = userMapper.findAllUser();
        //得到总页数
        int pages = (totalNum % pageDto.getPageSize()) == 0?(totalNum/ pageDto.getPageSize()) : (totalNum/ pageDto.getPageSize() +1 );

        return new PageVo<>(totalNum,pages,userVoList);
    }
}
