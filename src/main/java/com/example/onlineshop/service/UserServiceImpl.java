package com.example.onlineshop.service;

import com.example.onlineshop.SecurityConfig;
import com.example.onlineshop.dto.UserDto;
import com.example.onlineshop.model.User;
import com.example.onlineshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl {

    private final UserRepository userRepository;
    private SecurityConfig securityConfig;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto getUserByEmail(String email) {
        User user = userRepository.findUserByEmail(email);
        return userToDto(user);
    }

    public List<UserDto> findAllUsers() {
        return userListToDto(userRepository.findAll());
    }

    public UserDto addUser(UserDto userDto) {
        User user = dtoToUser(userDto);
        userRepository.save(user);
        return userDto;
    }

    private UserDto userToDto(User user) {
        UserDto userDto = new UserDto(user.getFullName(), user.getEmail(), user.getPassword());
        return userDto;
    }

    private User dtoToUser(UserDto userDto) {
        User user = new User();
        user.setFullName(userDto.getFullName());
        user.setEmail(userDto.getEmail());
        user.setPassword(new SecurityConfig().encoder().encode(userDto.getPassword()));
        return user;
    }

    private List<UserDto> userListToDto(List<User> users) {
        List<UserDto> result = new ArrayList<>();
        for (User user : users) {
            result.add(userToDto(user));
        }

        return result;
    }
}
