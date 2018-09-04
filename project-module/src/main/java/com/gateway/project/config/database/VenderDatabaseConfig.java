package com.gateway.project.config.database;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author: lipengcheng3
 * @create: 2018-09-04 16:47
 * @description:
 **/
@Configuration
@MapperScan(basePackages = "com.gateway.project.mapper.vender", sqlSessionFactoryRef = "venderSqlSessionFactory")
public class VenderDatabaseConfig {
    @Bean(name = "venderDataSource")
    @ConfigurationProperties("spring.datasource.vender")
    public DataSource venderDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "venderSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("venderDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        return sessionFactoryBean.getObject();
    }
}
