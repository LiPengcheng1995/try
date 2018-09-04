/**
 * @author: lipengcheng3
 * @create: 2018-08-10 16:07
 **/

package com.gateway.a.controller;

import com.gateway.a.jsfBack.ServiceAConsumer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@Api(value = "/api/serviceATestController",description = "A组件coltroller",tags = "serviceAController")
@RequestMapping(value = "/api/serviceATestController")
public class ServiceATestController {

    @Resource
    private ServiceAConsumer serviceAConsumer;

    @ApiOperation("测试接口")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "accept: " + serviceAConsumer.doServiceA();
    }
}
