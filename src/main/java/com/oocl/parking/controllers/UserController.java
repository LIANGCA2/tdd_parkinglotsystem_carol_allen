package com.oocl.parking.controllers;


import com.oocl.parking.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public ResponseEntity addUser(@RequestBody User user){

        userService.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
