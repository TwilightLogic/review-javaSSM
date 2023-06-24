package com.example.service;

import com.example.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public void save() {
        this.userDao.save();
        System.out.println("执行UserServiceImpl.save()");
    }
}
