package com.student.demo.mapper;

import com.student.demo.entity.Class;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 班级信息表 Mapper 接口
 * </p>
 *
 * @author laoxue
 * @since 2023-06-08
 */
@Mapper
public interface ClassMapper extends BaseMapper<Class> {

}
