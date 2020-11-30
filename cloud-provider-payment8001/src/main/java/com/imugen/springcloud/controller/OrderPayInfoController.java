package com.imugen.springcloud.controller;


import com.imugen.springcloud.model.CommonResult;
import com.imugen.springcloud.service.IOrderPayInfoService;
import io.swagger.annotations.Api;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单支付
 *
 * @author liuqiang
 * @since 2020-11-26
 */
@RestController
@Api(tags = "订单支付")
@RequestMapping("/order/pay/info")
public class OrderPayInfoController {

    @Autowired
    private IOrderPayInfoService orderPayInfoService;

    @GetMapping("/{id}")
    public CommonResult get(@Valid @PathVariable("id") String id) {
        return CommonResult.success(orderPayInfoService.getById(id));
    }

}