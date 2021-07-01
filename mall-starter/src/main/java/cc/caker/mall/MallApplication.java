package cc.caker.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * MallApplication
 *
 * @author cakeralter
 * @date 2021/6/28
 * @since 1.0
 */
@MapperScan("cc.caker.mall.dal.*.mapper")
@SpringBootApplication
public class MallApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallApplication.class, args);
    }
}
