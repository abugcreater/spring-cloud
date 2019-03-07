package io.ken.springcloud.eurekaservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fengk
 * @Description: 前端控制器初步了解eureka服务注册
 * @Date: Create in 15:14 2018/5/29.
 * @Modified By:
 */
@RestController
public class HelloController {

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/")
    public Object index(){
        return "hello eurekaservice ";
    }

    @RequestMapping("/info")
    public Object info(){
        return discoveryClient.getServices();
    }


}
