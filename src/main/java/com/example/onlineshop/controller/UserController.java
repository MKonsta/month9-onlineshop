package com.example.onlineshop.controller;

import com.example.onlineshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "index";
    }
}
