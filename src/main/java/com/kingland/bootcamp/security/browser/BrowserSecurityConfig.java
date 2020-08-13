/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.security.browser;

import com.kingland.bootcamp.common.SecurityConst;
import com.kingland.bootcamp.handler.MyAuthenticationFailureHandler;
import com.kingland.bootcamp.handler.MyAuthenticationSuccessHandler;
import com.kingland.bootcamp.security.password.BootcampPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author KSC
<<<<<<< HEAD
=======
 *
>>>>>>> dev_branch
 */
@Configuration
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private MyAuthenticationSuccessHandler authenticationSucessHandler;

    @Autowired
    private MyAuthenticationFailureHandler authenticationFailureHandler;

<<<<<<< HEAD
    @Bean
    public BootcampPasswordEncoder bootcampPasswordEncoder() {
        return new BootcampPasswordEncoder();
    }

    /**
     * config the account login
     * @param http
     * @throws Exception
     */
=======

    @Bean
    public BootcampPasswordEncoder bootcampPasswordEncoder(){

        return new BootcampPasswordEncoder();
    }

>>>>>>> dev_branch
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //Form login
        http.formLogin()
<<<<<<< HEAD
=======

>>>>>>> dev_branch
                // Login Jump URL
                .loginPage(SecurityConst.AUTH_REQUIRE)
                // Processing form login URL
                .loginProcessingUrl(SecurityConst.AUTH_FORM)
                // Successfully processed login
                .successHandler(authenticationSucessHandler)
                // Handle login failure
                .failureHandler(authenticationFailureHandler)
                .and()
                // Authorization configuration
                .authorizeRequests()
                //Login redirect URL without authentication
<<<<<<< HEAD
                .antMatchers(SecurityConst.AUTH_REQUIRE, "/login.html").permitAll()
=======
                .antMatchers(SecurityConst.AUTH_REQUIRE, "/login.html","/register.html").permitAll()
>>>>>>> dev_branch
                // All requests
                .anyRequest()
                // All need certification
                .authenticated()
                .and().csrf().disable();
    }

}
