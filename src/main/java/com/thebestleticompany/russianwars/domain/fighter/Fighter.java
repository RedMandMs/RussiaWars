package com.thebestleticompany.russianwars.domain.fighter;

import com.thebestleticompany.russianwars.domain.kingdom.Kingdom;
import com.thebestleticompany.russianwars.domain.soldiers.Soldier;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ManUnited on 15.07.2016.
 */

@Entity
@Table(name = "fighter")
public class Fighter {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "kingdom_id", foreignKey = @ForeignKey(name = "FK_fighter_kingdom"))
    private Kingdom kingdom; // княжество

    @ManyToMany
    @JoinTable(name = "fighter_solders")
    private List<Soldier> soldiers; // войско игрока

    public Kingdom getKingdom() {
        return kingdom;
    }

    public void setKingdom(Kingdom kingdom) {
        this.kingdom = kingdom;
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(List<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
