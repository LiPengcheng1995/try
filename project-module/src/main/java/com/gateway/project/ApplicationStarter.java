/**
 * @author: lipengcheng3
 * @create: 2018-08-09 20:53
 **/

package com.gateway.project;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan({
        "com.gateway.project.controller",
        "com.gateway.project.config"
}
)
//@Import({
//        CommonConfig.class,
//        CommonWebConfiguration.class,
//        AConfig.class,
//        BConfig.class
//})
//@MapperScan("com.gateway.project.mapper")
public class ApplicationStarter {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationStarter.class, args);
    }
}
