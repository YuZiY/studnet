package com.student.demo.controller;

import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

import com.student.demo.service.ITeachService;
import com.student.demo.entity.Teach;


/**
 * 教师授课表
 * @author laoxue
 * @since 2023-06-08
 */

@CrossOrigin
@RestController
@RequestMapping("/teach")

public class TeachController {


    @Resource
    private ITeachService teachService;
    /**
     * 查询所有教师授课表
     * 
     * @apiNote 查询所有教师授课表
     * @param teach
     * @return
     */
    @PostMapping("/list")
    public List<Teach> getTeachList() {
        return teachService.selectList();
    }
    /**
     * 通过id查询教师授课表
     * 
     * @apiNote 通过id查询教师授课表
     * @param admin
     * @return
     */
    @PostMapping("/id")
    public Teach getTeachById(@RequestBody Teach teach) {
        return teachService.selectById(teach);
    }
    /**
     * 通过id删除教师授课表
     * 
     * @apiNote 通过id删除教师授课表
     * @param admin
     * @return
     */
    @PostMapping("/delete")
    public int deleteTeachById(@RequestBody Teach teach) {
        return teachService.deleteById(teach);
    }
    /**
     * 添加教师授课表
     * 
     * @apiNote 添加教师授课表
     * @param admin
     * @return
     */
    @PostMapping("/add")
    public int addTeach(@RequestBody Teach teach) {
        return teachService.insert(teach);
    }
    /**
     * 修改教师授课表
     * 
     * @apiNote 修改教师授课表
     * @param admin
     * @return
     */
    @PostMapping("/update")
    public int updateTeach(@RequestBody Teach teach) {
        return teachService.updateById(teach);
    }

}
