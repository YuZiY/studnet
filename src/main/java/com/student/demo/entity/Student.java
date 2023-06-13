package com.student.demo.entity;

import lombok.Data;


/**
 * student
 * @author laoxue
 * @since 2023-06-08
 */
 @Data

public class Student {


    /**
     * 学生学号（主键）
     */
    private String id;

    /**
     * 学生密码
     */
    private String sPwd;

    /**
     * 班级编号（外键）
     */
    private String clNo;

    /**
     * 姓名
     */
    private String sName;

    /**
     * 性别
     */
    private String sSex;

    /**
     * 居民身份证
     */
    private String cards;

    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 民族
     */
    private String nation;

    /**
     * 籍贯
     */
    private String birthplace;

    /**
     * 政治面貌
     */
    private String political;

    /**
     * 家庭地址
     */
    private String address;

    /**
     * 邮政编码
     */
    private String code;

    /**
     * 固定电话
     */
    private String sTelephone;

    /**
     * 入学年份
     */
    private String sYear;

    /**
     * 宿舍号
     */
    private String dormitory;

    /**
     * 工作城市
     */
    private String city;

    /**
     * 公司名称
     */
    private String company;

    /**
     * 工资
     */
    private Float pay;

    /**
     * 是否毕业生
     */
    private String graduate;

    /**
     * 备注
     */
    private String sRemarks;

}
