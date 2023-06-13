package com.student.demo.entity;

import lombok.Data;


/**
 * teacher
 * @author laoxue
 * @since 2023-06-08
 */
 @Data

public class Teacher {


    /**
     * 教师号（主键）
     */
    private String id;

    /**
     * 教师密码
     */
    private String tPwd;

    /**
     * 教师姓名
     */
    private String tName;

    /**
     * 教师性别
     */
    private String tSex;

    /**
     * E-mail
     */
    private String email;

    /**
     * 联系电话
     */
    private String tTelephone;

    /**
     * 备注
     */
    private String tRemarks;

}
