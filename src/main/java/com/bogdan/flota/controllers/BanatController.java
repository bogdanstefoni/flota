package com.bogdan.flota.controllers;

import com.bogdan.flota.dao.BanatDao;
import com.bogdan.flota.entities.Banat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api")
public class BanatController {

    private BanatDao banatDao;
    private static final Logger logger = LoggerFactory.getLogger(BanatController.class);

    @Autowired
    public BanatController(BanatDao banatDao) {
        this.banatDao = banatDao;
    }

    @RequestMapping("/showReg")
    public String showRegistrationPage() {
        return "login/register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String create(@ModelAttribute Banat banat) {
//        banat.setDataPif(banat.getDataPif());
//        banat.setDepartamentul(banat.getDepartamentul());
//        banat.setDirectia(banat.getDirectia());
//        banat.setDataUrmatoareiItp(banat.getDataUrmatoareiItp());
//        banat.setFormatieDeLucru(banat.getFormatieDeLucru());
//        banat.setLocatieJudet(banat.getLocatieJudet());
//        banat.setLocatieOras(banat.getLocatieOras());
//        banat
        logger.info("Created " + banat);
        banatDao.create(banat);
        return "login/portal";
    }

    @RequestMapping("/showPortal")
    public String showPortal() {
        return "login/portal";
    }


}
