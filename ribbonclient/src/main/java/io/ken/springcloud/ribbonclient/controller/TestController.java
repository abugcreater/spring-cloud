package io.ken.springcloud.ribbonclient.controller;

import io.ken.springcloud.ribbonclient.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fengk
 * @Description
 * @Date: Create in 9:51 2018/5/30.
 * @Modified By:
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/")
    public Object index(){
        return "ribbon client";
    }

    @RequestMapping("/ti")
    public Object ti(){
        return testService.index();
    }

    @RequestMapping("/plus")
    public Object plus(@RequestParam("numa")int numA, @RequestParam("numb")int numB){
        return testService.plus(numA, numB);
    }

}
