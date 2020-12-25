package com.imugen.custom;

import com.netflix.loadbalancer.ILoadBalancer;

/**
 * @author liuqiang
 * @since 2020-12-25
 */
public abstract class MyAbstractLoadBalancerRule implements MyIRule {

    private ILoadBalancer lb;


    public MyAbstractLoadBalancerRule() {
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return this.lb;
    }

    @Override
    public void setLoadBalancer(ILoadBalancer lb) {
        this.lb = lb;
    }

}
