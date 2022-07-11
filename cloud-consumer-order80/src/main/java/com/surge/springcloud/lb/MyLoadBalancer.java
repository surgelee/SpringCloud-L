package com.surge.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author : Surge Lee
 * @date : 2022/7/10 19:30
 * @description :创建自己的负载均衡接口
 * @modyified By:
 */
public interface MyLoadBalancer {

    /**
     * 收集服务器总共有多少台能够提供服务的机器，并放到list里面
     *
     * @param serviceInstances
     * @return ServiceInstance
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);


}