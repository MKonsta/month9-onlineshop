package com.example.onlineshop.controller;

import com.example.onlineshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/reg")
    public String regist() {
        return "regist";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
