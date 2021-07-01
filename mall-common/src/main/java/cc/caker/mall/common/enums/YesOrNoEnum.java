package cc.caker.mall.common.enums;

import cc.caker.mall.common.interfaces.CommonEnumInterface;
import lombok.AllArgsConstructor;

/**
 * YesOrNoEnum
 *
 * @author cakeralter
 * @date 2021/6/27
 * @since 1.0
 */
@AllArgsConstructor
public enum YesOrNoEnum implements CommonEnumInterface<String> {
    YES("Y", "是"),
    NO("N", "否");

    private final String code;
    private final String desc;

    @Override
    public String code() {
        return code;
    }

    @Override
    public String desc() {
        return desc;
    }
}
