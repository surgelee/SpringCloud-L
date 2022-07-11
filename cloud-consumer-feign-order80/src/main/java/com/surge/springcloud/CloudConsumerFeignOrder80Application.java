package com.surge.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author : Surge Lee
 * @date : 2022/7/11 10:55
 * @description :
 * @modyified By:
 */
@SpringBootApplication
@EnableFeignClients
public class CloudConsumerFeignOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignOrder80Application.class,args);
    }
}