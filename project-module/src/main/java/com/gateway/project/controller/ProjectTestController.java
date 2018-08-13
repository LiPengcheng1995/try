/**
 * @author: lipengcheng3
 * @create: 2018-08-09 20:57
 **/

package com.gateway.project.controller;

import com.gateway.common.code.CodePool;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/projectTestController")
public class ProjectTestController {

    @Resource
    private CodePool codePool;
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "accept";
    }
}
