package com.thebestleticompany.russianwars.domain.user;

import org.springframework.security.core.authority.AuthorityUtils;

/**
 * @author Vilgodskiy Sergey on 25.07.2016.
 */
public class CurrentUser extends org.springframework.security.core.userdetails.User {

    private User user;

    public CurrentUser(User user) {

        super(user.getLogin(), user.getPasswordHash(), true, true, true,
                true,
                AuthorityUtils.createAuthorityList(
                        user.getRoles().stream().flatMap(role -> role.getPermissions().stream())
                                .map(permission -> permission.toString()).toArray(String[]::new)));
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
