package com.example.pojo;

import lombok.Data;

@Data
public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private IdCard card;
}
