package com.imugen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liuqiang
 * @since 2021-01-19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelApplication8401 {

    public static void main(String[] args) {
        SpringApplication.run(SentinelApplication8401.class, args);
    }

}    
