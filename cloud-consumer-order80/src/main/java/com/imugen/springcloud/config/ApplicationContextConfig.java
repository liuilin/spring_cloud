package com.imugen.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 配置类
 *
 * @author liuqiang
 * @since 2020-11-30
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced // 默认是轮询，可在 com.imugen.myrule.MySelfRule 中改为随机
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
