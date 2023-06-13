package com.student.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;
import com.student.demo.entity.Teach;
import com.student.demo.mapper.TeachMapper;
import com.student.demo.service.ITeachService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 教师授课表 服务实现类
 * </p>
 *
 * @author laoxue
 * @since 2023-06-08
 */
@Service

public class TeachServiceImpl implements ITeachService {

    @Resource
    TeachMapper teachMapper;

    public List<Teach> selectList(){
        return teachMapper.selectList(null);
    }
        public Teach selectById(Teach teach){
        QueryWrapper<Teach> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", teach.getId());
        return  teachMapper.selectOne(queryWrapper);
    }

    public int insert(Teach teach){
        return teachMapper.insert(teach);
    }

    public int updateById(Teach teach){
        return teachMapper.updateById(teach);
    }

    public int deleteById(Teach teach){
        return teachMapper.deleteById(teach);
    }
}
