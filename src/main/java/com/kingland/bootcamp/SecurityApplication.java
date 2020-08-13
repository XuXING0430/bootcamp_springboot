/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

<<<<<<< HEAD
/**
 * Spring boot init class
 *
 * @author KSC
=======
import javax.annotation.PostConstruct;
/**
 * @author KSC
 *
>>>>>>> dev_branch
 */
@SpringBootApplication
@MapperScan("com.kingland.bootcamp.mapper")
public class SecurityApplication {
<<<<<<< HEAD
    public static void main(String[] args) {
=======

    public static void main(String[] args) {

>>>>>>> dev_branch
        SpringApplication.run(SecurityApplication.class, args);
    }
}
