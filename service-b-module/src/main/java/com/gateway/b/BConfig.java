/**
 * @author: lipengcheng3
 * @create: 2018-08-09 21:14
 **/

package com.gateway.b;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan({
        "com.gateway.b.controller",
        "com.gateway.b.service",
        "com.gateway.b.config"
})
@ImportResource("classpath:spring-config-jsf-service-b.xml")
public class BConfig {
}
