package com.swat018;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.PrintStream;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
//        SpringApplication app = new SpringApplication(Application.class);
/*        app.setBanner((environment, sourceClass, out) -> {
            out.println("==================");
            out.println("swat018");
            out.println("==================");
        })*/;
//        app.setBannerMode(Banner.Mode.OFF);
        new SpringApplicationBuilder()
                .sources(Application.class)
                .run(args);
//        app.run(args);
//        SpringApplication.run(Application.class, args);
    }



 /*   @Bean
    public ServletWebServerFactory serverFactory() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addAdditionalTomcatConnectors(createStandardConnector());
        return tomcat;
    }

    private Connector createStandardConnector() {
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setPort(8080);
        return connector;
    }*/

}
