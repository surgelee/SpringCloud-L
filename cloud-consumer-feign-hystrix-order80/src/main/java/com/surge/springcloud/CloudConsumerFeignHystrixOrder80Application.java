package com.surge.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author : Surge Lee
 * @date : 2022/7/11 15:36
 * @description :
 * @modyified By:
 */
@SpringBootApplication
@EnableFeignClients // 启动 feign
public class CloudConsumerFeignHystrixOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignHystrixOrder80Application.class, args);
        System.out.println("启动成功");

    }

}