package com.student.demo.controller;

import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

import com.student.demo.service.ICourseService;
import com.student.demo.entity.Course;


/**
 * 课程信息表
 * @author laoxue
 * @since 2023-06-08
 */

@CrossOrigin
@RestController
@RequestMapping("/course")

public class CourseController {


    @Resource
    private ICourseService courseService;
    /**
     * 查询所有课程信息表
     * 
     * @apiNote 查询所有课程信息表
     * @param course
     * @return
     */
    @PostMapping("/list")
    public List<Course> getCourseList() {
        return courseService.selectList();
    }
    /**
     * 通过id查询课程信息表
     * 
     * @apiNote 通过id查询课程信息表
     * @param admin
     * @return
     */
    @PostMapping("/id")
    public Course getCourseById(@RequestBody Course course) {
        return courseService.selectById(course);
    }
    /**
     * 通过id删除课程信息表
     * 
     * @apiNote 通过id删除课程信息表
     * @param admin
     * @return
     */
    @PostMapping("/delete")
    public int deleteCourseById(@RequestBody Course course) {
        return courseService.deleteById(course);
    }
    /**
     * 添加课程信息表
     * 
     * @apiNote 添加课程信息表
     * @param admin
     * @return
     */
    @PostMapping("/add")
    public int addCourse(@RequestBody Course course) {
        return courseService.insert(course);
    }
    /**
     * 修改课程信息表
     * 
     * @apiNote 修改课程信息表
     * @param admin
     * @return
     */
    @PostMapping("/update")
    public int updateCourse(@RequestBody Course course) {
        return courseService.updateById(course);
    }
    /**
     * 通过名字查询课程信息表
     * 
     * @apiNote 通过名字查询课程信息表
     * @param admin
     * @return
     */
    @PostMapping("/name")
    public List<Course> getCourseByName(@RequestBody Course course) {
        return courseService.selectByName(course);
    }
}
