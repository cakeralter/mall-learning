package cc.caker.mall.application.base;

import cc.caker.mall.dal.base.mapper.BaseUserMapper;
import cc.caker.mall.dal.base.po.BaseUser;
import cc.caker.mall.web.base.convert.BaseUserConvert;
import cc.caker.mall.web.base.vo.BaseUserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BaseUserApplication
 *
 * @author cakeralter
 * @date 2021/6/27
 * @since 1.0
 */
@Slf4j
@Service
public class BaseUserApplication {

    @Autowired
    private BaseUserMapper baseUserMapper;

    /**
     * saveOrUpdate
     *
     * @param baseUserVO
     * @return
     */
    public Integer saveOrUpdate(BaseUserVO baseUserVO) {
        BaseUser entity = BaseUserConvert.v2d(baseUserVO);
        BaseDOHelper.setBaseForCreate(entity);
        baseUserMapper.insert(entity);
        return 0;
    }
}
