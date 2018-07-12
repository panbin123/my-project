package com.mypol.myproject.controller;

import com.mypol.myproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {
    @Autowired
    private UserService userService;
    @GetMapping("/index")
    public List index(){

        return userService.getUser(12);
    }

}
