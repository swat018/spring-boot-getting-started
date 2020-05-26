package com.swat018;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

/*
    @Value("${jinwoo.name}")
    private String name;

    @Value("${jinwoo.age}")
    private int age;
*/
    private Logger logger = LoggerFactory.getLogger(SampleRunner.class);

    @Autowired
    JinwooProperties jinwooProperties;

    @Autowired
    private String hello;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("==============================");
        logger.info(hello);
        logger.info(jinwooProperties.getName());
        logger.info(jinwooProperties.getFullName());
        logger.info("==============================");

    }
}
