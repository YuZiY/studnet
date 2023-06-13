package com.student.demo.controller;

import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

import com.student.demo.service.ITeacherService;
import com.student.demo.entity.Teacher;


/**
 * 教师信息表
 * @author laoxue
 * @since 2023-06-08
 */

@CrossOrigin
@RestController
@RequestMapping("/teacher")

public class TeacherController {


    @Resource
    private ITeacherService teacherService;
    /**
     * 查询所有教师信息表
     * 
     * @apiNote 查询所有教师信息表
     * @param teacher
     * @return
     */
    @PostMapping("/list")
    public List<Teacher> getTeacherList() {
        return teacherService.selectList();
    }
    /**
     * 通过id查询教师信息表
     * 
     * @apiNote 通过id查询教师信息表
     * @param admin
     * @return
     */
    @PostMapping("/id")
    public List<Teacher> getTeacherById(@RequestBody Teacher teacher) {
        return teacherService.selectById(teacher);
    }
    /**
     * 通过id删除教师信息表
     * 
     * @apiNote 通过id删除教师信息表
     * @param admin
     * @return
     */
    @PostMapping("/delete")
    public int deleteTeacherById(@RequestBody Teacher teacher) {
        return teacherService.deleteById(teacher);
    }
    /**
     * 添加教师信息表
     * 
     * @apiNote 添加教师信息表
     * @param admin
     * @return
     */
    @PostMapping("/add")
    public int addTeacher(@RequestBody Teacher teacher) {
        return teacherService.insert(teacher);
    }
    /**
     * 修改教师信息表
     * 
     * @apiNote 修改教师信息表
     * @param admin
     * @return
     */
    @PostMapping("/update")
    public int updateTeacher(@RequestBody Teacher teacher) {
        return teacherService.updateById(teacher);
    }
    /**
     * 通过名字查询教师信息表
     * 
     * @apiNote 通过名字查询教师信息表
     * @param admin
     * @return
     */
    @PostMapping("/name")
    public List<Teacher> getTeacherByName(@RequestBody Teacher teacher) {
        return teacherService.selectByName(teacher);
    }
}
