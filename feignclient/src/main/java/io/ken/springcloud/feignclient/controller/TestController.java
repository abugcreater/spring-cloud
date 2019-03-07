package io.ken.springcloud.feignclient.controller;

import io.ken.springcloud.feignclient.model.Plus;
import io.ken.springcloud.feignclient.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: fengk
 * @Description
 * @Date: Create in 10:11 2018/6/14.
 * @Modified By:
 */
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping(value = "/")
    public Object index(){
        return "feign client";
    }

    @RequestMapping(value = "/ti")
    public Object ti(){
        return testService.indexService();
    }

    @RequestMapping("/plus")
    public Object plus(@RequestParam("numa") int numA, @RequestParam("numb") int numB) {
        return testService.plusService(numA, numB);
    }

    @RequestMapping("/plusab")
    public Object plusA(@RequestParam("numa") int numA, @RequestParam("numb") int numB) {
        Plus plus = new Plus();
        plus.setNumA(numA);
        plus.setNumB(numB);
        return testService.plusabService(plus);
    }

    @RequestMapping("/plus2")
    public Object plus2(Plus plus) {
        return testService.plus2Service(plus);
    }

}
