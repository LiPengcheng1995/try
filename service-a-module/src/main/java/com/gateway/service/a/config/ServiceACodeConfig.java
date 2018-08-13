/**
 * @author: lipengcheng3
 * @create: 2018-08-10 16:10
 **/

package com.gateway.service.a.config;

import com.gateway.common.code.CodePool;
import com.gateway.common.domain.ResultCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "app.config.serviceACodeConfig")
public class ServiceACodeConfig {

    private Map<String, String> ServiceACodePoolMap;

    @Resource
    private CodePool codePool;

    public Map<String, String> getServiceACodePoolMap() {
        return ServiceACodePoolMap;
    }

    public void setServiceACodePoolMap(Map<String, String> serviceACodePoolMap) {
        this.ServiceACodePoolMap = serviceACodePoolMap;
    }

    public CodePool getCodePool() {
        return codePool;
    }

    public void setCodePool(CodePool codePool) {
        this.codePool = codePool;
    }

    public Map<String, ResultCode> getResultCodeMap() {
        return codePool.getResultCodeMapByPool(ServiceACodePoolMap);
    }
}
