package com.example.new_projecr_behind.service.tabinfoService;

import com.example.new_projecr_behind.entity.tabinfoEntity.tabinfoobj;
import com.example.new_projecr_behind.mapper.tabBasicInfo.tabinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class tabinfoBasicService {
    @Autowired
    private tabinfoMapper tabinfoMapper;
    public ArrayList<tabinfoobj> getAlltabinfo(){
       return tabinfoMapper.showtabinfolist();
    }
}
