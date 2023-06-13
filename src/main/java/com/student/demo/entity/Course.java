package com.student.demo.entity;

import lombok.Data;


/**
 * course
 * @author laoxue
 * @since 2023-06-08
 */
 @Data

public class Course {


    /**
     * 课程编号（主键）
     */
    private String id;

    /**
     * 课程名称
     */
    private String cName;

    /**
     * 课程类型
     */
    private String type;

    /**
     * 学分
     */
    private String unit;

    /**
     * 学时
     */
    private String hours;

    /**
     * 考核方式
     */
    private String testmode;

}
