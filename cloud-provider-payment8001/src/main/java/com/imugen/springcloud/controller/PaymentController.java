package com.imugen.springcloud.controller;


import com.imugen.springcloud.convert.PaymentConvert;
import com.imugen.springcloud.model.CommonResult;
import com.imugen.springcloud.model.dto.PaymentDTO;
import com.imugen.springcloud.service.IPaymentService;
import io.swagger.annotations.Api;
import java.util.concurrent.TimeUnit;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * 支付
 *
 * @author liuqiang
 * @since 2020-12-24
 */
@RestController
@Api(tags = "支付")
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private IPaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/saveOrUpdate")
    public CommonResult saveOrUpdate(@Valid @RequestBody PaymentDTO dto) {
        return CommonResult.complete(paymentService.saveOrUpdate(PaymentConvert.INSTANCE.convert(dto)));
    }

    @DeleteMapping("/{id}")
    public CommonResult delete(@PathVariable("id") String id) {
        return CommonResult.complete(paymentService.removeById(id));
    }

    @GetMapping("/{id}")
    public CommonResult getById(@PathVariable("id") String id) {
        return new CommonResult<>(200, "serverPort ==> " + serverPort, PaymentConvert.INSTANCE.convert(paymentService.getById(id)));
//        return CommonResult.success(PaymentConvert.INSTANCE.convert(paymentService.getById(id)));
    }

    @GetMapping("/lb")
    public String pay() {
        return serverPort;
    }

    @GetMapping("/feign/timeout")
    public String paymentFeignTimeout() {
        //暂停一会儿线程
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }

    @GetMapping("/zipkin")
    public String paymentZipkin() {
        return "zipkin from Lin.......";
    }
}