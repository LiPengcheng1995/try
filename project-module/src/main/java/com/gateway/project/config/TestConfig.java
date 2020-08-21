package com.gateway.project.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * creat_user: lipengcheng
 * creat_date: 2018/2/7 T 18:21
 **/
@Component
@ConfigurationProperties(prefix = "hehe")
public class TestConfig {

    private Map<String,Map<String,Project>> group;

    public Map<String,Map<String,Project>> getGroup() {
        return group;
    }

    public void setGroup(Map<String,Map<String,Project>> group) {
        this.group = group;
    }
}
