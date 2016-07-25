package com.thebestleticompany.russianwars.domain.user;

import com.thebestleticompany.russianwars.domain.player.Player;

import javax.persistence.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ManUnited on 15.07.2016.
 * Параметры для входа
 */

@Entity
@Table(name = "user_")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String passwordHash;

    @OneToOne
    private Player player;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String password) {
        this.passwordHash = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // ультра костыль с админом
    public Set<Role> getRoles() {
        if (player == null) {
            return Collections.singleton(Role.ADMIN);
        }
        return new HashSet<>();
    }
}
