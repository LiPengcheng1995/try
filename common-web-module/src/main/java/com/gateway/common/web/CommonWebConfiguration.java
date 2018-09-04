package com.gateway.common.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: lipengcheng3
 * @create: 2018-09-03 17:35
 * @description:
 **/
@Configuration
@ComponentScan({
        "com.gateway.common.web.config"
})
public class CommonWebConfiguration {
}
