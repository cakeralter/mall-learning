package cc.caker.mall.web.base.controller;

import cc.caker.mall.application.base.BaseUserApplication;
import cc.caker.mall.common.model.Result;
import cc.caker.mall.web.base.vo.BaseUserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cakeralter
 * @date 2021/6/27
 * @since 1.0
 */
@Api(tags = "BaseUserController")
@RequestMapping("/base/user")
@RestController
public class BaseUserController {

    @Autowired
    private BaseUserApplication baseUserApplication;

    /**
     * 新增用户
     *
     * @return
     */
    @ApiOperation("新增用户")
    @PostMapping
    public Result<Integer> save(@RequestBody BaseUserVO baseUserVO) {
        Integer result = baseUserApplication.saveOrUpdate(baseUserVO);
        return Result.success(result);
    }
}
