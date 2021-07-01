package cc.caker.mall.common.model;

import lombok.Data;

/**
 * Result
 *
 * @author cakeralter
 * @date 2021/6/27
 * @since 1.0
 */
@Data
public class Result<T> {

    private Boolean successful;
    private String message;
    private T data;

    public Result(Boolean successful) {
        this.successful = successful;
    }

    public Result(Boolean successful, String message) {
        this(successful);
        this.message = message;
    }

    public Result(T data) {
        this(true);
        this.data = data;
    }

    public static <T> Result<T> success() {
        return new Result<>(true);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(data);
    }

    public static <T> Result<T> fail(String message) {
        return new Result<>(false, message);
    }
}
