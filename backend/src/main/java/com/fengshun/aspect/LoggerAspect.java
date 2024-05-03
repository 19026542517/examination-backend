package com.fengshun.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {
    @Before("execution(* com.fengshun.service..*(..))")
    public void advice(){
        System.out.println("这是一个通知");
    }
}
