package io.ken.springcloud.feignclient.configuration;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: fengk
 * @Description: 熔断监视
 * @Date: Create in 10:34 2018/6/20.
 * @Modified By:
 */
@Configuration
public class HystrixConfiguration {

    @Bean(name = "hystrixRegistrationBean")
    public ServletRegistrationBean servletRegistrationBean(){

        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet(), "/hystrix.stream");
        registrationBean.setName("hystrixServlet");
        registrationBean.setLoadOnStartup(1);
        return registrationBean;
    }

    @Bean(name = "hystrixForTurbineRegistrationBean")
    public ServletRegistrationBean servletTurbineRegistrationBean(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet(), "/actuator/hystrix.stream");
        registrationBean.setName("hystrixForTurbineServlet");
        registrationBean.setLoadOnStartup(1);
        return registrationBean;
    }

}
