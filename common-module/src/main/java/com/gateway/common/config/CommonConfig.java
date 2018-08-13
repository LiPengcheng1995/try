/**
 * @author: lipengcheng3
 * @create: 2018-08-09 21:14
 **/

package com.gateway.common.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "com.gateway.common.code"
})
public class CommonConfig {
}
