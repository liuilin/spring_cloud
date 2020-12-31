package com.imugen.springcloud.feign;

import org.springframework.stereotype.Component;

/**
 * @author liuqiang
 * @since 2020-12-31
 */
@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService {

    @Override
    public String paymentInfoOK(Integer id) {
        return "Global paymentInfoOK...";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "Global paymentInfoTimeOut...";
    }

}
