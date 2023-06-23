package com.example.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Users {
    private Integer id;
    private String username;
    private String address;
    private List<Orders> ordersList;    // 用户关联的订单
}
