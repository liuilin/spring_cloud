package com.imugen.springcloud.model.test;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 校验的规则类型
 * code:代码代表唯一
 * rule:正则表达式校验规则
 * <p>
 * message:校验失败错误码
 *
 * @author liuqiang
 */
@Getter
@AllArgsConstructor
public enum CheckEnum {
    /**
     * 不做任何操作
     */
    NONE(1, "", ""),

    /**
     * 电话号码规则
     */
    PHONE(2, "^1(3|4|5|6|7|8|9)\\d{9}$", "手机号格式不正确"),
    ;

    private final int code;
    private final String rule;
    private final String message;
}
