package com.gateway.project.config.database;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author: lipengcheng3
 * @create: 2018-09-06 19:51
 * @description:
 **/
@Component
public class DataSourceConfiguration {
    @Bean(name = "personnelDataSource")
    @ConfigurationProperties("spring.datasource.personnel")
    @Primary
    public DataSource personnelDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "venderDataSource")
    @ConfigurationProperties("spring.datasource.vender")
    public DataSource venderDataSource() {
        return DataSourceBuilder.create().build();
    }
}
