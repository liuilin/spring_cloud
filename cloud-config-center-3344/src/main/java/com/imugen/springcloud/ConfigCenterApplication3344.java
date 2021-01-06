package com.imugen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liuqiang
 * @since 2021-01-06
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterApplication3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterApplication3344.class, args);
    }

}    
