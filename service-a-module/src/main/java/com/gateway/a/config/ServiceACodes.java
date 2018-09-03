package com.gateway.a.config;

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
public class ServiceACodes {
    private Map<String, ResultCode> serviceACodes;

    public Map<String, ResultCode> getServiceACodes() {
        return serviceACodes;
    }

    public void setServiceACodes(Map<String, ResultCode> serviceACodes) {
        this.serviceACodes = serviceACodes;
    }
}
