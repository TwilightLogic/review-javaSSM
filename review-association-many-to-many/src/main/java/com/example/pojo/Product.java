package com.example.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Product {
    private Integer id;
    private String name;
    private Double price;
    private List<Orders> ordersList;    // 与订单关联的属性
}
