package com.imugen.springcloud.model.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局统一异常处理
 *
 * @author liuqiang
 * @since 2022-01-20
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    // 处理接口参数数据格式错误异常
    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Object errorHandler(MethodArgumentNotValidException ex) {
//        List list = ex.getBindingResult().getAllErrors().stream()
//                .map(fieldError -> fieldError.getDefaultMessage())
//                .collect(Collectors.toList());
//
//        return new ResponseEntity<>(list, HttpStatus.BAD_REQUEST);
        return ex.getBindingResult().getAllErrors();
    }
}
