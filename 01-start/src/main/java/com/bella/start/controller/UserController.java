package com.bella.start.controller;

import com.bella.start.bean.User;
import com.bella.start.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/test")
    public  String test(){
        return "test";
    }

    @GetMapping("/getUserById")
    public User getUserById(){
       return userService.getById(1);
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers(){
       return userService.list();
    }

}
