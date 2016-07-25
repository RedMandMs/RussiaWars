package com.thebestleticompany.russianwars.domain.user;

import javax.persistence.*;

/**
 * Created by ManUnited on 15.07.2016.
 * Параметры для входа
 */

@Entity
@Table(name = "province")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
