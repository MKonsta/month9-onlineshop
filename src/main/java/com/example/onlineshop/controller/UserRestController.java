package com.example.onlineshop.controller;

import com.example.onlineshop.dto.UserDto;
import com.example.onlineshop.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindException;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserRestController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping(path = "/allUsers")
    public List<UserDto> getUsers() {
        return userService.findAllUsers();
    }

    @PostMapping(path = "/registration" /*consumes = MediaType.APPLICATION_JSON_VALUE*/)
    public UserDto addUser(/*@Valid @RequestBody */UserDto userDto ) {
            return userService.addUser(userDto);
    }


    @ExceptionHandler(BindException.class)
    private ResponseEntity<?> handleBind(BindException ex) {

        List<Object> list = ex.getFieldErrors().stream()
                .map(fieldError -> String.format("%s -> %s", fieldError.getField(), fieldError.getDefaultMessage()))
                .collect(Collectors.toList());

        return ResponseEntity.unprocessableEntity().body(list);
    }

}
