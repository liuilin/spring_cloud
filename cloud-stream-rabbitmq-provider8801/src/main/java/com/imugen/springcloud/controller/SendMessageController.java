package com.imugen.springcloud.controller;

import com.imugen.springcloud.service.IMessageProvider;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuqiang
 * @since 2021-01-07
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;

    @GetMapping("/sendMessage")
    public void sendMessage() {
        messageProvider.send();
    }
}
