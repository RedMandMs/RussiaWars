package com.thebestleticompany.russianwars.domain.fighter;

import com.thebestleticompany.russianwars.domain.province.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ManUnited on 19.07.2016.
 */
public interface FighterRepository extends JpaRepository<Fighter, Long> {
}
