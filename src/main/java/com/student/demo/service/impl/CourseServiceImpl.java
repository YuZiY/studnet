package com.student.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;
import com.student.demo.entity.Course;
import com.student.demo.mapper.CourseMapper;
import com.student.demo.service.ICourseService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课程信息表 服务实现类
 * </p>
 *
 * @author laoxue
 * @since 2023-06-08
 */
@Service

public class CourseServiceImpl implements ICourseService {

    @Resource
    CourseMapper courseMapper;

    public List<Course> selectList(){
        return courseMapper.selectList(null);
    }
        public Course selectById(Course course){
        QueryWrapper<Course> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", course.getId());
        return  courseMapper.selectOne(queryWrapper);
    }

    public int insert(Course course){
        return courseMapper.insert(course);
    }

    public int updateById(Course course){
        return courseMapper.updateById(course);
    }

    public int deleteById(Course course){
        return courseMapper.deleteById(course);
    }
    @Override
    public List<Course> selectByName(Course course) {
        QueryWrapper<Course> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("c_name", course.getCName());
        return  courseMapper.selectList(queryWrapper);
    }
}
