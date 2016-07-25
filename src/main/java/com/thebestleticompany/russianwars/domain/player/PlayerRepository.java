package com.thebestleticompany.russianwars.domain.player;

import com.thebestleticompany.russianwars.domain.province.Province;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ManUnited on 19.07.2016.
 */
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
