package com.dhurka.dhurkabookmart.service;

import com.dhurka.dhurkabookmart.dao.UserDAO;
import com.dhurka.dhurkabookmart.model.User;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public void registerUser(User user) {
        userDAO.addUser(user);
    }
}
