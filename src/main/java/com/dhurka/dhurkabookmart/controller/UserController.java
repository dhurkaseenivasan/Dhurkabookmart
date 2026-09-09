package com.dhurka.dhurkabookmart.controller;

import com.dhurka.dhurkabookmart.model.User;
import com.dhurka.dhurkabookmart.service.UserService;

public class UserController {

    private UserService userService = new UserService();

    public void registerUser(int id, String name, String email, String password) {

        User user = new User(id, name, email, password);

        userService.registerUser(user);

        System.out.println("User Registered Successfully!");
    }
}
