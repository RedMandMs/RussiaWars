package com.thebestleticompany.russianwars.services.battle;

import com.thebestleticompany.russianwars.domain.battle.BattleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vilgo on 27.07.2016.
 */
@Service
public class BattleServiceImpl implements BattleService {

    @Autowired
    private BattleRepository battleRepository;

    @Override
    public void test() {
        battleRepository.getOne(4l);
    }
}
