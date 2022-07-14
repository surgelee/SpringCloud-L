package com.surge.springcloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Surge Lee
 * @date : 2022/7/14 3:30
 * @description :
 * @modyified By:
 */
@RestController
public class PaymentController
{
    @Value("${server.port}")
    private String serverPort;


    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id)
    {
        return "nacos registry, serverPort: "+ serverPort+"\t id"+id;
    }

}
