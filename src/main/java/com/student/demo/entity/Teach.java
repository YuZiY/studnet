package com.student.demo.entity;

import lombok.Data;


/**
 * teach
 * @author laoxue
 * @since 2023-06-08
 */
 @Data

public class Teach {


    /**
     * 授课序号（主键）
     */
    private Integer id;

    /**
     * 课程编号（外键）
     */
    private String cNo;

    /**
     * 教师编号（外键）
     */
    private String tNo;

    /**
     * 学年学期
     */
    private String yearterm;

    /**
     * 周次
     */
    private String cycles;

    /**
     * 节次
     */
    private String festival;

    /**
     * 上课地点
     */
    private String classroom;

}
