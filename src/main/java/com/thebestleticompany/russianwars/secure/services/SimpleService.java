package com.thebestleticompany.russianwars.secure.services;

import com.thebestleticompany.russianwars.domain.province.Province;
import com.thebestleticompany.russianwars.domain.province.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ManUnited on 19.07.2016.
 */
@Service
public class SimpleService {

    @Autowired
    private ProvinceRepository provinceRepository;

    private void simpleMethod(){
        // SELECT * FROM province
        provinceRepository.findAll();

        Province province = new Province();
        province.setMaxGolds(70L);
        //INSERT TO province(max_gold) VALUES(70)
        province = provinceRepository.save(province);
        //Теперь province содержит id
        province.setMaxGolds(90L);
        //UPDATE
        provinceRepository.save(province);
        province.setId(null);
        //INSERT TO province(max_gold) VALUES(90)
        province = provinceRepository.save(province);
        // Новый Id => другая запись
        // DELETE
        provinceRepository.delete(province.getId());
        Province one = provinceRepository.findOne(1L);
        provinceRepository.findAllByMaxGolds(7000L);
    }
}
