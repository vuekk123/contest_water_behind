package com.example.new_projecr_behind.service.routerService;

import com.example.new_projecr_behind.entity.mapperEntity.routerEntity;
import com.example.new_projecr_behind.entity.mapperEntity.routerEntitySon;
import com.example.new_projecr_behind.mapper.routerMapper.routerMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class routerMainService {
    @Autowired
    private routerMain routerMain;

    public ArrayList<routerEntity> getroutermaininfo(){
        String whereCondition = "where 1=1";
        ArrayList<routerEntity> routermain = routerMain.getrouterMaininfo(whereCondition);
        return routermain;
    };
    public ArrayList<routerEntitySon> getroutersoninfo(String fatherpath){
        ArrayList<routerEntitySon> routersoninfo = routerMain.getrouterinfoson(fatherpath);
        return routersoninfo;
    }
}
