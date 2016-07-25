package com.thebestleticompany.russianwars.domain.player;

import com.thebestleticompany.russianwars.domain.soldiers.Soldier;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ManUnited on 15.07.2016.
 * Статистика игрока
 */

@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name_player", nullable = false)
    private String namePlayer;

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
