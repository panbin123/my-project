package com.mypol.myproject.service.impl;

import com.mypol.myproject.service.UserService;
import com.mypol.myproject.dao.UserMapper;
import com.mypol.myproject.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    public List<User> getUser(int age){
       return userMapper.getUser(age);

    }
}
