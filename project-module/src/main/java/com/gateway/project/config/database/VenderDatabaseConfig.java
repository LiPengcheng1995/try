package com.gateway.project.config.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;

/**
 * @author: lipengcheng3
 * @create: 2018-09-06 15:28
 * @description:
 **/

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "entityManagerFactoryVender",
        transactionManagerRef = "transactionManagerVender",
        basePackages = {"com.gateway.project.repository.vender"})//设置dao（repo）所在位置
public class VenderDatabaseConfig {

    @Autowired
    private JpaProperties jpaProperties;

    @Resource
    private EntityManagerFactoryBuilder entityManagerFactoryBuilder;

    @Resource
    private DataSource venderDataSource;


    @Bean(name = "entityManagerVender")
    public EntityManager entityManager(@Qualifier("entityManagerFactoryVender") LocalContainerEntityManagerFactoryBean entityManagerFactoryVender) {
        return entityManagerFactoryVender.getObject().createEntityManager();
    }

    @Bean(name = "entityManagerFactoryVender")
    @Qualifier("entityManagerFactoryVender")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryVender() {
        return entityManagerFactoryBuilder
                .dataSource(venderDataSource)
                .properties(getVendorProperties(venderDataSource))
                .packages("com.gateway.project.domain.vender") //设置实体类所在位置
                .persistenceUnit("venderPersistenceUnit")
                .build();
    }

    private Map<String, String> getVendorProperties(DataSource dataSource) {
        return jpaProperties.getHibernateProperties(dataSource);
    }

    @Bean(name = "transactionManagerVender")
    PlatformTransactionManager transactionManagerVender() {
        return new JpaTransactionManager(this.entityManagerFactoryVender().getObject());
    }
}
