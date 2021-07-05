package cc.caker.mall.dal.ums.dao;

import cc.caker.mall.dal.ums.dataobject.AdminDO;
import cc.caker.mall.dal.ums.mapper.AdminDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The Table ums_admin.
 * 管理员表
 */
@Repository
public class AdminDAO {

    @Autowired
    private AdminDOMapper adminDOMapper;

    /**
     * desc:插入表:ums_admin.<br/>
     *
     * @param entity entity
     * @return Long
     */
    public Long insert(AdminDO entity) {
        return adminDOMapper.insert(entity);
    }

    /**
     * desc:批量插入表:ums_admin.<br/>
     *
     * @param list list
     * @return Long
     */
    public Long insertBatch(List<AdminDO> list) {
        return adminDOMapper.insertBatch(list);
    }

    /**
     * desc:根据主键删除数据:ums_admin.<br/>
     *
     * @param id id
     * @return Long
     */
    public Long deleteById(Long id) {
        return adminDOMapper.deleteById(id);
    }

    /**
     * desc:根据主键获取数据:ums_admin.<br/>
     *
     * @param id id
     * @return AdminDO
     */
    public AdminDO getById(Long id) {
        return adminDOMapper.getById(id);
    }

    /**
     * desc:根据唯一约束UidName更新表:ums_admin.<br/>
     *
     * @param entity entity
     * @return Long
     */
    public Long updateByUidName(AdminDO entity) {
        return adminDOMapper.updateByUidName(entity);
    }

    /**
     * desc:根据唯一约束UidName删除数据:ums_admin.<br/>
     *
     * @param uid      uid
     * @param nickName nickName
     * @param userName userName
     * @return Long
     */
    public Long deleteByUidName(String uid, String nickName, String userName) {
        return adminDOMapper.deleteByUidName(uid, nickName, userName);
    }

    /**
     * desc:根据唯一约束UidName获取数据:ums_admin.<br/>
     *
     * @param uid      uid
     * @param nickName nickName
     * @param userName userName
     * @return AdminDO
     */
    public AdminDO getByUidName(String uid, String nickName, String userName) {
        return adminDOMapper.getByUidName(uid, nickName, userName);
    }
}
