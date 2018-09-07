package com.gateway.project.config.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
 * @create: 2018-09-06 15:27
 * @description:
 **/
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "entityManagerFactoryPersonnel",
        transactionManagerRef = "transactionManagerPersonnel",
        basePackages = {"com.gateway.project.repository.personnel"})//设置dao（repo）所在位置
public class PersonnelDatabaseConfig {

    @Autowired
    private JpaProperties jpaProperties;

    @Resource
    private EntityManagerFactoryBuilder entityManagerFactoryBuilder;

    @Resource
    private DataSource personnelDataSource;


    @Bean(name = "entityManagerPersonnel")
    public EntityManager entityManager(@Qualifier("entityManagerFactoryPersonnel") LocalContainerEntityManagerFactoryBean entityManagerFactoryPersonnel) {
        return entityManagerFactoryPersonnel.getObject().createEntityManager();
    }

    @Bean(name = "entityManagerFactoryPersonnel")
    @Primary
    @Qualifier("entityManagerFactoryPersonnel")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryPersonnel() {
        return entityManagerFactoryBuilder
                .dataSource(personnelDataSource)
                .properties(getVendorProperties(personnelDataSource))
                .packages("com.gateway.project.domain") //设置实体类所在位置
                .persistenceUnit("personnelPersistenceUnit")
                .build();
    }

    private Map<String, String> getVendorProperties(DataSource dataSource) {
        return jpaProperties.getHibernateProperties(dataSource);
    }

    @Bean(name = "transactionManagerPersonnel")
    PlatformTransactionManager transactionManagerPersonnel() {
        return new JpaTransactionManager(this.entityManagerFactoryPersonnel().getObject());
    }
}