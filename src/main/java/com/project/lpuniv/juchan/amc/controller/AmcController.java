package com.project.lpuniv.juchan.amc.controller;

import com.project.lpuniv.juchan.amc.service.AmcService;
import com.project.lpuniv.juchan.amfi.service.AmfiService;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class AmcController {

    @Autowired
    private AmcService amcService;

    @Autowired
    private AmfiService amfiService;


    @GetMapping("amc/amc_insert")
    public String amcInsert() {
        return "/juchan/amc/amc_insert";
    }

    @PostMapping("amc/amc_insert")
    public String amcInsertP(){

        return "redirect:/main";
    }
}
