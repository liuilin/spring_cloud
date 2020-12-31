package com.imugen.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Service;

/**
 * @author liuqiang
 * @since 2020-12-30
 */
@Service
public class PaymentService {

    public String paymentInfo_OK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "   paymentInfo_OK,id：  " + id + "\t" + "哈哈哈";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            //3秒钟以内就是正常的业务逻辑
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentInfo_TimeOut(Integer id) {
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

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "调用支付接口超时或异常,id is " + id + "，当前线程为：" + Thread.currentThread().getName();
    }
}
