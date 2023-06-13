package com.student.demo.controller;

import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

import com.student.demo.service.IElectiveService;
import com.student.demo.entity.Elective;


/**
 * 学生选修及成绩表
 * @author laoxue
 * @since 2023-06-08
 */

@CrossOrigin
@RestController
@RequestMapping("/elective")

public class ElectiveController {


    @Resource
    private IElectiveService electiveService;
    /**
     * 查询所有学生选修及成绩表
     * 
     * @apiNote 查询所有学生选修及成绩表
     * @param elective
     * @return
     */
    @PostMapping("/list")
    public List<Elective> getElectiveList() {
        return electiveService.selectList();
    }
    /**
     * 通过id查询学生选修及成绩表
     * 
     * @apiNote 通过id查询学生选修及成绩表
     * @param admin
     * @return
     */
    @PostMapping("/id")
    public Elective getElectiveById(@RequestBody Elective elective) {
        return electiveService.selectById(elective);
    }
    /**
     * 通过id删除学生选修及成绩表
     * 
     * @apiNote 通过id删除学生选修及成绩表
     * @param admin
     * @return
     */
    @PostMapping("/delete")
    public int deleteElectiveById(@RequestBody Elective elective) {
        return electiveService.deleteById(elective);
    }
    /**
     * 添加学生选修及成绩表
     * 
     * @apiNote 添加学生选修及成绩表
     * @param admin
     * @return
     */
    @PostMapping("/add")
    public int addElective(@RequestBody Elective elective) {
        return electiveService.insert(elective);
    }
    /**
     * 修改学生选修及成绩表
     * 
     * @apiNote 修改学生选修及成绩表
     * @param admin
     * @return
     */
    @PostMapping("/update")
    public int updateElective(@RequestBody Elective elective) {
        return electiveService.updateById(elective);
    }

}
