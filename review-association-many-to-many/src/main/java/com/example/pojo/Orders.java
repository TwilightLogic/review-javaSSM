package com.example.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Orders {
    private Integer id;
    private String number;
    private List<Product> productList;
}
