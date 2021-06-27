package cc.caker.mall.web.base.convert;

import cc.caker.mall.dal.base.po.BaseUserDO;
import cc.caker.mall.web.base.vo.BaseUserVO;

/**
 * BaseUserConvert
 *
 * @author cakeralter
 * @date 2021/6/27
 * @since 1.0
 */
public class BaseUserConvert {

    /**
     * BaseUserVO to BaseUser
     *
     * @param baseUserVO
     * @return
     */
    public static BaseUserDO v2d(BaseUserVO baseUserVO) {
        BaseUserDO entity = new BaseUserDO();
        entity.setId(baseUserVO.getId());
        entity.setUid(baseUserVO.getUid());
        entity.setUserName(baseUserVO.getUserName());
        entity.setNickName(baseUserVO.getNickName());
        entity.setEmail(baseUserVO.getEmail());
        entity.setAvatar(baseUserVO.getAvatar());
        entity.setPhone(baseUserVO.getPhone());
        entity.setStatus(baseUserVO.getStatus());
        entity.setSex(baseUserVO.getSex());
        entity.setBirthday(baseUserVO.getBirthday());
        entity.setSignature(baseUserVO.getSignature());
        entity.setLocation(baseUserVO.getLocation());
        entity.setAddress(baseUserVO.getAddress());
        entity.setRemark(baseUserVO.getRemark());
        return entity;
    }
}
