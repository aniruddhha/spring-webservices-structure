/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.melayer.nileshsir.config;

import com.melayer.nileshsir.filter.MeFilterCors;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author aniruddha
 */
@Configuration
public class MeConfig {

    
    @Bean
    public FilterRegistrationBean corsFilterRegistrationBean() {

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

        MeFilterCors filterCors = new MeFilterCors();

        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setFilter(filterCors);

        return filterRegistrationBean;
    }
 
    @Bean
    public UndertowEmbeddedServletContainerFactory undertowServletContainerFactory(){
        
        UndertowEmbeddedServletContainerFactory factory = new UndertowEmbeddedServletContainerFactory();
        factory.setPort(5555);
        factory.setContextPath("/nileshsir");
        return factory;
    }
    
}

