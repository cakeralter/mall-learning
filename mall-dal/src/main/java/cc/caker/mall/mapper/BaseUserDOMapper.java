package cc.caker.mall.mapper;

import cc.caker.mall.dataobject.BaseUserDO;
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
     * descSql =  SELECT LAST_INSERT_ID() <![CDATA[ INSERT INTO base_user( ID ,CREATOR ,MODIFIER ,SEX ,UID ,EMAIL ,PHONE ,AVATAR ,REMARK ,STATUS ,ADDRESS ,LOCATION ,NICK_NAME ,PASSWORD ,USER_NAME ,IS_DELETED ,SIGNATURE ,BIRTHDAY ,GMT_CREATE ,GMT_MODIFY )VALUES( null , #{creator,jdbcType=BIGINT} , #{modifier,jdbcType=BIGINT} , #{sex,jdbcType=CHAR} , #{uid,jdbcType=VARCHAR} , #{email,jdbcType=VARCHAR} , #{phone,jdbcType=VARCHAR} , #{avatar,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{status,jdbcType=VARCHAR} , #{address,jdbcType=VARCHAR} , #{location,jdbcType=VARCHAR} , #{nickName,jdbcType=VARCHAR} , #{password,jdbcType=VARCHAR} , #{userName,jdbcType=VARCHAR} , 'N' , #{signature,jdbcType=VARCHAR} , #{birthday,jdbcType=TIMESTAMP} , now() , #{gmtModify,jdbcType=TIMESTAMP} ) ]]>
     *
     * @param entity entity
     * @return Long
     */
    Long insert(BaseUserDO entity);

    /**
     * desc:批量插入表:base_user.<br/>
     * descSql =  INSERT INTO base_user( ID ,CREATOR ,MODIFIER ,SEX ,UID ,EMAIL ,PHONE ,AVATAR ,REMARK ,STATUS ,ADDRESS ,LOCATION ,NICK_NAME ,PASSWORD ,USER_NAME ,IS_DELETED ,SIGNATURE ,BIRTHDAY ,GMT_CREATE ,GMT_MODIFY )VALUES ( null , #{item.creator,jdbcType=BIGINT} , #{item.modifier,jdbcType=BIGINT} , #{item.sex,jdbcType=CHAR} , #{item.uid,jdbcType=VARCHAR} , #{item.email,jdbcType=VARCHAR} , #{item.phone,jdbcType=VARCHAR} , #{item.avatar,jdbcType=VARCHAR} , #{item.remark,jdbcType=VARCHAR} , #{item.status,jdbcType=VARCHAR} , #{item.address,jdbcType=VARCHAR} , #{item.location,jdbcType=VARCHAR} , #{item.nickName,jdbcType=VARCHAR} , #{item.password,jdbcType=VARCHAR} , #{item.userName,jdbcType=VARCHAR} , 'N' , #{item.signature,jdbcType=VARCHAR} , #{item.birthday,jdbcType=TIMESTAMP} , now() , #{item.gmtModify,jdbcType=TIMESTAMP} )
     *
     * @param list list
     * @return Long
     */
    Long insertBatch(List<BaseUserDO> list);

    /**
     * desc:根据主键删除数据:base_user.<br/>
     * descSql =  <![CDATA[ DELETE FROM base_user WHERE ID = #{id,jdbcType=BIGINT} ]]>
     *
     * @param id id
     * @return Long
     */
    Long deleteById(Long id);

    /**
     * desc:根据主键获取数据:base_user.<br/>
     * descSql =  SELECT * FROM base_user WHERE <![CDATA[ ID = #{id,jdbcType=BIGINT} ]]>
     *
     * @param id id
     * @return BaseUserDO
     */
    BaseUserDO getById(Long id);

    /**
     * desc:根据唯一约束UidName更新表:base_user.<br/>
     * descSql =  <![CDATA[ UPDATE base_user SET MODIFIER = #{modifier,jdbcType=BIGINT} ,SEX = #{sex,jdbcType=CHAR} ,EMAIL = #{email,jdbcType=VARCHAR} ,PHONE = #{phone,jdbcType=VARCHAR} ,AVATAR = #{avatar,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,STATUS = #{status,jdbcType=VARCHAR} ,ADDRESS = #{address,jdbcType=VARCHAR} ,LOCATION = #{location,jdbcType=VARCHAR} ,PASSWORD = #{password,jdbcType=VARCHAR} ,IS_DELETED = #{isDeleted,jdbcType=CHAR} ,SIGNATURE = #{signature,jdbcType=VARCHAR} ,BIRTHDAY = #{birthday,jdbcType=TIMESTAMP} ,GMT_MODIFY = #{gmtModify,jdbcType=TIMESTAMP} WHERE UID = #{uid,jdbcType=VARCHAR} AND USER_NAME = #{userName,jdbcType=VARCHAR} AND NICK_NAME = #{nickName,jdbcType=VARCHAR} ]]>
     *
     * @param entity entity
     * @return Long
     */
    Long updateByUidName(BaseUserDO entity);

    /**
     * desc:根据唯一约束UidName删除数据:base_user.<br/>
     * descSql =  <![CDATA[ DELETE FROM base_user WHERE UID = #{uid,jdbcType=VARCHAR} AND USER_NAME = #{userName,jdbcType=VARCHAR} AND NICK_NAME = #{nickName,jdbcType=VARCHAR} ]]>
     *
     * @param uid      uid
     * @param nickName nickName
     * @param userName userName
     * @return Long
     */
    Long deleteByUidName(@Param("uid") String uid, @Param("nickName") String nickName, @Param("userName") String userName);

    /**
     * desc:根据唯一约束UidName获取数据:base_user.<br/>
     * descSql =  SELECT * FROM base_user WHERE <![CDATA[ UID = #{uid,jdbcType=VARCHAR} AND USER_NAME = #{userName,jdbcType=VARCHAR} AND NICK_NAME = #{nickName,jdbcType=VARCHAR} ]]>
     *
     * @param uid      uid
     * @param nickName nickName
     * @param userName userName
     * @return BaseUserDO
     */
    BaseUserDO getByUidName(@Param("uid") String uid, @Param("nickName") String nickName, @Param("userName") String userName);
}
