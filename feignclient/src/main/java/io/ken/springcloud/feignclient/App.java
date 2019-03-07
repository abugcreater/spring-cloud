package io.ken.springcloud.feignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * feign已经引入hystrix,所以无需单独引用,只需在application.yml中配置就行
 */
@EnableHystrixDashboard
@EnableTurbine
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}