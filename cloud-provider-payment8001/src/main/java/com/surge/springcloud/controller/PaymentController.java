package com.surge.springcloud.controller;

import com.surge.springcloud.entities.CommonResult;
import com.surge.springcloud.entities.Payment;
import com.surge.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Payment)表控制层
 */
@RestController
@RequestMapping("payment")
@Slf4j
public class PaymentController {
    /**
     * 服务对象
     */
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("get/{id}")
    public CommonResult<Payment> selectOne(@PathVariable("id") Long id) {
        Payment payment = this.paymentService.queryById(id);

        return new CommonResult<Payment>(200, "select success， serverPort：" + serverPort, payment);
    }

    @PostMapping("create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        Payment insert = this.paymentService.insert(payment);
        System.out.println("插入结果：" + insert);
        return new CommonResult<>(200, "insert success， serverPort：" + serverPort, insert);
    }

    @GetMapping("queryAllByLimit")
    public CommonResult<List<Payment>> queryAllByLimit(@RequestParam(defaultValue = "0") int offset,
                                                       @RequestParam(defaultValue = "10") int limit) {
        List<Payment> payment = this.paymentService.queryAllByLimit(offset, limit);

        return new CommonResult<>(200, "select success， serverPort：" + serverPort, payment);
    }


    /**
     * 可以获取微服务名称的实例相关信息
     *
     * 可以对外暴漏/提供服务的 名称与地址信息
     *
     * http://localhost:8001/payment/discovery
     *
     * 2022-07-08 14:31:15.114  INFO 21732 --- [nio-8001-exec-3] c.s.s.controller.PaymentController       : CLOUD-PAYMENT-SERVICE	192.168.182.1	8001	http://192.168.182.1:8001
     * 2022-07-08 14:31:15.114  INFO 21732 --- [nio-8001-exec-3] c.s.s.controller.PaymentController       : CLOUD-PAYMENT-SERVICE	192.168.182.1	8002	http://192.168.182.1:8002
     *
     */
    @GetMapping(value = "/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("***** element:"+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }

}