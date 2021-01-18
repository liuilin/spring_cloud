package com.imugen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Nacos 配置中心.
 * @author liuqiang
 * @since 2021-01-11
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientApplication3377 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientApplication3377.class, args);
    }

}    
