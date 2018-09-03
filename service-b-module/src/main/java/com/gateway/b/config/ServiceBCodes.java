package com.gateway.b.config;

import com.gateway.common.web.domain.ResultCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author: lipengcheng3
 * @create: 2018-08-30 14:14
 * @description:
 **/
@Component
@ConfigurationProperties(prefix = "app.config.resultCodes")
public class ServiceBCodes {
    private Map<String, ResultCode> serviceBCodes;

    public Map<String, ResultCode> getServiceBCodes() {
        return serviceBCodes;
    }

    public void setServiceBCodes(Map<String, ResultCode> serviceBCodes) {
        this.serviceBCodes = serviceBCodes;
    }
}
