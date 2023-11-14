package com.project.lpuniv.juchan.amc.service;

import com.project.lpuniv.juchan.amc.dao.AmcDao;
import com.project.lpuniv.juchan.amc.dto.AmcDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmcService {

    @Autowired
    private AmcDao amcDao;

    public void amcInsert(AmcDto amcDto){
        amcDao.amcInsert(amcDto);
    }
}
