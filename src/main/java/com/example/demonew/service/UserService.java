package com.example.demonew.service;

import com.example.demonew.dto.UserDto;
import com.example.demonew.model.User;

import java.util.List;

public interface UserService {

    UserDto createUser(User user);

    List<UserDto> getAllUser();
}
