package com.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
* 使用`@Component`注解将该类标识为一个组件（Bean），并指定该Bean的名称为"user"。
* 在Spring容器中，可以通过该名称来获取该Bean的实例。
* */
@Data
@Component("user")
@Scope("singleton")
public class User {
    @Value("1")
    private int id;

    @Value("Lucas")
    private String name;

    @Value("123")
    private String password;
}
