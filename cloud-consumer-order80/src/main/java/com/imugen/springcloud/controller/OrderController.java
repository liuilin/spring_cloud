package com.imugen.springcloud.controller;


import com.imugen.springcloud.model.CommonResult;
import io.swagger.annotations.Api;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 订单
 *
 * @author liuqiang
 * @since 2020-11-30
 */
@RestController
@Api(tags = "订单")
@RequestMapping("/order")
public class OrderController {

//    public static final String PAYMENT_URL = "http://localhost:8081";

    public static final String PAYMENT_URL = "http://CLOUD-PROVIDER-PAYMENT";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/{id}")
    public CommonResult get(@PathVariable String id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/" + id, CommonResult.class);
    }


}