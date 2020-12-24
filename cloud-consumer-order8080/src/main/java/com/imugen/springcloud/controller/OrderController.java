package com.imugen.springcloud.controller;


import com.imugen.springcloud.model.CommonResult;
import com.imugen.springcloud.model.dto.OrderPayInfoDTO;
import io.swagger.annotations.Api;
import javax.annotation.Resource;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.*;
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

    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/create")
    public CommonResult create(@Valid @RequestBody OrderPayInfoDTO dto) {
        return restTemplate.postForObject(PAYMENT_URL, dto, CommonResult.class);
    }

    @GetMapping("/{id}")
    public CommonResult get(@PathVariable String id) {
        return restTemplate.getForObject(PAYMENT_URL + "/order/pay/info/" + id, CommonResult.class);
    }

}