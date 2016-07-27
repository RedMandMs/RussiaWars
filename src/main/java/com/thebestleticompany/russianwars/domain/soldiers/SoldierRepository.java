package com.thebestleticompany.russianwars.domain.soldiers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ManUnited on 19.07.2016.
 */
public interface SoldierRepository extends JpaRepository<Soldier, Long> {

}
