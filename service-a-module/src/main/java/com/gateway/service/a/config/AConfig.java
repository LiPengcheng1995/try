/**
 * @author: lipengcheng3
 * @create: 2018-08-09 21:14
 **/

package com.gateway.service.a.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan({
        "com.gateway.service.a.controller",
        "com.gateway.service.a.service"
})
@ImportResource("classpath:spring-config-jsf-service-a.xml")
public class AConfig {
}
