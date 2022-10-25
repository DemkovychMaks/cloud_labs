package com.example.claud_lab.service;

import com.example.claud_lab.domain.User;
import com.example.claud_lab.repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserService extends AbstractService<User, Integer> {
    public UserRepository userRepository;

    @Override
    protected JpaRepository<User, Integer> getRepository() {
        return userRepository;
    }
}
