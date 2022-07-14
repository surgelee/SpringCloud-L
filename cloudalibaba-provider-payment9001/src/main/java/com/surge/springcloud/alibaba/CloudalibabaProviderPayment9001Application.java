package com.surge.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : Surge Lee
 * @date : 2022/7/14 3:30
 * @description :
 * @modyified By:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaProviderPayment9001Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProviderPayment9001Application.class,args);
        System.out.println("启动成功");
    }
}
