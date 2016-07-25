package com.thebestleticompany.russianwars.services.user;

import com.thebestleticompany.russianwars.domain.user.User;
import com.thebestleticompany.russianwars.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Vilgodskiy Sergey on 25.07.2016.
 * @since 0.2.20
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> findUserById(long id) {
        return Optional.ofNullable(userRepository.findOne(id));
    }

    @Override
    public User create(User user) {
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @Override
    public User edit(User user) {
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(id);
    }

    @Override
    public Optional<User> getUserByLogonName(String logonName) {
        return null;
    }

    @Override
    public Collection<User> getAllUsers() {
        return null;
    }
}
