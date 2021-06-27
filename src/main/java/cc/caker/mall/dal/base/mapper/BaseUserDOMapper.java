package cc.caker.mall.dal.base.mapper;

import cc.caker.mall.dal.base.po.BaseUserDO;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author cakeralter
 * @since 2021-06-27
 */
public interface BaseUserDOMapper {

    /**
     * insert
     *
     * @param baseUserDO
     * @return
     */
    Integer insert(BaseUserDO baseUserDO);
}
