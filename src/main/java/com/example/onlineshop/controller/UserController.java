package com.example.onlineshop.controller;

import com.example.onlineshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/registration")
    public String regist() {
        return "registration";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }
}
