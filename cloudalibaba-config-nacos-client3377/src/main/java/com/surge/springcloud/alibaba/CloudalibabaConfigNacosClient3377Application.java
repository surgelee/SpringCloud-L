package com.surge.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : Surge Lee
 * @date : 2022/7/14 11:18
 * @description :
 * @modyified By:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaConfigNacosClient3377Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaConfigNacosClient3377Application.class, args);
        System.out.println("启动成功");
    }

}