/**
 * @author: lipengcheng3
 * @create: 2018-08-10 16:07
 **/

package com.gateway.service.b.controller;

import com.gateway.service.b.jsfBack.ServiceBConsumer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/serviceBTestController")
public class ServiceBTestController {

    @Resource
    private ServiceBConsumer serviceAConsumer;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "accept: "+ serviceAConsumer.doServiceB();
    }
}
