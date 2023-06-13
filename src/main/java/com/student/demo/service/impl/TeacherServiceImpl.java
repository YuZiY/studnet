package com.student.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;
import com.student.demo.entity.Teacher;
import com.student.demo.mapper.TeacherMapper;
import com.student.demo.service.ITeacherService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 教师信息表 服务实现类
 * </p>
 *
 * @author laoxue
 * @since 2023-06-08
 */
@Service

public class TeacherServiceImpl implements ITeacherService {

    @Resource
    TeacherMapper teacherMapper;

    public List<Teacher> selectList(){
        return teacherMapper.selectList(null);
    }
        public List<Teacher> selectById(Teacher teacher){
        QueryWrapper<Teacher> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", teacher.getId());
        return  teacherMapper.selectList(queryWrapper);
    }

    public int insert(Teacher teacher){
        return teacherMapper.insert(teacher);
    }

    public int updateById(Teacher teacher){
        return teacherMapper.updateById(teacher);
    }

    public int deleteById(Teacher teacher){
        return teacherMapper.deleteById(teacher);
    }
    @Override
    public List<Teacher> selectByName(Teacher teacher) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectByName'");
    }
}
