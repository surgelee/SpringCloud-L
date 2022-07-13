package com.surge.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description 支付服务
 */
@SpringBootApplication
public class CloudStreamRabbitmqProvider8801Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudStreamRabbitmqProvider8801Application.class, args);
        System.out.println("启动成功");
    }

}
