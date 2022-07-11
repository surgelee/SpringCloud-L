package com.surge.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author : Surge Lee
 * @date : 2022/7/12 3:32
 * @description :  访问地址   http://localhost:9001/hystrix
 *                 监控地址   http://localhost:8001/hystrix.stream
 * @modyified By:
 */
@SpringBootApplication
@EnableHystrixDashboard
public class CloudConsumerHystrixDashboard9001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerHystrixDashboard9001Application.class, args);
        System.out.println("启动成功");

    }
}