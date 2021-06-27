package cc.caker.mall.component.advice;

import cc.caker.mall.common.exception.BusinessException;
import cc.caker.mall.common.model.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import static cc.caker.mall.common.enums.ErrorEnum.ERROR_500;

/**
 * ControllerAdvice
 *
 * @author cakeralter
 * @date 2021/6/27
 * @since 1.0
 */
@Slf4j
@RestController
@ControllerAdvice
public class GlobalControllerAdvice {

    @ExceptionHandler(BusinessException.class)
    public Result<?> handleBusinessException(BusinessException ex) {
        log.error("Business error: ex={}", ExceptionUtils.getFullStackTrace(ex));
        return Result.fail(ERROR_500.desc());
    }

    @ExceptionHandler(Exception.class)
    public Result<?> handleException(Exception ex) {
        log.error("System error: ex={}", ExceptionUtils.getFullStackTrace(ex));
        return Result.fail(ERROR_500.desc());
    }
}
