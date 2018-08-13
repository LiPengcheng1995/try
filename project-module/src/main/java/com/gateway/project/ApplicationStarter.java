/**
 * @author: lipengcheng3
 * @create: 2018-08-09 20:53
 **/

package com.gateway.project;


import com.gateway.common.config.CommonConfig;
import com.gateway.service.a.config.AConfig;
import com.gateway.service.b.config.BConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@ComponentScan({
        "com.gateway.project.controller",
        "com.gateway.project.config"
}
)
@Import({
        CommonConfig.class,
        AConfig.class,
        BConfig.class
})
public class ApplicationStarter {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationStarter.class, args);
    }
}
