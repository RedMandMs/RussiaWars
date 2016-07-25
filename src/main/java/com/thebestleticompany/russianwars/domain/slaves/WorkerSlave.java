package com.thebestleticompany.russianwars.domain.slaves;

import javax.persistence.*;

/**
 * Created by ManUnited on 15.07.2016.
 * крестьянин
 */

@Entity
@Table(name = "worker_slave")
public class WorkerSlave implements Slave{

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "gold_per_day", nullable = false)
    private final long goldPerDay = 10; // кол-во золота, которое крестьянин собирает за день

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getGoldPerDay() {
        return goldPerDay;
    }
}
