package cc.caker.mall.dal.ums.dataobject;

import java.time.LocalDateTime;

/**
 * The table 角色表
 */
public class RoleDO {

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
     * name 角色名.
     */
    private String name;
    /**
     * remark 备注.
     */
    private String remark;
    /**
     * status 角色状态.
     */
    private String status;
    /**
     * isDeleted 是否删除Y/N.
     */
    private String isDeleted;
    /**
     * sort 角色排序.
     */
    private Integer sort;
    /**
     * gmtCreate 创建时间.
     */
    private LocalDateTime gmtCreate;
    /**
     * gmtModify 更新时间.
     */
    private LocalDateTime gmtModify;

    /**
     * Get id 主键.
     *
     * @return the string
     */
    public Long getId() {
        return id;
    }

    /**
     * Set id 主键.
     */
    public void setId(Long id) {
        this.id = id;
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
     * Set creator 创建人id.
     */
    public void setCreator(Long creator) {
        this.creator = creator;
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
     * Set modifier 修改人.
     */
    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    /**
     * Get name 角色名.
     *
     * @return the string
     */
    public String getName() {
        return name;
    }

    /**
     * Set name 角色名.
     */
    public void setName(String name) {
        this.name = name;
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
     * Set remark 备注.
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Get status 角色状态.
     *
     * @return the string
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set status 角色状态.
     */
    public void setStatus(String status) {
        this.status = status;
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
     * Set isDeleted 是否删除Y/N.
     */
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * Get sort 角色排序.
     *
     * @return the string
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * Set sort 角色排序.
     */
    public void setSort(Integer sort) {
        this.sort = sort;
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
     * Set gmtCreate 创建时间.
     */
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * Get gmtModify 更新时间.
     *
     * @return the string
     */
    public LocalDateTime getGmtModify() {
        return gmtModify;
    }

    /**
     * Set gmtModify 更新时间.
     */
    public void setGmtModify(LocalDateTime gmtModify) {
        this.gmtModify = gmtModify;
    }
}
