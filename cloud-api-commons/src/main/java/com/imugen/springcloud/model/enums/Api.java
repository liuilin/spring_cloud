package com.imugen.springcloud.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 返回的状态信息
 * <p>
 * Created by hel on 2020/11/27 12:42
 */
public interface Api {

    /**
     * 获取状态码
     *
     * @return 状态码
     */
    int getCode();

    /**
     * 获取提示信息
     *
     * @return 提示信息
     */
    String getMsg();

    /**
     * 是否打印错误栈信息
     *
     * @return true是 false否
     */
    boolean isPrint();

    /**
     * 获得业务代码状态码
     *
     * @return 状态码
     */
    static int work() {
        return Code.Work.code;
    }

    /**
     * 获得用户可直接查看状态码
     *
     * @return 状态码
     */
    static int user() {
        return Code.User.code;
    }

    /**
     * 获得需根据状态做相应处理状态码
     *
     * @param id id
     * @return 状态码
     */
    static int maybe(int id) {
        return Code.Maybe.code + id;
    }

    /**
     * 错误码类型
     */
    @Getter
    @AllArgsConstructor
    enum Code {

        /**
         * 业务代码错误码
         * 用于需要避免用户看见的错误信息
         */
        Work(-1),

        /**
         * 用户可直接看见的错误码
         */
        User(20000),

        /**
         * 前端根据此错误进行自定义操作
         */
        Maybe(30000);

        private final int code;

    }

    /**
     * 默认的状态
     */
    @Getter
    enum Default implements Api {

        AgainLater("操作频繁，请稍后再试"),
        InternalErr("服务器内部错误"),
        IllegalOperation("非法操作"),
        ParamErr("错误的参数");

        /**
         * 提示信息
         */
        final String msg;

        /**
         * 错误码
         */
        final int code;

        /**
         * 是否打印所有错误栈信息 默认true
         */
        final boolean print;

        Default(String msg) {
            this.msg = msg;
            this.code = Code.Work.code;
            this.print = true;
        }

    }

}
