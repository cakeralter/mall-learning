package cc.caker.mall.application.base;

import cc.caker.mall.common.constant.MallConstants;
import cc.caker.mall.common.enums.YesOrNoEnum;
import cc.caker.mall.dal.base.po.BaseDO;

import java.time.LocalDateTime;

/**
 * BaseDOHelper
 *
 * @author cakeralter
 * @date 2021/6/27
 * @since 1.0
 */
public class BaseDOHelper {

    /**
     * setBaseForCreate
     *
     * @param baseDO
     */
    public static void setBaseForCreate(BaseDO baseDO) {
        if (baseDO == null) {
            return;
        }
        if (baseDO.getGmtModify() == null) {
            baseDO.setGmtCreate(LocalDateTime.now());
        }
        baseDO.setGmtModify(baseDO.getGmtCreate());
        if (baseDO.getCreator() == null) {
            baseDO.setCreator(MallConstants.SYSTEM_OPERATOR_ID);
        }
        baseDO.setModifier(baseDO.getCreator());
        baseDO.setIsDeleted(YesOrNoEnum.NO.code());
    }

    /**
     * setBaseForUpdate
     *
     * @param baseDO
     */
    public static void setBaseForUpdate(BaseDO baseDO) {
        if (baseDO == null) {
            return;
        }
        if (baseDO.getGmtModify() == null) {
            baseDO.setGmtModify(LocalDateTime.now());
        }
        if (baseDO.getModifier() == null) {
            baseDO.setModifier(MallConstants.SYSTEM_OPERATOR_ID);
        }
    }
}
