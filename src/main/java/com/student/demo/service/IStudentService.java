package com.student.demo.service;

import com.student.demo.entity.Student;
import java.util.List;

/**
 *
 * @author laoxue
 * @since 2023-06-08
 */

public interface IStudentService {

    public List<Student> selectList();

    public List<Student> selectById(Student student);

    public int insert(Student student);

    public int updateById(Student student);

    public int deleteById(Student student);

    public List<Student> selectByClass(Student student);

    public List<Student> selectByName(Student student);

    public List<Student> selectByDormitory(Student student);
    
    public Student loginAdmin(Student student);



    

}
