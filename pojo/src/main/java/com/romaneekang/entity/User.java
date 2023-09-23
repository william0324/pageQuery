package com.romaneekang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.romaneekang.enums.UserStatus;
import com.romaneekang.pojo.UserInfo;
import lombok.Data;

/**
 * 用户表
 * {@code @TableName} user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 用户id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;
    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;
    /**
     * 注册手机号
     */
    @TableField(value = "phone")
    private String phone;
    /**
     * 详细信息
     */
    @TableField(value = "info",typeHandler = JacksonTypeHandler.class)
    private UserInfo info;
    /**
     * 使用状态（1正常 2冻结）
     */
    @TableField(value = "status")
    private UserStatus status;
    /**
     * 账户余额
     */
    @TableField(value = "balance")
    private Integer balance;
    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}