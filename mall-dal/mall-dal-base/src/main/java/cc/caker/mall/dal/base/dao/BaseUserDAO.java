package cc.caker.mall.dal.base.dao;

import cc.caker.mall.dal.base.dataobject.BaseUserDO;
import cc.caker.mall.dal.base.mapper.BaseUserDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The Table base_user.
 * 用户表
 */
@Repository
public class BaseUserDAO {

    @Autowired
    private BaseUserDOMapper baseUserDOMapper;

    /**
     * desc:插入表:base_user.<br/>
     *
     * @param entity entity
     * @return Long
     */
    public Long insert(BaseUserDO entity) {
        return baseUserDOMapper.insert(entity);
    }

    /**
     * desc:批量插入表:base_user.<br/>
     *
     * @param list list
     * @return Long
     */
    public Long insertBatch(List<BaseUserDO> list) {
        return baseUserDOMapper.insertBatch(list);
    }

    /**
     * desc:根据主键删除数据:base_user.<br/>
     *
     * @param id id
     * @return Long
     */
    public Long deleteById(Long id) {
        return baseUserDOMapper.deleteById(id);
    }

    /**
     * desc:根据主键获取数据:base_user.<br/>
     *
     * @param id id
     * @return BaseUserDO
     */
    public BaseUserDO getById(Long id) {
        return baseUserDOMapper.getById(id);
    }

    /**
     * desc:根据唯一约束UidName更新表:base_user.<br/>
     *
     * @param entity entity
     * @return Long
     */
    public Long updateByUidName(BaseUserDO entity) {
        return baseUserDOMapper.updateByUidName(entity);
    }

    /**
     * desc:根据唯一约束UidName删除数据:base_user.<br/>
     *
     * @param uid      uid
     * @param nickName nickName
     * @param userName userName
     * @return Long
     */
    public Long deleteByUidName(String uid, String nickName, String userName) {
        return baseUserDOMapper.deleteByUidName(uid, nickName, userName);
    }

    /**
     * desc:根据唯一约束UidName获取数据:base_user.<br/>
     *
     * @param uid      uid
     * @param nickName nickName
     * @param userName userName
     * @return BaseUserDO
     */
    public BaseUserDO getByUidName(String uid, String nickName, String userName) {
        return baseUserDOMapper.getByUidName(uid, nickName, userName);
    }
}
