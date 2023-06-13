package com.student.demo.service;

import com.student.demo.entity.Elective;
import java.util.List;

/**
 *
 * @author laoxue
 * @since 2023-06-08
 */

public interface IElectiveService {

    public List<Elective> selectList();

    public Elective selectById(Elective elective);

    public int insert(Elective elective);

    public int updateById(Elective elective);

    public int deleteById(Elective elective);

}
