package com.student.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;
import com.student.demo.entity.Yearterm;
import com.student.demo.mapper.YeartermMapper;
import com.student.demo.service.IYeartermService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学年学期表 服务实现类
 * </p>
 *
 * @author laoxue
 * @since 2023-06-08
 */
@Service

public class YeartermServiceImpl implements IYeartermService {

    @Resource
    YeartermMapper yeartermMapper;

    public List<Yearterm> selectList(){
        return yeartermMapper.selectList(null);
    }
        public Yearterm selectById(Yearterm yearterm){
        QueryWrapper<Yearterm> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", yearterm.getId());
        return  yeartermMapper.selectOne(queryWrapper);
    }

    public int insert(Yearterm yearterm){
        return yeartermMapper.insert(yearterm);
    }

    public int updateById(Yearterm yearterm){
        return yeartermMapper.updateById(yearterm);
    }

    public int deleteById(Yearterm yearterm){
        return yeartermMapper.deleteById(yearterm);
    }
}
