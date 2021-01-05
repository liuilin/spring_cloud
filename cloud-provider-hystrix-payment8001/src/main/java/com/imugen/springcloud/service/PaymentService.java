package com.imugen.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import java.util.concurrent.TimeUnit;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author liuqiang
 * @since 2020-12-30
 */
@Service
@EnableScheduling
public class PaymentService {

    public String paymentInfoOK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "   paymentInfo_OK,id：  " + id + "\t" + "哈哈哈";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            //3秒钟以内就是正常的业务逻辑
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentInfoTimeOut(Integer id) {
//        int secondNum = 3;
//        int i = 1 / 0;
        int secondNum = 2;
        try {
            TimeUnit.SECONDS.sleep(secondNum);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "调用成功 ==> 线程池：" + Thread.currentThread().getName() + "   paymentInfo_TimeOut,id：  " + id + "\t" + "呜呜呜" + " 耗时(秒)" + secondNum;
    }

    // ==================================== circuit breaker 断路器 ====================================

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "调用支付接口超时或异常,id is " + id + "，当前线程为：" + Thread.currentThread().getName();
    }

    /**
     * 服务熔断
     *
     * @param id the id
     * @return string
     */
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),  //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),   //请求总阈值（请求次数）
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),  //时间范围
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"), //失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(Integer id) {
        if (id < 0) {
            throw new RuntimeException("*****id 不能负数");
        }
        String serialNumber = IdUtil.simpleUUID();

        return Thread.currentThread().getName() + "\t" + "调用成功,流水号：" + serialNumber;
    }

    public String paymentCircuitBreaker_fallback(Integer id) {
        return "id 不能负数，请稍候再试,(┬＿┬)/~~     id: " + id;
    }

//    @Scheduled(cron = "*/1 * * * * ?")
//    public void cron() {
//        System.out.println(1);
//    }


}
