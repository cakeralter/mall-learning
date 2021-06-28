package cc.caker.mall.dal.base.po;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * BaseDO
 *
 * @author cakeralter
 * @date 2021/6/27
 * @since 1.0
 */
@Data
public class BaseDO implements Serializable {

    private static final long serialVersionUID = -7394979219316495732L;
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
     * 创建人
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
}
