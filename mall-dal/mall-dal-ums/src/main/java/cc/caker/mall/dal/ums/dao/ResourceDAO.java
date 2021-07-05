package cc.caker.mall.dal.ums.dao;

import cc.caker.mall.dal.ums.dataobject.ResourceDO;
import cc.caker.mall.dal.ums.mapper.ResourceDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The Table ums_resource.
 * 资源表
 */
@Repository
public class ResourceDAO {

    @Autowired
    private ResourceDOMapper resourceDOMapper;

    /**
     * desc:插入表:ums_resource.<br/>
     *
     * @param entity entity
     * @return Long
     */
    public Long insert(ResourceDO entity) {
        return resourceDOMapper.insert(entity);
    }

    /**
     * desc:批量插入表:ums_resource.<br/>
     *
     * @param list list
     * @return Long
     */
    public Long insertBatch(List<ResourceDO> list) {
        return resourceDOMapper.insertBatch(list);
    }

    /**
     * desc:根据主键删除数据:ums_resource.<br/>
     *
     * @param id id
     * @return Long
     */
    public Long deleteById(Long id) {
        return resourceDOMapper.deleteById(id);
    }

    /**
     * desc:根据主键获取数据:ums_resource.<br/>
     *
     * @param id id
     * @return ResourceDO
     */
    public ResourceDO getById(Long id) {
        return resourceDOMapper.getById(id);
    }
}
