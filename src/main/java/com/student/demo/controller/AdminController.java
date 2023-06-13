package com.student.demo.controller;

import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

import com.student.demo.service.IAdminService;
import com.student.demo.entity.Admin;


/**
 * 管理员信息表
 * @author laoxue
 * @since 2023-06-07
 */

@CrossOrigin
@RestController
@RequestMapping("/admin")

public class AdminController {


    @Resource
    private IAdminService adminService;
    /**
     * 查询所有
     * 
     * @apiNote 查询所有
     * @param admin
     * @return
     */
    @PostMapping("/list")
    public List<Admin> getAdminList() {
        return adminService.selectList();
    }
    /**
     * 通过id查询
     * 
     * @apiNote 通过id查询
     * @param admin
     * @return
     */
    @PostMapping("/id")
    public Admin getAdminById(@RequestBody Admin admin) {
        return adminService.selectById(admin);
    }
    /**
     * 通过id删除
     * 
     * @apiNote 通过id删除
     * @param admin
     * @return
     */
    @PostMapping("/delete")
    public int deleteAdminById(@RequestBody Admin admin) {
        return adminService.deleteById(admin);
    }
    /**
     * 添加
     * 
     * @apiNote 添加
     * @param admin
     * @return
     */
    @PostMapping("/add")
    public int addAdmin(@RequestBody Admin admin) {
        return adminService.insert(admin);
    }
    /**
     * 修改
     * 
     * @apiNote 修改
     * @param admin
     * @return
     */
    @PostMapping("/update")
    public int updateAdmin(@RequestBody Admin admin) {
        return adminService.updateById(admin);
    }
    /**
     * 登录
     * 
     * @apiNote 登录
     * @param admin
     * @return
     */
    @PostMapping("/login")
    public int loginAdmin(@RequestBody Admin admin) {
        return adminService.loginAdmin(admin);
    }
}