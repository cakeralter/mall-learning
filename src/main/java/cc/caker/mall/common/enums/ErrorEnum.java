package cc.caker.mall.common.enums;

import cc.caker.mall.common.interfaces.CommonEnumInterface;
import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * ErrorEnum
 *
 * @author cakeralter
 * @date 2021/6/27
 * @since 1.0
 */
@AllArgsConstructor
public enum ErrorEnum implements CommonEnumInterface<String> {
    ERROR_404("error_404", "资源不存在"),
    ERROR_500("error_500", "系统服务错误");

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

    private static final Map<String, ErrorEnum> MAP =
            Arrays.stream(values()).collect(Collectors.toMap(ErrorEnum::code, Function.identity()));

    public static ErrorEnum of(String code) {
        return MAP.get(code);
    }
}
