/**
 * @author: lipengcheng3
 * @create: 2018-08-10 16:07
 **/

package com.gateway.service.a.controller;

import com.gateway.service.a.jsfBack.ServiceAConsumer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/serviceATestController")
public class ServiceATestController {

    @Resource
    private ServiceAConsumer serviceAConsumer;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
//        YamlPropertiesFactoryBean
        return "accept: " + serviceAConsumer.doServiceA();
    }
}
