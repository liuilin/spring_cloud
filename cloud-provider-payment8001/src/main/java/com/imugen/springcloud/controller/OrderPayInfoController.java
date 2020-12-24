package com.imugen.springcloud.controller;


import com.imugen.springcloud.convert.OrderPayInfoConvert;
import com.imugen.springcloud.model.CommonResult;
import com.imugen.springcloud.model.dto.OrderPayInfoDTO;
import com.imugen.springcloud.model.vo.OrderPayInfoVO;
import com.imugen.springcloud.service.IOrderPayInfoService;
import io.swagger.annotations.Api;
import java.util.UUID;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * 订单支付
 *
 * @author liuqiang
 * @since 2020-12-22
 */
@RestController
@Api(tags = "订单支付")
@RequestMapping("/order/pay/info")
public class OrderPayInfoController {

    @Autowired
    private IOrderPayInfoService orderPayInfoService;

    @Value("${server.port}")
    private String port;

    @PostMapping("/saveOrUpdate")
    public CommonResult saveOrUpdate(@Valid @RequestBody OrderPayInfoDTO dto) {
        return CommonResult.complete(orderPayInfoService.saveOrUpdate(OrderPayInfoConvert.INSTANCE.convert(dto)));
    }

    @DeleteMapping("/{id}")
    public CommonResult delete(@PathVariable("id") String id) {
        return CommonResult.complete(orderPayInfoService.removeById(id));
    }

    @GetMapping("/{id}")
    public CommonResult<OrderPayInfoVO> getById(@PathVariable("id") String id) {
        return CommonResult.success(OrderPayInfoConvert.INSTANCE.convert(orderPayInfoService.getById(id)));
    }

    @GetMapping("/pay")
    public String pay() {
        return "spring" + port + "---" + UUID.randomUUID().toString();
    }

}