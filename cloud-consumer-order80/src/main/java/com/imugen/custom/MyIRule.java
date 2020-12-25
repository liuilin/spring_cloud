package com.imugen.custom;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

/**
 * MyIRule
 *
 * @author liuqiang
 * @since 2020-12-25
 */
public interface MyIRule {
    Server choose(Object var1);

    void setLoadBalancer(ILoadBalancer var1);

    ILoadBalancer getLoadBalancer();
}
