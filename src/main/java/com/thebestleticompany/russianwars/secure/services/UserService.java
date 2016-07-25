package com.thebestleticompany.russianwars.secure.services;

import com.thebestleticompany.russianwars.secure.entity.User;

/**
 * Created by ManUnited on 22.07.2016.
 */
public interface UserService {
    User getUser(String login);
}
