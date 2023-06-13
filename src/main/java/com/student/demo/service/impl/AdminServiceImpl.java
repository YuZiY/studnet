package com.student.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.student.demo.entity.Admin;
import com.student.demo.mapper.AdminMapper;
import com.student.demo.service.IAdminService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author laoxue
 * @since 2023-06-07
 */
@Service

public class AdminServiceImpl implements IAdminService {

    @Resource
    AdminMapper adminMapper;

    public List<Admin> selectList(){
        return adminMapper.selectList(null);
    }

    public Admin selectById(Admin admin){
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",admin.getId());
        return adminMapper.selectOne(queryWrapper);
    }

    public int insert(Admin admin){
        return adminMapper.insert(admin);
    }

    public int updateById(Admin admin){
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",admin.getId());
        if(adminMapper.selectOne(queryWrapper)!= null) {
            return adminMapper.updateById(admin);
        }else{
            return adminMapper.insert(admin);
        }        
    }

    public int deleteById(Admin admin){
        return adminMapper.deleteById(admin);
    }

    @Override
    public int loginAdmin(Admin admin) {
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("admin_name",admin.getAdminName());
        queryWrapper.eq("pwd",admin.getPwd());
        if(adminMapper.selectOne(queryWrapper)!=null){
         return 1;
        }else{
         return 0;
        }
     }
}
    
