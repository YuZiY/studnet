package com.student.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;
import com.student.demo.entity.Class;
import com.student.demo.mapper.ClassMapper;
import com.student.demo.service.IClassService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 班级信息表 服务实现类
 * </p>
 *
 * @author laoxue
 * @since 2023-06-08
 */
@Service

public class ClassServiceImpl implements IClassService {

    @Resource
    ClassMapper classMapper;

    public List<Class> selectList(){
        return classMapper.selectList(null);
    }
        public Class selectById(Class class1){
        QueryWrapper<Class> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", class1.getId());
        return  classMapper.selectOne(queryWrapper);
    }

    public int insert(Class class1){
        return classMapper.insert(class1);
    }

    public int updateById(Class class1){
        return classMapper.updateById(class1);
    }

    public int deleteById(Class class1){
        return classMapper.deleteById(class1);
    }
    @Override
    public List<Class> selectByName(Class class1){
        QueryWrapper<Class> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("cl_name", class1.getClName());
        return  classMapper.selectList(queryWrapper);
    }
}
