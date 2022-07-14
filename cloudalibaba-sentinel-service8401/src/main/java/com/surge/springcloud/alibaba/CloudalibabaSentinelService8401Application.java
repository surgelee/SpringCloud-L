package com.surge.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : Surge Lee
 * @date : 2022/7/14 14:36
 * @description :
 * @modyified By:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaSentinelService8401Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaSentinelService8401Application.class, args);
        System.out.println("启动成功");
    }

}