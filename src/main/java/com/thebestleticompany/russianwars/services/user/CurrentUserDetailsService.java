package com.thebestleticompany.russianwars.services.user;

import com.thebestleticompany.russianwars.domain.user.CurrentUser;
import com.thebestleticompany.russianwars.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author Vilgodskiy Sergey on 25.07.2016.
 */
public class CurrentUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = userService.getUserByLogonName(login)
                .orElseThrow(() -> new UsernameNotFoundException(
                        "Пользователь с логином='" + login + "' не был найден"));
        return new CurrentUser(user);
    }
}
