package com.imugen.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 日志拦截器
 *
 * @author liuqiang
 * @since 2021-01-05
 */
@Slf4j
@Component
public class LogFilter implements GlobalFilter, Ordered {

    /**
     * Mono类似于ModelAndView
     *
     * @param exchange
     * @param chain
     * @return
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String userName = exchange.getRequest().getQueryParams().getFirst("userName");
        if (StringUtils.isEmpty(userName)) {
            log.info("用户信息 = {}", "用户非法登录");
            ServerHttpResponse response = exchange.getResponse();
            response.setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return response.setComplete();
        }
        log.info("nice = {}", "nice" );
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
