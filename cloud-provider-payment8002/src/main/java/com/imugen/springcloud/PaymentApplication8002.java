package com.imugen.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liuqiang
 * @since 2020-12-23
 */
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.imugen.springcloud.mapper")
public class PaymentApplication8002 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8002.class, args);
    }

}    
