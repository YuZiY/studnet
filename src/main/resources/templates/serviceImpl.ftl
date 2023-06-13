package ${package.ServiceImpl};

import java.util.List;

import javax.annotation.Resource;
import ${package.Entity}.${entity};
import ${package.Mapper}.${table.mapperName};
import ${package.Service}.${table.serviceName};
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * ${table.comment!} 服务实现类
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
@Service

public class ${table.serviceImplName} implements ${table.serviceName} {

    @Resource
    ${table.mapperName} ${table.entityPath}Mapper;

    public List<${entity}> selectList(){
        return ${table.entityPath}Mapper.selectList(null);
    }
        public ${entity} selectById(${entity} ${table.entityPath}){
        QueryWrapper<${entity}> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", ${table.entityPath}.getId());
        return  ${table.entityPath}Mapper.selectOne(queryWrapper);
    }

    public int insert(${entity} ${table.entityPath}){
        return ${table.entityPath}Mapper.insert(${table.entityPath});
    }

    public int updateById(${entity} ${table.entityPath}){
        return ${table.entityPath}Mapper.updateById(${table.entityPath});
    }

    public int deleteById(${entity} ${table.entityPath}){
        return ${table.entityPath}Mapper.deleteById(${table.entityPath});
    }
}
