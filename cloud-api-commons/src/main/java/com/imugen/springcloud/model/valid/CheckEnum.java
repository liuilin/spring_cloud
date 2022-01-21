package com.imugen.springcloud.model.valid;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 校验的规则类型
 * code：代码代表唯一
 * label：
 * rule：正则表达式校验规则
 * message：校验失败错误码
 * messageTemplate：最终错误信息 = label + message
 *
 * @author liuqiang
 */
@Getter
@AllArgsConstructor
public enum CheckEnum {
    /**
     * 电话号码规则
     */
    PHONE("phone", "手机号", "^1(3|4|5|6|7|8|9)\\d{9}$", "格式不正确"),
    /**
     * IP 校验，必须带端口号的网址(或ip)
     */
    IP("ip", "IP 地址", "^((ht|f)tps?:\\/\\/)?[\\w-]+(\\.[\\w-]+)+:\\d{1,5}\\/?$", "格式不正确"),
    ;

    private final String code;
    private final String label;
    private final String rule;
    private final String message;
}
