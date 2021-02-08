package com.jpr.hardwares.cart.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:${app.home}/application.yml", ignoreResourceNotFound=true)
public class AppConfig {

    @Autowired
    Environment env;
}

