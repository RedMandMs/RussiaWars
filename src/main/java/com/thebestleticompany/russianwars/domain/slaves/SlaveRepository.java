package com.thebestleticompany.russianwars.domain.slaves;

import com.thebestleticompany.russianwars.domain.province.Province;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by ManUnited on 19.07.2016.
 */
public interface SlaveRepository extends JpaRepository<Slave, Long> {

    List<Slave> findAllByMaxSlaves (Long maxSlaves);
}
