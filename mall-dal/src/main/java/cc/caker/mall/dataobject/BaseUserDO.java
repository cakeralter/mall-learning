package cc.caker.mall.dataobject;

import java.time.LocalDateTime;

/**
 * The table 用户表
 */
public class BaseUserDO {

    /**
     * id 主键.
     */
    private Long id;
    /**
     * creator 创建人id.
     */
    private Long creator;
    /**
     * modifier 修改人.
     */
    private Long modifier;
    /**
     * sex 用户性别F/M.
     */
    private String sex;
    /**
     * uid 用户uid.
     */
    private String uid;
    /**
     * email 用户邮箱.
     */
    private String email;
    /**
     * phone 手机号码.
     */
    private String phone;
    /**
     * avatar 用户头像.
     */
    private String avatar;
    /**
     * remark 备注.
     */
    private String remark;
    /**
     * status 账号状态.
     */
    private String status;
    /**
     * address 用户通信地址.
     */
    private String address;
    /**
     * location 用户位置.
     */
    private String location;
    /**
     * nickName 昵称.
     */
    private String nickName;
    /**
     * password 用户登陆密码.
     */
    private String password;
    /**
     * userName 用户名.
     */
    private String userName;
    /**
     * isDeleted 是否删除Y/N.
     */
    private String isDeleted;
    /**
     * signature 用户签名.
     */
    private String signature;
    /**
     * birthday 用户生日.
     */
    private LocalDateTime birthday;
    /**
     * gmtCreate 创建时间.
     */
    private LocalDateTime gmtCreate;
    /**
     * gmtModify 更新时间.
     */
    private LocalDateTime gmtModify;

    /**
     * Set id 主键.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get id 主键.
     *
     * @return the string
     */
    public Long getId() {
        return id;
    }

    /**
     * Set creator 创建人id.
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * Get creator 创建人id.
     *
     * @return the string
     */
    public Long getCreator() {
        return creator;
    }

    /**
     * Set modifier 修改人.
     */
    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    /**
     * Get modifier 修改人.
     *
     * @return the string
     */
    public Long getModifier() {
        return modifier;
    }

    /**
     * Set sex 用户性别F/M.
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Get sex 用户性别F/M.
     *
     * @return the string
     */
    public String getSex() {
        return sex;
    }

    /**
     * Set uid 用户uid.
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Get uid 用户uid.
     *
     * @return the string
     */
    public String getUid() {
        return uid;
    }

    /**
     * Set email 用户邮箱.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get email 用户邮箱.
     *
     * @return the string
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set phone 手机号码.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Get phone 手机号码.
     *
     * @return the string
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set avatar 用户头像.
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * Get avatar 用户头像.
     *
     * @return the string
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Set remark 备注.
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Get remark 备注.
     *
     * @return the string
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Set status 账号状态.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Get status 账号状态.
     *
     * @return the string
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set address 用户通信地址.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get address 用户通信地址.
     *
     * @return the string
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set location 用户位置.
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Get location 用户位置.
     *
     * @return the string
     */
    public String getLocation() {
        return location;
    }

    /**
     * Set nickName 昵称.
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * Get nickName 昵称.
     *
     * @return the string
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Set password 用户登陆密码.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get password 用户登陆密码.
     *
     * @return the string
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set userName 用户名.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Get userName 用户名.
     *
     * @return the string
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Set isDeleted 是否删除Y/N.
     */
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * Get isDeleted 是否删除Y/N.
     *
     * @return the string
     */
    public String getIsDeleted() {
        return isDeleted;
    }

    /**
     * Set signature 用户签名.
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * Get signature 用户签名.
     *
     * @return the string
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Set birthday 用户生日.
     */
    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    /**
     * Get birthday 用户生日.
     *
     * @return the string
     */
    public LocalDateTime getBirthday() {
        return birthday;
    }

    /**
     * Set gmtCreate 创建时间.
     */
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * Get gmtCreate 创建时间.
     *
     * @return the string
     */
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    /**
     * Set gmtModify 更新时间.
     */
    public void setGmtModify(LocalDateTime gmtModify) {
        this.gmtModify = gmtModify;
    }

    /**
     * Get gmtModify 更新时间.
     *
     * @return the string
     */
    public LocalDateTime getGmtModify() {
        return gmtModify;
    }
}
