package com.thebestleticompany.russianwars.domain.battle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ManUnited on 19.07.2016.
 */
public interface BattleRepository extends JpaRepository<Battle, Long> {

}
