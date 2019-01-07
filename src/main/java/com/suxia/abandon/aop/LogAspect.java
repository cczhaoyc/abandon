package com.suxia.abandon.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(* com.suxia.abandon.service..*(..))")
    public void logPointcut(){}

    @Before("logPointcut()")
    public void logStart(){
        System.out.println("LogAspect: 记录日志开始...");
    }

    @AfterReturning("logPointcut()")
    public void logEnd(){
        System.out.println("LogAspect: 记录日志结束...");
    }

//    @Around("logPointcut()")
    public void logAround(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("logAround: 记录日志1...");
        Object proceed = pjp.proceed();
        System.out.println("logAround: 记录日志2...");
        System.out.println("logAround: proceed: " + proceed);
    }
}
