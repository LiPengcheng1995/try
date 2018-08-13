/**
 * @author: lipengcheng3
 * @create: 2018-08-09 21:14
 **/

package com.gateway.service.b.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan({
        "com.gateway.service.b.controller",
        "com.gateway.service.b.service"
})
@ImportResource("classpath:spring-config-jsf-service-b.xml")
public class BConfig {
}
