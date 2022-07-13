package com.surge.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author : Surge Lee
 * @date : 2022/7/13 17:58
 * @description :
 * @modyified By:
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudConfigClient3366Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClient3366Application.class, args);
        System.out.println("启动成功");

    }
}