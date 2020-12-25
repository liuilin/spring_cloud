package com.imugen.springcloud;

import com.imugen.springcloud.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author liuqiang
 * @since 2020-11-24
 */
@EnableEurekaClient
@SpringBootApplication
@RibbonClient(value = "CLOUD-PROVIDER-PAYMENT", configuration = MySelfRule.class)
public class OrderApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication80.class, args);
    }

}    
