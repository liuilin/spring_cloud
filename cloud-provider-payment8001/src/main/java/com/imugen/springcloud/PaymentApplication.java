package com.imugen.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liuqiang
 * @since 2020-11-24
 */
@SpringBootApplication
@MapperScan("com.imugen.springcloud.mapper")
public class PaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }

}    
