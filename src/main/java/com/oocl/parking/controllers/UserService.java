package com.oocl.parking.controllers;

import com.oocl.parking.entities.User;
import com.oocl.parking.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {


    UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
    }


    public User addUser(User user) {
        User saveUser = userRepository.save(user);
        saveUser.setPassword(String.valueOf((int)(Math.random()*1000000)));
        return saveUser;
    }


}
