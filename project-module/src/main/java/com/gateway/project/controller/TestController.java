/**
 * @author: lipengcheng3
 * @create: 2018-08-09 20:57
 **/

package com.gateway.project.controller;

import com.gateway.project.config.TestConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller(value = "projectTestController")
@RequestMapping(value = "/api/project/testController")
@ResponseBody
public class TestController {


    @Resource
    private TestConfig testConfig;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return testConfig.toString();
    }
}
