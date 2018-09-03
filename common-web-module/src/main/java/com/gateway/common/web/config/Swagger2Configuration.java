package com.gateway.common.web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Profile({"development", "pre-release"})
public class Swagger2Configuration {

    @Value("${app.name:project}")
    private String appName;

    @Value("${app.title:title}")
    private String appTitle;

    @Value("${app.description:description}")
    private String appDescription;

    @Value("${app.domain:www.jd.com}")
    private String appDomain;

    @Value("${swagger.pathRegex:/.*}")
    private String swaggerPathRegex;

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.regex(swaggerPathRegex))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(appTitle)
                .description(appDescription)
                .version("1.0")
                .termsOfServiceUrl(String.format("http://%s", appDomain))
                .license("LICENSE")
                .licenseUrl("http://www.jd.com")
                .build();
    }

}