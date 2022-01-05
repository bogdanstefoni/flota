package com.bogdan.flota.dao;

import com.bogdan.flota.entities.Banat;
import com.bogdan.flota.repos.BanatRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BanatDao {

    private BanatRepository banatRepository;
    private final Logger logger = LoggerFactory.getLogger(BanatDao.class);

    @Autowired
    public BanatDao(BanatRepository banatRepository) {
        this.banatRepository = banatRepository;
    }

    public Banat create(Banat banat){
        logger.info("Entity was created");

        return banatRepository.save(banat);
    }
}
