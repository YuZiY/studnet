package com.student.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.student.demo.entity.Student;
import com.student.demo.mapper.StudentMapper;
import com.student.demo.service.IStudentService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  学生信息表 服务实现类
 * </p>
 *
 * @author laoxue
 * @since 2023-06-08
 */
@Service

public class StudentServiceImpl implements IStudentService {

    @Resource
    StudentMapper studentMapper;

    public List<Student> selectList(){
        return studentMapper.selectList(null);
    }
        public List<Student> selectById(Student student){
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", student.getId());
        return  studentMapper.selectList(queryWrapper);
    }

    public int insert(Student student){
        return studentMapper.insert(student);
    }

    public int updateById(Student student){
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",student.getId());
        if(studentMapper.selectOne(queryWrapper)!= null) {
            return studentMapper.updateById(student);
        }else{
            return studentMapper.insert(student);
        }        
    }
    

    public int deleteById(Student student){
        return studentMapper.deleteById(student);
    }
    @Override
    public List<Student> selectByClass(Student student) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("cl_no", student.getClass());
        return  studentMapper.selectList(queryWrapper);
    }
    @Override
    public List<Student> selectByName(Student student) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("s_name", student.getSName());
        return  studentMapper.selectList(queryWrapper);
    }
    @Override
    public List<Student> selectByDormitory(Student student) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("dormitory", student.getDormitory());
        return  studentMapper.selectList(queryWrapper);
    }
    @Override
    public Student loginAdmin(Student student) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",student.getId());
        queryWrapper.eq("s_pwd",student.getSPwd());
        if(studentMapper.selectOne(queryWrapper)!= null) {
            return studentMapper.selectOne(queryWrapper);
        }else{
            return null;
        }        
    }
}
