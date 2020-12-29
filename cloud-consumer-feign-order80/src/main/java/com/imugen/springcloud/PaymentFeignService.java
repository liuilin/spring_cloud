package com.imugen.springcloud;

import com.imugen.springcloud.model.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author liuqiang
 * @since 2020-12-25
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-PAYMENT")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/{id}")
    CommonResult getPaymentById(@PathVariable("id") Long id);


    @GetMapping("/payment/feign/timeout")
    String paymentFeignTimeout();
}

