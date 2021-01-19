package com.imugen.springcloud.controller;

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
        return "lin......";
    }

    @GetMapping("/daniel")
    public String daniel() {
        return "daniel......";
    }

}
