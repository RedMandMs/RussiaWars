package com.thebestleticompany.russianwars.domain.land;


import com.thebestleticompany.russianwars.domain.province.Province;
import com.thebestleticompany.russianwars.domain.slaves.Slave;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ManUnited on 15.07.2016.
 * средиземье))
 */

@Entity
@Table(name = "land")
public class Land {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    @JoinColumn(name = "land_id", foreignKey = @ForeignKey(name = "FK_province_land"))
    private List<Province> provinces = new ArrayList<>(); // список всех провинций в игре

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Province> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<Province> provinces) {
        this.provinces = provinces;
    }
}
