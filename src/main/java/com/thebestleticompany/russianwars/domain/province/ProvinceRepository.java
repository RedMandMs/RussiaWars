package com.thebestleticompany.russianwars.domain.province;

import com.thebestleticompany.russianwars.domain.slaves.Slave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by ManUnited on 19.07.2016.
 */
public interface ProvinceRepository extends JpaRepository<Province, Long>{

    List<Province> findAllByMaxGolds(Long maxGold);

    Province findOneByMaxGoldsAndSlaves(Long maxGold, List<Slave> slaves);

}
