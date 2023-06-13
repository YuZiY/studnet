package com.student.demo.service;

import com.student.demo.entity.Course;
import java.util.List;

/**
 *
 * @author laoxue
 * @since 2023-06-08
 */

public interface ICourseService {

    public List<Course> selectList();

    public Course selectById(Course course);

    public int insert(Course course);

    public int updateById(Course course);

    public int deleteById(Course course);

    public List<Course> selectByName(Course course);


}
