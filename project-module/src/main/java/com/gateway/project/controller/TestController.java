/**
 * @author: lipengcheng3
 * @create: 2018-08-09 20:57
 **/

package com.gateway.project.controller;

import com.gateway.a.config.ServiceACodes;
import com.gateway.b.config.ServiceBCodes;
import com.gateway.project.config.TestConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller(value = "projectTestController")
@Api(value = "/api/project/testController", description = "项目coltroller", tags = "projectController")
@RequestMapping(value = "/api/project/testController")
@ResponseBody
public class TestController {

    @Resource
    private ServiceACodes serviceACodes;

    @Resource
    private ServiceBCodes serviceBCodes;

    @Resource
    private TestConfig testConfig;

    @ApiOperation("测试接口")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return testConfig.toString();
    }
}
