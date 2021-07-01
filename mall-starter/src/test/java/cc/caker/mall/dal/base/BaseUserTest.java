package cc.caker.mall.dal.base;

import cc.caker.mall.dal.base.dao.BaseUserDAO;
import cc.caker.mall.dal.base.dataobject.BaseUserDO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * BaseUserTest
 *
 * @author cakeralter
 * @date 2021/7/1
 * @since 1.0
 */
@SpringBootTest
public class BaseUserTest {

    @Autowired
    private BaseUserDAO baseUserDAO;

    @Test
    public void testInsert() {
        BaseUserDO baseUserDO = baseUserDAO.getById(1L);
        System.out.println(baseUserDO);
    }
}
