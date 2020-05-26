package com.swat018.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("prod")
@Configuration
public class BeanConfiguration {
    @Bean
    public String hello() {
        return "hello";
    }
}
