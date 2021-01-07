package com.imugen.springcloud.service.impl;

import com.imugen.springcloud.service.IMessageProvider;
import java.util.UUID;
import javax.annotation.Resource;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @author liuqiang
 * @since 2021-01-07
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {

    //@Resource
    //MessageChannel output;

    @Resource
    Source source;

    @Override
    public void send() {
        String serial = UUID.randomUUID().toString();
        String message = "love you , Lin " + serial;
//        output.send(MessageBuilder.withPayload(serial).build());
        source.output().send(MessageBuilder.withPayload(serial).build());
        System.out.println("message sending..." + message);
    }

}
