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
public class OrderApplication8080 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication8080.class, args);
    }

}    
