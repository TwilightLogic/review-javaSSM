package com.example.demo03;

import org.aspectj.lang.JoinPoint;

public class StudentAOP {

    public void afterStudy(JoinPoint joinPoint) {
        System.out.println("我是afterStudy()");
    }
}
