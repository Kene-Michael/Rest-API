package com.example.demonew.controller;

import com.example.demonew.dto.UserDto;
import com.example.demonew.model.User;
import com.example.demonew.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("user")
    public UserDto createUser(@RequestBody User user) {
        return  userService.createUser(user);
    }

    @GetMapping("users")
    public List<UserDto> getUsers() {
        return  userService.getAllUser();
    }

}
