package com.learning.spring.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import javax.sql.DataSource;

/**
 * Created by rin9790 on 4/01/18.
 */
@Configuration
public class InfraStructureConfig {

   /* @Bean
    @Qualifier("bDataSource")
    public DataSource dataSource(){
        return new DriverManagerDataSource();
    }*/
}
