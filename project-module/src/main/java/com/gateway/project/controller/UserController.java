package com.gateway.project.controller;

import com.gateway.common.web.domain.Response;
import com.gateway.project.domain.User;
import com.gateway.project.mapper.UserMapper;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;

/**
 * @author: lipengcheng3
 * @create: 2018-09-04 16:00
 * @description:
 **/
@Api(value = "/api/project/user", description = "用户信息相关接口", tags = "user")
@Controller
@RequestMapping(value = "/api/project/user")
@ResponseBody
public class UserController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Response<User> getUserById(@PathVariable("id") @NotNull Integer id) {
        Response<User> response = new Response<>();
        response.setCode(10000);
        response.setMessage("SUCCESS");
        response.setData(userMapper.getUserById(id));
        return response;
    }
}
