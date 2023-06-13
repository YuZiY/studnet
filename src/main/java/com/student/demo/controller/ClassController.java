package com.student.demo.controller;

import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

import com.student.demo.service.IClassService;
import com.student.demo.entity.Class;


/**
 * 班级信息表
 * @author laoxue
 * @since 2023-06-08
 */

@CrossOrigin
@RestController
@RequestMapping("/class")

public class ClassController {


    @Resource
    private IClassService classService;
    /**
     * 查询所有班级信息表
     * 
     * @apiNote 查询所有班级信息表
     * @param class
     * @return
     */
    @PostMapping("/list")
    public List<Class> getClassList() {
        return classService.selectList();
    }
    /**
     * 通过id查询班级信息表
     * 
     * @apiNote 通过id查询班级信息表
     * @param admin
     * @return
     */
    @PostMapping("/id")
    public Class getClassById(@RequestBody Class class1) {
        return classService.selectById(class1);
    }
    /**
     * 通过id删除班级信息表
     * 
     * @apiNote 通过id删除班级信息表
     * @param admin
     * @return
     */
    @PostMapping("/delete")
    public int deleteClassById(@RequestBody Class class1) {
        return classService.deleteById(class1);
    }
    /**
     * 添加班级信息表
     * 
     * @apiNote 添加班级信息表
     * @param admin
     * @return
     */
    @PostMapping("/add")
    public int addClass(@RequestBody Class class1) {
        return classService.insert(class1);
    }
    /**
     * 修改班级信息表
     * 
     * @apiNote 修改班级信息表
     * @param admin
     * @return
     */
    @PostMapping("/update")
    public int updateClass(@RequestBody Class class1) {
        return classService.updateById(class1);
    }
    /**
     * 通过名字查询班级信息表
     * 
     * @apiNote 通过名字查询班级信息表
     * @param admin
     * @return
     */
    @PostMapping("/name")
    public List<Class> getClassByName(@RequestBody Class class1) {
        return classService.selectByName(class1);
    }
}
