package com.student.demo.service;

import com.student.demo.entity.Yearterm;
import java.util.List;

/**
 *
 * @author laoxue
 * @since 2023-06-08
 */

public interface IYeartermService {

    public List<Yearterm> selectList();

    public Yearterm selectById(Yearterm yearterm);

    public int insert(Yearterm yearterm);

    public int updateById(Yearterm yearterm);

    public int deleteById(Yearterm yearterm);

}
