package com.surge.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : Surge Lee
 * @date : 2022/7/14 11:10
 * @description : @EnableDiscoveryClient 该注解用于向使用consul或者zookeeper作为注册中心时注册服务
 * @modyified By:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaConsumerNacosOrder83Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaConsumerNacosOrder83Application.class, args);
        System.out.println("启动成功");
    }

}