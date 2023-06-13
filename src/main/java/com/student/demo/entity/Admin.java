package com.student.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import lombok.Data;


/**
 * admin
 * @author laoxue
 * @since 2023-06-08
 */
 @Data

public class Admin {


    /**
     * 用户id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     * @mock admin01
     */
    private String adminName;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 真实姓名
     */
    private String aName;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 联系电话
     */
    private String telephone;

}
