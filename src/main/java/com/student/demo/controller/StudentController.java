package com.student.demo.controller;

import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

import com.student.demo.service.IStudentService;
import com.student.demo.entity.Student;


/**
 * 学生信息表
 * @author laoxue
 * @since 2023-06-08
 */

@CrossOrigin
@RestController
@RequestMapping("/student")

public class StudentController {


    @Resource
    private IStudentService studentService;
    /**
     * 查询所有
     * 
     * @apiNote 查询所有
     * @param student
     * @return
     */
    @PostMapping("/list")
    public List<Student> getStudentList() {
        return studentService.selectList();
    }
    /**
     * 通过id查询
     * 
     * @apiNote 通过id查询
     * @param admin
     * @return
     */
    @PostMapping("/id")
    public List<Student> getStudentById(@RequestBody Student student) {
        return studentService.selectById(student);
    }
        /**
     * 通过班级查询
     * 
     * @apiNote 通过班级查询
     * @param admin
     * @return
     */
    @PostMapping("/clNo")
    public List<Student> getStudentByClass(@RequestBody Student student) {
        return studentService.selectByClass(student);
    }
        /**
     * 通过名字查询
     * 
     * @apiNote 通过名字查询
     * @param admin
     * @return
     */
    @PostMapping("/sname")
    public List<Student> getStudentByName(@RequestBody Student student) {
        return studentService.selectByName(student);
    }
        /**
     * 通过宿舍查询
     * 
     * @apiNote 通过宿舍查询
     * @param admin
     * @return
     */
    @PostMapping("/dormitory")
    public List<Student> getStudentByDormitory(@RequestBody Student student) {
        return studentService.selectByDormitory(student);
    }
    /**
     * 通过id删除
     * 
     * @apiNote 通过id删除
     * @param admin
     * @return
     */
    @PostMapping("/delete")
    public int deleteStudentById(@RequestBody Student student) {
        return studentService.deleteById(student);
    }
    /**
     * 添加
     * 
     * @apiNote 添加
     * @param admin
     * @return
     */
    @PostMapping("/add")
    public int addStudent(@RequestBody Student student) {
        System.out.println(student);
        return studentService.insert(student);
    }
    /**
     * 修改
     * 
     * @apiNote 修改
     * @param admin
     * @return
     */
    @PostMapping("/update")
    public int updateStudent(@RequestBody Student student) {
        return studentService.updateById(student);
    }
    /**
     * 登录
     * 
     * @apiNote 登录
     * @param admin
     * @return
     */
    @PostMapping("/login")
    public Student login(@RequestBody Student student) {
        return studentService.loginAdmin(student);
    }

}
