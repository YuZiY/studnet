package com.student.demo.service;

import com.student.demo.entity.Teach;
import java.util.List;

/**
 *
 * @author laoxue
 * @since 2023-06-08
 */

public interface ITeachService {

    public List<Teach> selectList();

    public Teach selectById(Teach teach);

    public int insert(Teach teach);

    public int updateById(Teach teach);

    public int deleteById(Teach teach);

}
