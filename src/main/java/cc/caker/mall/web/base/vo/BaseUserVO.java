package cc.caker.mall.web.base.vo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

/**
 * BaseUserVO
 *
 * @author cakeralter
 * @date 2021/6/27
 * @since 1.0
 */
@Data
public class BaseUserVO {

    private Long id;
    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 更新时间
     */
    private LocalDateTime gmtModify;

    /**
     * 创建人id
     */
    private Long creator;

    /**
     * 修改人
     */
    private Long modifier;

    /**
     * 用户uid
     */
    private String uid;

    /**
     * 用户名
     */
    @NotEmpty(message = "用户名不能为空")
    private String userName;

    /**
     * 昵称
     */
    @NotEmpty(message = "昵称不能为空")
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
