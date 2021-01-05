package com.imugen.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RouteLocator
 *
 * @author liuqiang
 * @since 2021-01-05
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("baidu", r -> r
                        .path("/baidu")
                        .uri("http://news.baidu.com/guonei"))
                .build();
    }

}
