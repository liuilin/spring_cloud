package com.imugen.springcloud.controller;

import cn.hutool.core.util.IdUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuqiang
 * @since 2021-01-19
 */
@RestController
public class FlowLimitController {

    @GetMapping("/lin")
    public String lin() {
        return "lin..." + IdUtil.simpleUUID();
    }

    @GetMapping("/daniel")
    public String daniel() {
        return "daniel......";
    }

}
