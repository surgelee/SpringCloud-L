package com.surge.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author : Surge Lee
 * @date : 2022/7/11 15:10
 * @description :
 * @modyified By:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker // 服务容错处理 服务降级
public class CloudProviderHystrixPayment8001Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderHystrixPayment8001Application.class, args);
        System.out.println("启动成功");
    }

    /**
     * 注意：新版本Hystrix需要在主启动类中指定监控路径
     * 此配置是为了服务监控而配置，与服务容错本身无关，spring cloud升级后的坑
     * ServletRegistrationBean因为springboot的默认路径不是"/hystrix.stream"，
     * 只要在自己的项目里配置上下面的servlet就可以了
     *
     *类上的 @EnableCircuitBreaker 一定要打开
     */
    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);

        // 一启动就加载
        registrationBean.setLoadOnStartup(1);
        // 添加url
        registrationBean.addUrlMappings("/hystrix.stream");
        // 设置名称
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }

}