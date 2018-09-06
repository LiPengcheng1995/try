package com.gateway.project.controller;

import com.gateway.common.web.domain.Response;
import com.gateway.project.domain.Blog;
import com.gateway.project.repository.BlogRepository;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: lipengcheng3
 * @create: 2018-09-06 15:01
 * @description:
 **/
@Api(value = "/api/project/blog", description = "博客信息相关接口", tags = "blog")
@Controller
@RequestMapping(value = "/api/project/blog")
@ResponseBody
public class BlogController {

    @Resource
    private BlogRepository blogRepository;

    @RequestMapping(value = "/user/name/{name}", method = RequestMethod.GET)
    public Response<List<Blog>> getUsersByNameOrOrderByIdAsc(@PathVariable("name") String name) {
        Response<List<Blog>> response = new Response<>();
        response.setCode(10000);
        response.setMessage("SUCCESS");
        response.setData(blogRepository.getAllByUser_Name(name));
        return response;
    }
}
