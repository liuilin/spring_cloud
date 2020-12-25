package com.imugen.springcloud.myrule;

import java.util.List;
import org.springframework.cloud.client.ServiceInstance;

/**
 * 负载均衡服务器
 *
 * @author liuqiang
 * @since 2020-12-25
 */
public interface LoadBalancer {

    //收集服务器总共有多少台能够提供服务的机器，并放到list里面
    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
