package com.swat018;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
//        SpringApplication.run(Application.class, args);
    }

   @Bean
    public Holoman holoman1() {
        Holoman holoman = new Holoman();
        holoman.setName("jinwoo");
        holoman.setHowLong(60);
        return holoman;
    }

}
