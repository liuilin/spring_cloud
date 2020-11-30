package com.imugen.springcloud.model;

/**
 * 统一返回结构
 *
 * @author liuqiang
 * @since 2020-11-25
 */
public interface ResultCode {

    /**
     * 操作是否成功,true为成功，false操作失败
     *
     * @return boolean
     */
//    boolean success();

    /**
     * 操作代码
     *
     * @return Integer
     */
    Integer getCode();

    /**
     * 提示信息
     *
     * @return string
     */
    String getMessage();

}
