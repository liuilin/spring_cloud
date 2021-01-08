package com.imugen.springcloud.controller;


import io.swagger.annotations.Api;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 订单
 *
 * @author liuqiang
 * @since 2020-12-23
 */
@RestController
@Api(tags = "订单")
@RequestMapping("/order/consul")
public class OrderConsulController {

    public static final String URL = "http://consul-provider-payment";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/payment")
    public String payment() {
        //http://localhost:8006/payment/payConsul
        return restTemplate.getForObject(URL + "/payment/payConsul", String.class);
    }

}