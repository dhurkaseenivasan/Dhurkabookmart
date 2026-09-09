package com.dhurka.dhurkabookmart.dao;

import com.dhurka.dhurkabookmart.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }

}
