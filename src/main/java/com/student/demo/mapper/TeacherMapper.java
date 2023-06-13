package com.student.demo.mapper;

import com.student.demo.entity.Teacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 教师信息表 Mapper 接口
 * </p>
 *
 * @author laoxue
 * @since 2023-06-08
 */
@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {

}
