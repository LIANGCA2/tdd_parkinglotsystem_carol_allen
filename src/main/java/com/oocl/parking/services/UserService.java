package com.oocl.parking.services;

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
        user.setPassword(String.valueOf((int)(Math.random()*1000000)));
        User saveUser = userRepository.save(user);
        return saveUser;
    }


}
