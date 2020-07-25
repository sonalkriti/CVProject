package com.example.oAuth2Demo.repository.impl;

import com.example.oAuth2Demo.model.UserEntity;
import com.example.oAuth2Demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryImpl {
    @Autowired
    UserRepository user;

    public UserEntity findUserById(Long id) {
        return user.findById(id).get();
    }
}
