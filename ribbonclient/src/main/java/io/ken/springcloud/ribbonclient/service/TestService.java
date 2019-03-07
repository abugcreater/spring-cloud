package io.ken.springcloud.ribbonclient.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: fengk
 * @Description
 * @Date: Create in 9:45 2018/5/30.
 * @Modified By:
 */
@Service
public class TestService {

    @Autowired
    private RestTemplate restTemplate;

    //启用熔断机制(当服务阻塞时调用indexError方法)
    @HystrixCommand(fallbackMethod = "indexError")
    public Object index(){
        return restTemplate.getForObject("http://testservice", String.class);
    }

    public Object plus(int numA,int numB){
        String url = String.format("http://testservice/plus?numA=%s&numB=%s", numA, numB);
        return restTemplate.getForObject(url, String.class);
    }

    public Object indexError(){
        return "{\"code\": 999,\"message\": \"熔断\"}";
    }

}
