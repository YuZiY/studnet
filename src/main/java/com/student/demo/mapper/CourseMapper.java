package com.student.demo.mapper;

import com.student.demo.entity.Course;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 课程信息表 Mapper 接口
 * </p>
 *
 * @author laoxue
 * @since 2023-06-08
 */
@Mapper
public interface CourseMapper extends BaseMapper<Course> {

}
