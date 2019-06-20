package com.nju.miaosha.controller;

import com.nju.miaosha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public String getUser() {
        return userService.getUserById(1).toString();
    }
}
