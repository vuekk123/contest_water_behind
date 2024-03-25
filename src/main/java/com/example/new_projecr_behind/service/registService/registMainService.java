package com.example.new_projecr_behind.service.registService;

import com.example.new_projecr_behind.mapper.regist.registMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class registMainService {
    @Autowired
    private registMain registMain;
    public int registRuslt(String username,String password,String tele){
       return registMain.regsitAccount(username,password,tele,"common");
    }
}
