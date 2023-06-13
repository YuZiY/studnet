package ${package.Controller};

import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

import ${package.Service}.${table.serviceName};
import ${package.Entity}.${entity};


/**
 * ${table.comment}
 * @author ${author}
 * @since ${date}
 */

@CrossOrigin
@RestController
@RequestMapping("/${table.entityPath}")

public class ${table.controllerName} {


    @Resource
    private ${table.serviceName} ${table.entityPath}Service;
    /**
     * 查询所有${table.comment}
     * 
     * @apiNote 查询所有${table.comment}
     * @param ${table.entityPath}
     * @return
     */
    @PostMapping("/list")
    public List<${entity}> get${entity}List() {
        return ${table.entityPath}Service.selectList();
    }
    /**
     * 通过id查询${table.comment}
     * 
     * @apiNote 通过id查询${table.comment}
     * @param admin
     * @return
     */
    @PostMapping("/id")
    public ${entity} get${entity}ById(@RequestBody ${entity} ${table.entityPath}) {
        return ${table.entityPath}Service.selectById(${table.entityPath});
    }
    /**
     * 通过id删除${table.comment}
     * 
     * @apiNote 通过id删除${table.comment}
     * @param admin
     * @return
     */
    @PostMapping("/delete")
    public int delete${entity}ById(@RequestBody ${entity} ${table.entityPath}) {
        return ${table.entityPath}Service.deleteById(${table.entityPath});
    }
    /**
     * 添加${table.comment}
     * 
     * @apiNote 添加${table.comment}
     * @param admin
     * @return
     */
    @PostMapping("/add")
    public int add${entity}(@RequestBody ${entity} ${table.entityPath}) {
        return ${table.entityPath}Service.insert(${table.entityPath});
    }
    /**
     * 修改${table.comment}
     * 
     * @apiNote 修改${table.comment}
     * @param admin
     * @return
     */
    @PostMapping("/update")
    public int update${entity}(@RequestBody ${entity} ${table.entityPath}) {
        return ${table.entityPath}Service.updateById(${table.entityPath});
    }

}
