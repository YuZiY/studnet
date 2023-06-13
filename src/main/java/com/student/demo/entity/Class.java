package com.student.demo.entity;

import lombok.Data;


/**
 * class
 * @author laoxue
 * @since 2023-06-08
 */
 @Data

public class Class {


    /**
     * 班级编号（主键）
     */
    private String id;

    /**
     * 班级名称
     */
    private String clName;

    /**
     * 系别名称
     */
    private String faculty;

    /**
     * 专业名称
     */
    private String professional;

    /**
     * 班级人数
     */
    private Integer number;

    /**
     * 辅导员
     */
    private String counselor;

}
