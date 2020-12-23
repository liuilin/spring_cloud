package com.imugen.springcloud.model.funtion;

/**
 * Created by hel on 2020/12/18 12:40
 */
@FunctionalInterface
public interface Fun<T, R> {

    /**
     * 进行转换
     *
     * @param t 参数
     * @return 转换后参数
     */
    R apply(T t) throws Throwable;

}
