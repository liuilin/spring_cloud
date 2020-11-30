package com.imugen.springcloud.model;

import lombok.Getter;
import lombok.ToString;

/**
 * @author liuqiang
 * @since 2020-11-26
 */
@ToString
@Getter
public enum CommonCode implements ResultCode {

    SUCCESS(10000, "操作成功！"),
    FAIL(11111, "操作失败！"),
    UNAUTHENTICATED(10001, "此操作需要登陆系统！"),
    UNAUTHORISE(10002, "权限不足，无权操作！"),
    SERVER_ERROR(99999, "抱歉，系统繁忙，请稍后重试！"),
    INVALID_PARAMETER(10003, "无效参数");
    //private static ImmutableMap<Integer, CommonCode> codes ;
    //操作是否成功
//    Boolean success;
    //操作代码
    Integer code;
    //提示信息
    String message;

    CommonCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
