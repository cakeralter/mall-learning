package cc.caker.mall.dal;

import cc.caker.mall.dal.base.mapper.BaseUserDOMapper;
import cc.caker.mall.dal.base.po.BaseUserDO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

/**
 * @author cakeralter
 * @date 2021/6/26
 * @since 1.0
 */
@SpringBootTest
public class BaseUserTest {

    @Autowired
    private BaseUserDOMapper baseUserDOMapper;

    @Test
    public void testInsert() {
        BaseUserDO baseUserDO = new BaseUserDO();
        baseUserDO.setGmtCreate(LocalDateTime.now());
        baseUserDO.setGmtModify(LocalDateTime.now());
        baseUserDO.setCreator(0L);
        baseUserDO.setModifier(0L);
//        baseUser.setIsDeleted();
        baseUserDO.setUid("10001");
        baseUserDO.setUserName("测试账号");
        baseUserDO.setNickName("测试账号");
//        baseUser.setPassword("");
//        baseUser.setEmail();
//        baseUser.setAvatar();
//        baseUser.setPhone();
//        baseUser.setStatus();
        baseUserDO.setSex("M");
//        baseUser.setBirthday();
//        baseUser.setSignature();
//        baseUser.setLocation();
//        baseUser.setAddress();
//        baseUser.setRemark();
        baseUserDOMapper.insert(baseUserDO);
    }
}
