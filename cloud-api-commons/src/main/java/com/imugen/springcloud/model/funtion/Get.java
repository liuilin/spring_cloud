package com.imugen.springcloud.model.funtion;

/**
 * Created by hel on 2020/11/3 15:23
 */
@FunctionalInterface
public interface Get<T> {

    T get() throws Throwable;

}
