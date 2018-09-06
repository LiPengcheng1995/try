package com.gateway.project.controller;

import com.gateway.common.web.domain.Paging;
import com.gateway.common.web.domain.Response;
import com.gateway.project.domain.User;
import com.gateway.project.repository.UserRepository;
import io.swagger.annotations.Api;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import java.util.List;

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
    private UserRepository userRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Response<User> getUserById(@PathVariable("id") @NotNull Integer id) {
        Response<User> response = new Response<>();
        response.setCode(10000);
        response.setMessage("SUCCESS");
        response.setData(userRepository.findOne(id));
        return response;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Response<List<User>> getAllUsers() {
        Response<List<User>> response = new Response<>();
        response.setCode(10000);
        response.setMessage("SUCCESS");
        response.setData(userRepository.findAll());
        return response;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Response<User> addUser(User user) {
        Response<User> response = new Response<>();
        response.setCode(10000);
        response.setMessage("SUCCESS");
        response.setData(userRepository.save(user));
        return response;
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public Response<Page<User>> getAllUsersByPage(Paging paging) {
        Response<Page<User>> response = new Response<>();
        response.setCode(10000);
        response.setMessage("SUCCESS");
        response.setData(userRepository.findAll(new PageRequest(paging.getPage(), paging.getPageSize())));
        return response;
    }

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public Response<List<User>> getUsersByNameOrOrderByIdAsc(@PathVariable("name") String name) {
        Response<List<User>> response = new Response<>();
        response.setCode(10000);
        response.setMessage("SUCCESS");
        response.setData(userRepository.getByNameOrderByIdAsc(name));
        return response;
    }
}