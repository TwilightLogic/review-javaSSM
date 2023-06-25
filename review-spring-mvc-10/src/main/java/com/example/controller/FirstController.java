package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
    @RequestMapping("/firstController")
    public String sayHello() {
        System.out.println("Accessed to FirstController");
        return "success";
    }
}
