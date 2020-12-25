package com.imugen.springcloud.controller;


import com.imugen.springcloud.myrule.LoadBalancer;
import com.imugen.springcloud.model.CommonResult;
import com.imugen.springcloud.model.entity.PaymentDO;
import io.swagger.annotations.Api;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author liuqiang
 * @since 2020-12-25
 */
@RestController
@Api(tags = "")
@RequestMapping("/consumer/order")
public class CustomRibbonOrderTestController {


    // public static final String PAYMENT_URL = "http://localhost:8001";
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private LoadBalancer loadBalancer;

    @Resource
    private DiscoveryClient discoveryClient;


    @GetMapping("/payment/get/{id}")
    public CommonResult<PaymentDO> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }

    @GetMapping("/payment/getForEntity/{id}")
    public CommonResult<PaymentDO> getPayment2(@PathVariable("id") Long id) {
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        if (entity.getStatusCode().is2xxSuccessful()) {
            //  log.info(entity.getStatusCode()+"\t"+entity.getHeaders());
            return entity.getBody();
        } else {
            return new CommonResult<>(444, "操作失败");
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PROVIDER-PAYMENT");
        if (CollectionUtils.isEmpty(instances)) {
            return null;
        }
        ServiceInstance serviceInstance = loadBalancer.instances(instances);
        return restTemplate.getForObject(serviceInstance.getUri() + "/payment/lb", String.class);
//        return restTemplate.getForObject(PAYMENT_URL + "/payment/1", CommonResult.class);
    }

}