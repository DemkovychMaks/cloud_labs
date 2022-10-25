package com.example.claud_lab.controller;

import com.example.claud_lab.DTO.UserDTO;
import com.example.claud_lab.domain.User;
import com.example.claud_lab.service.AbstractService;
import com.example.claud_lab.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.claud_lab.mapper.AbstractMapper;
import com.example.claud_lab.mapper.UserMapper;

@RequestMapping(value = "/user")
@RestController
@AllArgsConstructor
public class UserController extends AbstractController<User, UserDTO, Integer> {
    private final UserService userService;
    private final UserMapper userMapper;

    @Override
    public AbstractService<User, Integer> getService() {
        return userService;
    }

    @Override
    public AbstractMapper<User, UserDTO> getMapper() {
        return userMapper;
    }
}