package com.example.onlineshop.dto;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserDto {


    @NotBlank
    private String fullName;
    @Email
    private String email;
    private String password;

    public UserDto(String fullName, String email, String password) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    public UserDto() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
