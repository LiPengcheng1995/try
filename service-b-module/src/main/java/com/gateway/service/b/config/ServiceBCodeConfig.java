/**
 * @author: lipengcheng3
 * @create: 2018-08-10 16:10
 **/

package com.gateway.service.b.config;

import com.gateway.common.code.CodePool;
import com.gateway.common.domain.ResultCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "app.config.serviceBCodeConfig")
public class ServiceBCodeConfig {

    private Map<String, String> ServiceBCodePoolMap;

    @Resource
    private CodePool codePool;

    public Map<String, String> getServiceBCodePoolMap() {
        return ServiceBCodePoolMap;
    }

    public void setServiceBCodePoolMap(Map<String, String> serviceBCodePoolMap) {
        this.ServiceBCodePoolMap = serviceBCodePoolMap;
    }

    public CodePool getCodePool() {
        return codePool;
    }

    public void setCodePool(CodePool codePool) {
        this.codePool = codePool;
    }

    public Map<String, ResultCode> getResultCodeMap() {
        return codePool.getResultCodeMapByPool(ServiceBCodePoolMap);
    }
}
