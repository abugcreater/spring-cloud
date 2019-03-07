package io.ken.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 * eurekaserver启动类
 */
@EnableEurekaServer
@SpringBootApplication
public class App {

    public static void main( String[] args ){
        SpringApplication.run(App.class, args);
    }
}
