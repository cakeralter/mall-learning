package cc.caker.mall.common.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * BusinessException
 *
 * @author cakeralter
 * @date 2021/6/27
 * @since 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessException extends RuntimeException {

    private String errorCode;
    private String errorMsg;

    public BusinessException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public BusinessException(String errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
