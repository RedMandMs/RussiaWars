package com.thebestleticompany.russianwars.domain.soldiers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ManUnited on 15.07.2016. пехотинец
 */

@Entity
@Table(name = "soldier")
public class Soldier {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "cost_per_day", nullable = false)
    private int costPerDay; // стоимость содержания в день

    @Column(name = "power", nullable = false)
    private int power; // сила воина

    public int getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(int costPerDay) {
        this.costPerDay = costPerDay;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
