package com.imugen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liuqiang
 * @since 2020-12-30
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrixApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixApplication8001.class, args);
    }

}    
