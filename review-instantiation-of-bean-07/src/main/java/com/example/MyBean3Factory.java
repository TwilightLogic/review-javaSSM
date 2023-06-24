package com.example;

public class MyBean3Factory {
    public MyBean3Factory() {
        System.out.println("bean3工厂实例中！");
    }

    // 创建bean3实例的方法
    public Bean3 createBean() {
        return new Bean3();
    }
}
