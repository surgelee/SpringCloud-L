package com.surge.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Surge Lee
 * @date : 2022/7/10 19:36
 * @description : 该类是ribbon的自定义策略
 * @modyified By:
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        // 此处将ribbon默认使用的轮询策略改为随机策略
        return new RandomRule();
    }
}
