package cc.caker.mall.dal.base.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author cakeralter
 * @since 2021-06-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BaseUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
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
     * 是否删除Y/N
     */
    private String isDeleted;

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
