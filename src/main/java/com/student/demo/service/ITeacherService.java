package com.student.demo.service;

import com.student.demo.entity.Teacher;
import java.util.List;

/**
 *
 * @author laoxue
 * @since 2023-06-08
 */

public interface ITeacherService {

    public List<Teacher> selectList();

    public List<Teacher> selectById(Teacher teacher);

    public int insert(Teacher teacher);

    public int updateById(Teacher teacher);

    public int deleteById(Teacher teacher);

    public List<Teacher> selectByName(Teacher teacher);

}
