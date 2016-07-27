package com.thebestleticompany.russianwars.domain.kingdom;

import com.thebestleticompany.russianwars.domain.province.Province;
import com.thebestleticompany.russianwars.domain.soldiers.Soldier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by ManUnited on 15.07.2016.
 * княжество игрока
 */

@Entity
@Table(name = "kingdom")
public class Kingdom {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    @JoinColumn(name = "kingdom_id", foreignKey = @ForeignKey(name = "FK_provinces_kingdom"))
    private List<Province> provinces; // список провинций в княжестве игрока

    @OneToMany
    @JoinColumn(name = "kingdom_id", foreignKey = @ForeignKey(name = "FK_soldier_kingdom"))
    private List<Soldier> soldiers;  // кол-во солдат

    @Column(name = "count_golds", nullable = false)
    private long countGolds; // кол-во золота

    public List<Province> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<Province> provinces) {
        this.provinces = provinces;
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(List<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

    public long getCountGolds() {
        return countGolds;
    }

    public void setCountGolds(long countGolds) {
        this.countGolds = countGolds;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
