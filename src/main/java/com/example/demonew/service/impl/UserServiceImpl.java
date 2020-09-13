package com.example.demonew.service.impl;

import com.example.demonew.dto.UserDto;
import com.example.demonew.model.User;
import com.example.demonew.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    List<User>  users = new ArrayList<>();

    @Override
    public UserDto createUser(User user) {
        User newUser = new User(user.getId(), user.getName(),
                user.getAge(), user.getPassword());
        users.add(newUser);

        UserDto userDto = new UserDto();
        userDto.setId(newUser.getId());
        userDto.setName(newUser.getName());
        userDto.setAge(newUser.getAge());

        return userDto;
    }

    @Override
    public List<UserDto> getAllUser() {
        List<UserDto> response = new ArrayList<>();
        for (User user: users) {
            UserDto userDto = new UserDto();
            userDto.setId(user.getId());
            userDto.setAge(user.getAge());
            userDto.setName(user.getName());
            response.add(userDto);
        }

        return response;
    }
}
