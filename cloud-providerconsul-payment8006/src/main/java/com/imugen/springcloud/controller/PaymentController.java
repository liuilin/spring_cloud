package com.imugen.springcloud.controller;


import io.swagger.annotations.Api;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 支付
 *
 * @author liuqiang
 * @since 2020-12-23
 */
@RestController
@Api(tags = "支付")
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/payConsul")
    public String payConsul() {
        return "spring consul" + port + UUID.randomUUID().toString();
    }

}