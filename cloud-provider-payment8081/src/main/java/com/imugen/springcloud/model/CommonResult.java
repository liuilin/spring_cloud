package com.imugen.springcloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liuqiang
 * @since 2020-11-25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    /**
     * 操作代码
     */
    Integer code;
    /**
     * 提示信息
     */
    String message;

    /**
     * 数据
     */
    T data;

    /**
     * 默认是成功
     */
//    public CommonResult() {
//        this.code = CommonCode.SUCCESS.getCode();
//        this.message = CommonCode.SUCCESS.getMessage();
//        return new CommonResult<>(CommonCode.SUCCESS);
//    }


    public CommonResult(T data) {
//        this();
        //没有传resultCode，所以不能写成
        //this.code = resultCode.getCode();
        //this.message = resultCode.getMessage();
        this.code = CommonCode.SUCCESS.getCode();
        this.message = CommonCode.SUCCESS.getMessage();
        this.data = data;
    }

    /**
     * ResultCode接口顶级Enum父类,处理错误的状态码
     */
    public CommonResult(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }


    /**
     * 可有可无：为了代码中出现的无法在自定义枚举中出现的状态类型而设计，比如message是动态的
     */
    public CommonResult(Integer code, String message) {
        this(code, message, null); //等同于new CommonResult<>(code, message);
//        this.code = code;
//        this.message = message;
    }

//    public CommonResult(Integer code, String message, T data) {
//        this.code = code;
//        this.message = message;
//        this.data = data;
//    }
//
//    public CommonResult(ResultCode res) {
//        this.code = res.getCode();
//        this.message = res.getMessage();
//    }

    //region ok
    public static CommonResult success() {
        return new CommonResult<>(CommonCode.SUCCESS);
    }

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<>(data);
    }
    //endregion

    //region fail
    public static CommonResult fail() {
        return new CommonResult<>(CommonCode.FAIL);
    }

    /**
     * 失败不需要data
     */
    public static CommonResult fail(ResultCode resultCode) {
        return new CommonResult<>(resultCode);
    }

    /**
     * 为了代码中出现的无法在自定义枚举中出现的状态类型而设计，比如message是动态的
     *//*
    public static CommonResult fail(Integer code, String message) {
        return new CommonResult<>(code, message);
    }*/
    //endregion


    /**
     * 抽取出的方法
     *
     * @param success 是否成功，比如数据库是否插入成功
     * @return CommonResult
     */
    public static CommonResult complete(boolean success) {
        if (success) {
            return CommonResult.success();
        } else {
            return CommonResult.fail();
        }
    }


}
