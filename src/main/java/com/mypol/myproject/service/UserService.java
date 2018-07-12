package com.mypol.myproject.service;

import com.mypol.myproject.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> getUser(int age);
}
