package cc.caker.mall.dal;

import cc.caker.mall.dal.base.mapper.BaseUserMapper;
import cc.caker.mall.dal.base.po.BaseUser;
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
    private BaseUserMapper baseUserMapper;

    @Test
    public void testInsert() {
        BaseUser baseUser = new BaseUser();
        baseUser.setGmtCreate(LocalDateTime.now());
        baseUser.setGmtModify(LocalDateTime.now());
        baseUser.setCreator(0L);
        baseUser.setModifier(0L);
//        baseUser.setIsDeleted();
        baseUser.setUid("10001");
        baseUser.setUserName("测试账号");
        baseUser.setNickName("测试账号");
//        baseUser.setPassword("");
//        baseUser.setEmail();
//        baseUser.setAvatar();
//        baseUser.setPhone();
//        baseUser.setStatus();
        baseUser.setSex("M");
//        baseUser.setBirthday();
//        baseUser.setSignature();
//        baseUser.setLocation();
//        baseUser.setAddress();
//        baseUser.setRemark();
        baseUserMapper.insert(baseUser);
    }
}
