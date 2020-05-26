package com.swat018;

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
    @Autowired
    JinwooProperties jinwooProperties;

    @Autowired
    private String hello;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("============================");
        System.out.println(hello);
        System.out.println(jinwooProperties.getName());
        System.out.println(jinwooProperties.getFullName());
/*        System.out.println(jinwooProperties.getAge());
        System.out.println(jinwooProperties.getSessionTimeout());*/
        System.out.println("============================");
    }
}
