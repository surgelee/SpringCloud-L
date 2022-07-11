package com.surge.springcloud.service.impl;

import com.surge.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author : Surge Lee
 * @date : 2022/7/12 3:04
 * @description :
 * @modyified By:
 */
@Component
public class PaymentFallbackServiceImpl implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }

}