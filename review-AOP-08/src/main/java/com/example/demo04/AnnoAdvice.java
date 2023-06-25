package com.example.demo04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AnnoAdvice {
    // 切点
    @Pointcut("execution(* com.example.demo03.Student.*(..))")
    public void pointcut() {}

    // 前置通知
    @Before("pointcut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("这是前置通知！");
    }

    @After("pointcut()")
    public void after(JoinPoint joinPoint) {
        System.out.println("这是后置通知！");
    }
}
