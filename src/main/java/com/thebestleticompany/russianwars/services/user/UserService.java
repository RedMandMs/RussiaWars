package com.thebestleticompany.russianwars.services.user;

import com.thebestleticompany.russianwars.domain.user.User;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Vilgodskiy Sergey on 25.07.2016.
 */
public interface UserService {

    Optional<User> findUserById(long id);

    User create(User user);

    User edit(User user);

    void delete(Long id);

    Optional<User> getUserByLogonName(String logonName);

    Collection<User> getAllUsers();
}
