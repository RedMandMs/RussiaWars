package com.thebestleticompany.russianwars.domain.battle;

import com.thebestleticompany.russianwars.domain.fighter.Fighter;

import javax.persistence.*;

/**
 * Created by ManUnited on 15.07.2016.
 */

@Entity
@Table(name = "battle")
public class Battle {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name = "attacker_id", foreignKey = @ForeignKey(name = "FK_battle_fighter_attacker"))
    private Fighter attacker; // нападающийся

    @OneToOne
    @JoinColumn(name = "defender_id", foreignKey = @ForeignKey(name = "FK_battle_fighter_defender"))
    private Fighter defender; // защищающийся

    public Fighter getAttacker() {
        return attacker;
    }

    public void setAttacker(Fighter attacker) {
        this.attacker = attacker;
    }

    public Fighter getDefender() {
        return defender;
    }

    public void setDefender(Fighter defender) {
        this.defender = defender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
