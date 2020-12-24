package com.imugen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liuqiang
 * @since 2020-11-24
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication80.class, args);
    }

}    
