package com.oocl.parking.entities;

import javax.persistence.Entity;

@Entity
public class User {

    private String username;
    private String email;
    private String phone;
    public User(String username) {
        this.username = username;
    }
}
