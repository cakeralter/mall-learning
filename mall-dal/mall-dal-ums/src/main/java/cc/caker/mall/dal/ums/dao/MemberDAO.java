package cc.caker.mall.dal.ums.dao;

import cc.caker.mall.dal.ums.dataobject.MemberDO;
import cc.caker.mall.dal.ums.mapper.MemberDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The Table ums_member.
 * 用户表
 */
@Repository
public class MemberDAO {

    @Autowired
    private MemberDOMapper memberDOMapper;

    /**
     * desc:插入表:ums_member.<br/>
     *
     * @param entity entity
     * @return Long
     */
    public Long insert(MemberDO entity) {
        return memberDOMapper.insert(entity);
    }

    /**
     * desc:批量插入表:ums_member.<br/>
     *
     * @param list list
     * @return Long
     */
    public Long insertBatch(List<MemberDO> list) {
        return memberDOMapper.insertBatch(list);
    }

    /**
     * desc:根据主键删除数据:ums_member.<br/>
     *
     * @param id id
     * @return Long
     */
    public Long deleteById(Long id) {
        return memberDOMapper.deleteById(id);
    }

    /**
     * desc:根据主键获取数据:ums_member.<br/>
     *
     * @param id id
     * @return MemberDO
     */
    public MemberDO getById(Long id) {
        return memberDOMapper.getById(id);
    }

    /**
     * desc:根据唯一约束UidName更新表:ums_member.<br/>
     *
     * @param entity entity
     * @return Long
     */
    public Long updateByUidName(MemberDO entity) {
        return memberDOMapper.updateByUidName(entity);
    }

    /**
     * desc:根据唯一约束UidName删除数据:ums_member.<br/>
     *
     * @param uid      uid
     * @param nickName nickName
     * @param userName userName
     * @return Long
     */
    public Long deleteByUidName(String uid, String nickName, String userName) {
        return memberDOMapper.deleteByUidName(uid, nickName, userName);
    }

    /**
     * desc:根据唯一约束UidName获取数据:ums_member.<br/>
     *
     * @param uid      uid
     * @param nickName nickName
     * @param userName userName
     * @return MemberDO
     */
    public MemberDO getByUidName(String uid, String nickName, String userName) {
        return memberDOMapper.getByUidName(uid, nickName, userName);
    }
}
