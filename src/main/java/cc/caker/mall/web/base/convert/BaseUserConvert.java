package cc.caker.mall.web.base.convert;

import cc.caker.mall.dal.base.po.BaseUser;
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
    public static BaseUser v2d(BaseUserVO baseUserVO) {
        BaseUser baseUser = new BaseUser();
        baseUser.setId(baseUserVO.getId());
        baseUser.setUserName(baseUserVO.getUserName());
        baseUser.setNickName(baseUserVO.getNickName());
        baseUser.setEmail(baseUserVO.getEmail());
        baseUser.setAvatar(baseUserVO.getAvatar());
        baseUser.setPhone(baseUserVO.getPhone());
        baseUser.setStatus(baseUserVO.getStatus());
        baseUser.setSex(baseUserVO.getSex());
        baseUser.setBirthday(baseUserVO.getBirthday());
        baseUser.setSignature(baseUserVO.getSignature());
        baseUser.setLocation(baseUserVO.getLocation());
        baseUser.setAddress(baseUserVO.getAddress());
        baseUser.setRemark(baseUserVO.getRemark());
        return baseUser;
    }
}
