package com.surge.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
* @author : Surge Lee
* @date : 2022/7/7 15:26
* @description : 
* @modyified By: 
*/
@SpringBootApplication
@EnableEurekaClient  // Eureka停更，以后不会用了 换成阿里的
@EnableDiscoveryClient
public class CloudProviderPayment8002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8002Application.class, args);
        System.out.println("启动成功");
    }
}