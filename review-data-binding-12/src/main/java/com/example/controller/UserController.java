package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @RequestMapping("/getUserId")
    public void getUserId(HttpServletRequest request) {
        String userid = request.getParameter("userid");
        System.out.println("userid=" + userid);
    }

    @RequestMapping("/getUserNameAndId")
    public void getUserNameAndId(String username, Integer id) {
        System.out.println("username=" + username + ",id=" + id);
    }

    // Using @RequestParam()
    @RequestMapping("/getUserName")
    public void getUserName(@RequestParam(
            value = "name",
            required = false,
            defaultValue = "Lucas") String username) {
        System.out.println("username=" + username);
    }
}
