package com.fengshun.handler;

import com.fengshun.common.content.Contents;
import com.fengshun.common.exception.AuthException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {



    /**
     * 处理请求方法错误异常
     */
    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    public Object handlerHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        return null;
    }

    /**
     * 请求参数为空
     */
    @ExceptionHandler({MissingServletRequestParameterException.class})
    public Object handlerMissingServletRequestParameterException(MissingServletRequestParameterException e) {

        return null;
    }
}
