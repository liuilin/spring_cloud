package com.imugen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 订单OpenFeign
 *
 * @author liuqiang
 * @since 2020-12-25
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignApplication80.class, args);
    }

}    
