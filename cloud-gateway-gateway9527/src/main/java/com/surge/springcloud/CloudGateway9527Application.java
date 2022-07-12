package com.surge.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author : Surge Lee
 * @date : 2022/7/12 4:01
 * @description : 注册中心
 * @modyified By:
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudGateway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudGateway9527Application.class, args);
        System.out.println("启动成功");
    }
}