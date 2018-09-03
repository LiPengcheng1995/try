/**
 * @author: lipengcheng3
 * @create: 2018-08-09 21:14
 **/

package com.gateway.a;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan({
        "com.gateway.a.controller",
        "com.gateway.a.service",
        "com.gateway.a.config"
})
@ImportResource("classpath:spring-config-jsf-service-a.xml")
public class AConfig {
}
