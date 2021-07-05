package cc.caker.mall.dal.ums.dataobject;

import java.time.LocalDateTime;

/**
 * The table 资源表
 */
public class ResourceDO {

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
     * uri 资源uri.
     */
    private String uri;
    /**
     * code 资源code.
     */
    private String code;
    /**
     * icon 资源icon.
     */
    private String icon;
    /**
     * name 资源名.
     */
    private String name;
    /**
     * type 资源类型.
     */
    private String type;
    /**
     * remark 备注.
     */
    private String remark;
    /**
     * status 资源状态.
     */
    private String status;
    /**
     * isDeleted 是否删除Y/N.
     */
    private String isDeleted;
    /**
     * sort 资源排序.
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
     * Get uri 资源uri.
     *
     * @return the string
     */
    public String getUri() {
        return uri;
    }

    /**
     * Set uri 资源uri.
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Get code 资源code.
     *
     * @return the string
     */
    public String getCode() {
        return code;
    }

    /**
     * Set code 资源code.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Get icon 资源icon.
     *
     * @return the string
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Set icon 资源icon.
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * Get name 资源名.
     *
     * @return the string
     */
    public String getName() {
        return name;
    }

    /**
     * Set name 资源名.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get type 资源类型.
     *
     * @return the string
     */
    public String getType() {
        return type;
    }

    /**
     * Set type 资源类型.
     */
    public void setType(String type) {
        this.type = type;
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
     * Get status 资源状态.
     *
     * @return the string
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set status 资源状态.
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
     * Get sort 资源排序.
     *
     * @return the string
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * Set sort 资源排序.
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
