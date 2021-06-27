package cc.caker.mall.dal.base.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author cakeralter
 * @since 2021-06-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "BaseUser对象", description = "用户表")
public class BaseUser extends BaseDO {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户uid")
    private String uid;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "用户登陆密码")
    private String password;

    @ApiModelProperty(value = "用户邮箱")
    private String email;

    @ApiModelProperty(value = "用户头像")
    private String avatar;

    @ApiModelProperty(value = "手机号码")
    private String phone;

    @ApiModelProperty(value = "账号状态")
    private String status;

    @ApiModelProperty(value = "用户性别F/M")
    private String sex;

    @ApiModelProperty(value = "用户生日")
    private LocalDateTime birthday;

    @ApiModelProperty(value = "用户签名")
    private String signature;

    @ApiModelProperty(value = "用户位置")
    private String location;

    @ApiModelProperty(value = "用户通信地址")
    private String address;

    @ApiModelProperty(value = "备注")
    private String remark;


}
