package com.surge.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Surge Lee
 * @date : 2022/7/12 12:44
 * @description :
 * @modyified By:
 */
@Configuration
public class GateWayConfig {
    /**
     * 代码配置路由：当访问 http://localhost:9527/guoji  会显示 http://news.baidu.com/guonei 内容
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_baidu",
                        r -> r.path("/guoji")
                                .uri("http://news.baidu.com/guonei"))
                .build();
        return routes.build();
    }
}