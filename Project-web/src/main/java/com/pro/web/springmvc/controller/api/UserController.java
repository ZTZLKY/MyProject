package com.pro.web.springmvc.controller.api;

import com.entity.UserEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation. RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController//接口注解
@Api(value = "用户接口", tags = {"User  Api"})//接口简要标注，对中文的支持不太好
@RequestMapping(value = "/user/info")//接口基本路径
public class UserController {
    //接口需要的参数，可以有多个，这里只写了一个，它的paramType还有path、query、body、form几种，
    //接口功能描述
    @ApiOperation(value = "获取用户")
    @RequestMapping(value="/oneUser", method = RequestMethod.GET)
    public UserEntity query() {

        return new UserEntity("23","32");
    }

}
