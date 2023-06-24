package com.example;

import lombok.Data;

@Data
public class HelloSpring {
    private String userName;
    public void show() {
        System.out.println("Welcome " + userName);
    }
}
