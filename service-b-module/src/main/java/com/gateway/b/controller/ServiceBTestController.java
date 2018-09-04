/**
 * @author: lipengcheng3
 * @create: 2018-08-10 16:07
 **/

package com.gateway.b.controller;

import com.gateway.b.jsfBack.ServiceBConsumer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@Api(value = "/api/serviceBTestController",description = "B组件coltroller",tags = "serviceBController")
@RequestMapping(value = "/api/serviceBTestController")
public class ServiceBTestController {

    @Resource
    private ServiceBConsumer serviceAConsumer;

    @ApiOperation("测试接口")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "accept: " + serviceAConsumer.doServiceB();
    }
}
