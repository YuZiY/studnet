package com.student.demo.mapper;

import com.student.demo.entity.Elective;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 学生选修及成绩表 Mapper 接口
 * </p>
 *
 * @author laoxue
 * @since 2023-06-08
 */
@Mapper
public interface ElectiveMapper extends BaseMapper<Elective> {

}
