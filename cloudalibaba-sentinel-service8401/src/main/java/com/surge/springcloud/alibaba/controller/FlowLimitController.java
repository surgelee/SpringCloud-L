package com.surge.springcloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Surge Lee
 * @date : 2022/7/14 14:36
 * @description :
 * @modyified By:
 */

@RestController
public class FlowLimitController
{
    @GetMapping("/testA")
    public String testA() {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {

        return "------testB";
    }

}