package com.imugen.springcloud.controller;

import com.imugen.springcloud.feign.PaymentFeignService;
import com.imugen.springcloud.model.CommonResult;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuqiang
 * @since 2020-12-25
 */
@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/feign/timeout")
    public String consumerFeignTimeout(){
        //暂停一会儿线程
        return paymentFeignService.paymentFeignTimeout();
    }

}
