package com.gateway.project.controller;

import com.gateway.common.web.domain.Response;
import com.gateway.project.domain.vender.Vender;
import com.gateway.project.repository.vender.VenderRepository;
import io.swagger.annotations.Api;
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
 * @create: 2018-09-06 17:45
 * @description:
 **/
@Api(value = "/api/project/vender", description = "商品信息相关接口", tags = "vender")
@Controller
@RequestMapping(value = "/api/project/vender")
@ResponseBody
public class VenderController {

    @Resource
    private VenderRepository venderRepository;

    @RequestMapping(value = "/{sku}", method = RequestMethod.GET)
    public Response<Vender> getUserById(@PathVariable("sku") @NotNull Integer sku) {
        Response<Vender> response = new Response<>();
        response.setCode(10000);
        response.setMessage("SUCCESS");
        response.setData(venderRepository.findOne(sku));
        return response;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Response<List<Vender>> getAllVenders() {
        Response<List<Vender>> response = new Response<>();
        response.setCode(10000);
        response.setMessage("SUCCESS");
        response.setData(venderRepository.findAll());
        return response;
    }
}
