package com.student.demo.controller;

import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

import com.student.demo.service.IYeartermService;
import com.student.demo.entity.Yearterm;


/**
 * 学年学期表
 * @author laoxue
 * @since 2023-06-08
 */

@CrossOrigin
@RestController
@RequestMapping("/yearterm")

public class YeartermController {


    @Resource
    private IYeartermService yeartermService;
    /**
     * 查询所有学年学期表
     * 
     * @apiNote 查询所有学年学期表
     * @param yearterm
     * @return
     */
    @PostMapping("/list")
    public List<Yearterm> getYeartermList() {
        return yeartermService.selectList();
    }
    /**
     * 通过id查询学年学期表
     * 
     * @apiNote 通过id查询学年学期表
     * @param admin
     * @return
     */
    @PostMapping("/id")
    public Yearterm getYeartermById(@RequestBody Yearterm yearterm) {
        return yeartermService.selectById(yearterm);
    }
    /**
     * 通过id删除学年学期表
     * 
     * @apiNote 通过id删除学年学期表
     * @param admin
     * @return
     */
    @PostMapping("/delete")
    public int deleteYeartermById(@RequestBody Yearterm yearterm) {
        return yeartermService.deleteById(yearterm);
    }
    /**
     * 添加学年学期表
     * 
     * @apiNote 添加学年学期表
     * @param admin
     * @return
     */
    @PostMapping("/add")
    public int addYearterm(@RequestBody Yearterm yearterm) {
        return yeartermService.insert(yearterm);
    }
    /**
     * 修改学年学期表
     * 
     * @apiNote 修改学年学期表
     * @param admin
     * @return
     */
    @PostMapping("/update")
    public int updateYearterm(@RequestBody Yearterm yearterm) {
        return yeartermService.updateById(yearterm);
    }

}
