package com.surge.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : Surge Lee
 * @date : 2022/7/10 17:39
 * @description :
 * @modyified By:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerzkOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerzkOrder80Application.class, args);
        System.out.println("启动成功");

    }

}