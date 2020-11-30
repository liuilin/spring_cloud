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

    public static final String PAYMENT_URL = "http://localhost:8081";
    //    @Autowired
//    private IOrderService orderService;
    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/create")
    public CommonResult create(@Valid @RequestBody OrderPayInfoDTO dto) {
        return restTemplate.postForObject(PAYMENT_URL, dto, CommonResult.class);
    }

    //
//    @DeleteMapping("/{id}")
//    public CommonResult delete(@PathVariable String id, @Valid @RequestBody OrderDTO dto) {
//        return new CommonResult(CommonCode.SUCCESS);
//    }
//
//    @PutMapping("/{id}")
//    public CommonResult update(@PathVariable String id, @Valid @RequestBody OrderDTO dto) {
//        return new CommonResult(CommonCode.SUCCESS);
//    }
//
    @GetMapping("/{id}")
    public CommonResult get(@Valid @PathVariable String id) {
        return restTemplate.getForObject(PAYMENT_URL + "/pay/" + id, CommonResult.class);
    }

}