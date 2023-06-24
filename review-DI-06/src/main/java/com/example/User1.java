package com.example;

public class User1 {
    private int id;
    private String name;
    private String password;

    public User1(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'';
    }
}