package com.student.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;
import com.student.demo.entity.Elective;
import com.student.demo.mapper.ElectiveMapper;
import com.student.demo.service.IElectiveService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生选修及成绩表 服务实现类
 * </p>
 *
 * @author laoxue
 * @since 2023-06-08
 */
@Service

public class ElectiveServiceImpl implements IElectiveService {

    @Resource
    ElectiveMapper electiveMapper;

    public List<Elective> selectList(){
        return electiveMapper.selectList(null);
    }
        public Elective selectById(Elective elective){
        QueryWrapper<Elective> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", elective.getId());
        return  electiveMapper.selectOne(queryWrapper);
    }

    public int insert(Elective elective){
        return electiveMapper.insert(elective);
    }

    public int updateById(Elective elective){
        return electiveMapper.updateById(elective);
    }

    public int deleteById(Elective elective){
        return electiveMapper.deleteById(elective);
    }
}
