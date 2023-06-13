package com.student.demo.mapper;

import com.student.demo.entity.Teach;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 教师授课表 Mapper 接口
 * </p>
 *
 * @author laoxue
 * @since 2023-06-08
 */
@Mapper
public interface TeachMapper extends BaseMapper<Teach> {

}
