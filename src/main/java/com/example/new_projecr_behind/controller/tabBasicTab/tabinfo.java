package com.example.new_projecr_behind.controller.tabBasicTab;

import com.example.new_projecr_behind.entity.tabinfoEntity.tabinfoobj;
import com.example.new_projecr_behind.service.tabinfoService.tabinfoBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class tabinfo {
    @Autowired
    private tabinfoBasicService tabinfoBasicService;

    @RequestMapping(value = "gettabBasicinfo")
    @ResponseBody
    public ArrayList<tabinfoobj> getalltabinfo(){
        return tabinfoBasicService.getAlltabinfo();
    }

}
