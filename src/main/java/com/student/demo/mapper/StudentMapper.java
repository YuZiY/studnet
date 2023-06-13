package com.student.demo.mapper;

import com.student.demo.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author laoxue
 * @since 2023-06-08
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
