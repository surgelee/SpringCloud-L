package com.surge.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
* @author : Surge Lee
* @date : 2022/7/7 15:26
* @description : 
* @modyified By: 
*/
@SpringBootApplication
@EnableEurekaClient
public class CloudProviderPayment8001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8001Application.class, args);
        System.out.println("启动成功");
    }
}