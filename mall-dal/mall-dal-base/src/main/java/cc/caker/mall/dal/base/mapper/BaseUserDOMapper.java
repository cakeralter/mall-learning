package cc.caker.mall.dal.base.mapper;

import cc.caker.mall.dal.base.dataobject.BaseUserDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table base_user.
 * 用户表
 */
public interface BaseUserDOMapper {

    /**
     * desc:插入表:base_user.<br/>
     *
     * @param entity entity
     * @return Long
     */
    Long insert(BaseUserDO entity);

    /**
     * desc:批量插入表:base_user.<br/>
     *
     * @param list list
     * @return Long
     */
    Long insertBatch(List<BaseUserDO> list);

    /**
     * desc:根据主键删除数据:base_user.<br/>
     *
     * @param id id
     * @return Long
     */
    Long deleteById(Long id);

    /**
     * desc:根据主键获取数据:base_user.<br/>
     *
     * @param id id
     * @return BaseUserDO
     */
    BaseUserDO getById(Long id);

    /**
     * desc:根据唯一约束UidName更新表:base_user.<br/>
     *
     * @param entity entity
     * @return Long
     */
    Long updateByUidName(BaseUserDO entity);

    /**
     * desc:根据唯一约束UidName删除数据:base_user.<br/>
     *
     * @param uid      uid
     * @param nickName nickName
     * @param userName userName
     * @return Long
     */
    Long deleteByUidName(@Param("uid") String uid, @Param("nickName") String nickName, @Param("userName") String userName);

    /**
     * desc:根据唯一约束UidName获取数据:base_user.<br/>
     *
     * @param uid      uid
     * @param nickName nickName
     * @param userName userName
     * @return BaseUserDO
     */
    BaseUserDO getByUidName(@Param("uid") String uid, @Param("nickName") String nickName, @Param("userName") String userName);
}
