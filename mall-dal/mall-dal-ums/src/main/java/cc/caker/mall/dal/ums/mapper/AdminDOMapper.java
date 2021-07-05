package cc.caker.mall.dal.ums.mapper;

import cc.caker.mall.dal.ums.dataobject.AdminDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table ums_admin.
 * 管理员表
 */
public interface AdminDOMapper {

    /**
     * desc:插入表:ums_admin.<br/>
     *
     * @param entity entity
     * @return Long
     */
    Long insert(AdminDO entity);

    /**
     * desc:批量插入表:ums_admin.<br/>
     *
     * @param list list
     * @return Long
     */
    Long insertBatch(List<AdminDO> list);

    /**
     * desc:根据主键删除数据:ums_admin.<br/>
     *
     * @param id id
     * @return Long
     */
    Long deleteById(Long id);

    /**
     * desc:根据主键获取数据:ums_admin.<br/>
     *
     * @param id id
     * @return AdminDO
     */
    AdminDO getById(Long id);

    /**
     * desc:根据唯一约束UidName更新表:ums_admin.<br/>
     *
     * @param entity entity
     * @return Long
     */
    Long updateByUidName(AdminDO entity);

    /**
     * desc:根据唯一约束UidName删除数据:ums_admin.<br/>
     *
     * @param uid      uid
     * @param nickName nickName
     * @param userName userName
     * @return Long
     */
    Long deleteByUidName(@Param("uid") String uid, @Param("nickName") String nickName, @Param("userName") String userName);

    /**
     * desc:根据唯一约束UidName获取数据:ums_admin.<br/>
     *
     * @param uid      uid
     * @param nickName nickName
     * @param userName userName
     * @return AdminDO
     */
    AdminDO getByUidName(@Param("uid") String uid, @Param("nickName") String nickName, @Param("userName") String userName);
}
