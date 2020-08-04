/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author KSC
 *
 * Init springboot
 */
@SpringBootApplication
@MapperScan("com.kingland.bootcamp.dao")
public class Application {

    public static void main(String[] args) {
        //init program
        SpringApplication.run(Application.class,args);
    }
}
