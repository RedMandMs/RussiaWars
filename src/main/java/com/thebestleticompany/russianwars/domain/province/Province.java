package com.thebestleticompany.russianwars.domain.province;

import com.thebestleticompany.russianwars.domain.slaves.Slave;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ManUnited on 15.07.2016.
 * Губерния
 */
@Entity
@Table(name = "province")
public class Province {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    @JoinColumn(name = "province_id", foreignKey = @ForeignKey(name = "FK_slave_province"))
    private List<Slave> slaves = new ArrayList<>(); // кол-во крестьян на земле

    @Column(name = "max_golds", nullable = false)
    private Long maxGolds; // кол-во максимально возможного для сбора генерируемого золота на земле

    public Long getMaxGolds() {
        return maxGolds;
    }

    public void setMaxGolds(Long maxGolds) {
        this.maxGolds = maxGolds;
    }

    public List<Slave> getSlaves() {
        return slaves;
    }

    public void setSlaves(List<Slave> slaves) {
        this.slaves = slaves;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
