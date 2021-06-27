package cc.caker.mall.application.base;

import cc.caker.mall.dal.base.mapper.BaseUserDOMapper;
import cc.caker.mall.dal.base.po.BaseUserDO;
import cc.caker.mall.web.base.convert.BaseUserConvert;
import cc.caker.mall.web.base.vo.BaseUserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    private BaseUserDOMapper baseUserDOMapper;

    /**
     * saveOrUpdate
     *
     * @param baseUserVO
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public Integer saveOrUpdate(BaseUserVO baseUserVO) {
        BaseUserDO entity = BaseUserConvert.v2d(baseUserVO);
        BaseDOHelper.setBaseForCreate(entity);
        baseUserDOMapper.insert(entity);
        return 0;
    }
}
