package com.thebestleticompany.russianwars.domain.soldiers;

import com.thebestleticompany.russianwars.domain.slaves.Slave;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by ManUnited on 19.07.2016.
 */
public interface SoldierRepository extends JpaRepository<Soldier, Long> {

    List<Soldier> findAllByMaxSoldiers (Long maxSoldiers);
}
