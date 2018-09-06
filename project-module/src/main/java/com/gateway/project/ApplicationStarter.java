/**
 * @author: lipengcheng3
 * @create: 2018-08-09 20:53
 **/

package com.gateway.project;


import com.gateway.a.AConfig;
import com.gateway.b.BConfig;
import com.gateway.common.CommonConfig;
import com.gateway.common.web.CommonWebConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan({
        "com.gateway.project.controller",
        "com.gateway.project.config"
}
)
@Import({
        CommonConfig.class,
        CommonWebConfiguration.class,
        AConfig.class,
        BConfig.class
})
public class ApplicationStarter {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationStarter.class, args);
//        JpaBaseConfiguration

    }
}
