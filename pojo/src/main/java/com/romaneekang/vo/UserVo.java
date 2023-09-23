package com.romaneekang.vo;

import com.romaneekang.enums.UserStatus;
import com.romaneekang.pojo.UserInfo;
import lombok.Data;


@Data
public class UserVo {
    /**
     * 用户id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 详细信息
     */
    private UserInfo info;

    /**
     * 使用状态（1正常 2冻结）
     */
    private UserStatus status;

    /**
     * 账户余额
     */
    private Integer balance;
}
