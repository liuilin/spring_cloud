package com.imugen.springcloud;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author liuqiang
 * @since 2021-01-11
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerApplication.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RestController
    @RequiredArgsConstructor(onConstructor_ = {@Autowired})
    public class TestController {
        private final RestTemplate restTemplate;

        @Value("${service-url.nacos-user-service}")
        private String url;

//        @Autowired
//        public TestController(RestTemplate restTemplate) {
//            this.restTemplate = restTemplate;
//        }

//        @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
        @GetMapping("/echo/{str}")
        public String echo(@PathVariable String str) {
//            return restTemplate.getForObject("http://service-provider/echo/" + str, String.class);
            return restTemplate.getForObject(url + str, String.class);
        }
    }
}
