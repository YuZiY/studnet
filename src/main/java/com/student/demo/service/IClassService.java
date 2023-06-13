package com.student.demo.service;

import com.student.demo.entity.Class;
import java.util.List;

/**
 *
 * @author laoxue
 * @since 2023-06-08
 */

public interface IClassService {

    public List<Class> selectList();

    public Class selectById(Class class1);

    public int insert(Class class1);

    public int updateById(Class class1);

    public int deleteById(Class class1);

    public List<Class> selectByName(Class class1);

}
