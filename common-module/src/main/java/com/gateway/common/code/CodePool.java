/**
 * @author: lipengcheng3
 * @create: 2018-08-09 21:13
 **/

package com.gateway.common.code;

import com.gateway.common.domain.ResultCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "app.config.ResultCodePool")
public class CodePool {
    private List<ResultCode> commonPool;

    private List<ResultCode> projectPool;

    public List<ResultCode> getProjectPool() {
        return projectPool;
    }

    public void setProjectPool(List<ResultCode> projectPool) {
        this.projectPool = projectPool;
    }


    public List<ResultCode> getCommonPool() {
        return commonPool;
    }

    public void setCommonPool(List<ResultCode> commonPool) {
        this.commonPool = commonPool;
    }

    public Map<String, ResultCode> getResultCodeMapByPool(Map<String, String> codeMap) {
        Map<String, ResultCode> resultCodeMap = new HashMap<>();

        Map<String, ResultCode> tempCodeMap = new HashMap<>();
        for (ResultCode code : commonPool) {
            tempCodeMap.put(code.getCode(), code);
        }
        for (ResultCode code : projectPool) {
            tempCodeMap.put(code.getCode(), code);
        }

        for (String neededCode : codeMap.keySet()) {
            resultCodeMap.put(neededCode, tempCodeMap.get(codeMap.get(neededCode)));
        }
        return resultCodeMap;
    }
}
