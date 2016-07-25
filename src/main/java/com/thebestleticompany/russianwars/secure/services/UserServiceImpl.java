package com.thebestleticompany.russianwars.secure.services;

import com.thebestleticompany.russianwars.secure.entity.User;

/**
 * Created by ManUnited on 22.07.2016.
 */
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String login) {
        User user = new User();
        user.setLogin(login);
        user.setPassword("7110eda4d09e062aa5e4a390b0a572ac0d2c0220");

        return user;
    }
}
