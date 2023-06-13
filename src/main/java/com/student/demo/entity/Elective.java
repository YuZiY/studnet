package com.student.demo.entity;

import lombok.Data;


/**
 * elective
 * @author laoxue
 * @since 2023-06-08
 */
 @Data

public class Elective {


    /**
     * 选修序号（主键）
     */
    private Integer id;

    /**
     * 学号（外键）
     */
    private String sNo;

    /**
     * 授课序号（外键）
     */
    private Integer tId;

    /**
     * 考试轮次
     */
    private String round;

    /**
     * 考试时间
     */
    private String tEsttime;

    /**
     * 考试地点
     */
    private String tEstsite;

    /**
     * 座位号
     */
    private String sEat;

    /**
     * 平时成绩
     */
    private Integer uScore;

    /**
     * 考试成绩
     */
    private Integer eScore;

    /**
     * 综合成绩
     */
    private Integer tScore;

    /**
     * 备注
     */
    private String eRemarks;

}
