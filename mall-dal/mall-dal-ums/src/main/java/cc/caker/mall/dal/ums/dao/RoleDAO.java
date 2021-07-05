package cc.caker.mall.dal.ums.dao;

import cc.caker.mall.dal.ums.dataobject.RoleDO;
import cc.caker.mall.dal.ums.mapper.RoleDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The Table ums_role.
 * 角色表
 */
@Repository
public class RoleDAO {

    @Autowired
    private RoleDOMapper roleDOMapper;

    /**
     * desc:插入表:ums_role.<br/>
     *
     * @param entity entity
     * @return Long
     */
    public Long insert(RoleDO entity) {
        return roleDOMapper.insert(entity);
    }

    /**
     * desc:批量插入表:ums_role.<br/>
     *
     * @param list list
     * @return Long
     */
    public Long insertBatch(List<RoleDO> list) {
        return roleDOMapper.insertBatch(list);
    }

    /**
     * desc:根据主键删除数据:ums_role.<br/>
     *
     * @param id id
     * @return Long
     */
    public Long deleteById(Long id) {
        return roleDOMapper.deleteById(id);
    }

    /**
     * desc:根据主键获取数据:ums_role.<br/>
     *
     * @param id id
     * @return RoleDO
     */
    public RoleDO getById(Long id) {
        return roleDOMapper.getById(id);
    }
}
