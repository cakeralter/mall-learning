package cc.caker.mall.dal.ums.mapper;

import cc.caker.mall.dal.ums.dataobject.ResourceDO;

import java.util.List;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table ums_resource.
 * 资源表
 */
public interface ResourceDOMapper {

    /**
     * desc:插入表:ums_resource.<br/>
     *
     * @param entity entity
     * @return Long
     */
    Long insert(ResourceDO entity);

    /**
     * desc:批量插入表:ums_resource.<br/>
     *
     * @param list list
     * @return Long
     */
    Long insertBatch(List<ResourceDO> list);

    /**
     * desc:根据主键删除数据:ums_resource.<br/>
     *
     * @param id id
     * @return Long
     */
    Long deleteById(Long id);

    /**
     * desc:根据主键获取数据:ums_resource.<br/>
     *
     * @param id id
     * @return ResourceDO
     */
    ResourceDO getById(Long id);
}
