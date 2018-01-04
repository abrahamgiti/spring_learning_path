package com.learning.spring.config;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.learning.spring.game.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by rin9790 on 4/01/18.
 */
@Configuration
@ComponentScan(basePackages = "com.learning.spring")
@Import(InfraStructureConfig.class)
public class AppConfig {

/*
    @Autowired
    @Qualifier("bDataSource")
    private DataSource bDataSource;
*/

    //@Autowired
    //@Qualifier("redSocks")
    // or
    @Resource
    private Team redSocks;

    //@Autowired
    //@Qualifier("cubs")
    //or
    @Resource
    private Team cubs;


    @Bean
    public Game game(){
        BaseballGame baseballGame = new BaseballGame(redSocks, cubs);
        //baseballGame.setDataSource(bDataSource);
        return baseballGame;

    }






}
