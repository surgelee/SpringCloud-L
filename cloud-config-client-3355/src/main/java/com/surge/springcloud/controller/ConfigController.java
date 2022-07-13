package com.surge.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Surge Lee
 * @date : 2022/7/13 16:03
 * @description :
 * @modyified By:
 */
@RestController
@RefreshScope   // 具备刷新能力, 当服务端配置发生变化，客户端会获取到最新的配置
                // 需要运维执行post请求刷新客户端 curl -X POST "http://localhost:3355/actuator/refresh"
public class ConfigController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}