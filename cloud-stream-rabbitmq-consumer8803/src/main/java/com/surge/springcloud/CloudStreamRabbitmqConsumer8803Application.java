package com.surge.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : Surge Lee
 * @date : 2022/7/14 2:08
 * @description :
 * @modyified By:
 */
@SpringBootApplication
public class CloudStreamRabbitmqConsumer8803Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudStreamRabbitmqConsumer8803Application.class, args);
        System.out.println("启动成功");
    }
}