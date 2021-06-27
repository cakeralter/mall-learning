package cc.caker.mall.dal.base.po;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * 用户表
 *
 * @author cakeralter
 * @since 2021-06-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseUserDO extends BaseDO {

    private static final long serialVersionUID = 1L;

    /**
     * 用户uid
     */
    private String uid;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 用户登陆密码
     */
    private String password;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 账号状态
     */
    private String status;

    /**
     * 用户性别F/M
     */
    private String sex;

    /**
     * 用户生日
     */
    private LocalDateTime birthday;

    /**
     * 用户签名
     */
    private String signature;

    /**
     * 用户位置
     */
    private String location;

    /**
     * 用户通信地址
     */
    private String address;

    /**
     * 备注
     */
    private String remark;
}
