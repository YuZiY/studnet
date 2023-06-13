package ${package.Service};

import ${package.Entity}.${entity};
import java.util.List;

/**
 *
 * @author ${author}
 * @since ${date}
 */

public interface ${table.serviceName} {

    public List<${entity}> selectList();

    public ${entity} selectById(${entity} ${table.entityPath});

    public int insert(${entity} ${table.entityPath});

    public int updateById(${entity} ${table.entityPath});

    public int deleteById(${entity} ${table.entityPath});

}
