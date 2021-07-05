package cc.caker.mall.dal.ums.mapper;

import cc.caker.mall.dal.ums.dataobject.RoleDO;

import java.util.List;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table ums_role.
 * 角色表
 */
public interface RoleDOMapper {

    /**
     * desc:插入表:ums_role.<br/>
     *
     * @param entity entity
     * @return Long
     */
    Long insert(RoleDO entity);

    /**
     * desc:批量插入表:ums_role.<br/>
     *
     * @param list list
     * @return Long
     */
    Long insertBatch(List<RoleDO> list);

    /**
     * desc:根据主键删除数据:ums_role.<br/>
     *
     * @param id id
     * @return Long
     */
    Long deleteById(Long id);

    /**
     * desc:根据主键获取数据:ums_role.<br/>
     *
     * @param id id
     * @return RoleDO
     */
    RoleDO getById(Long id);
}
