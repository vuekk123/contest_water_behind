package com.example.new_projecr_behind.service.loginService;

import com.example.new_projecr_behind.entity.loginbaseobj.loginbaseinfo;
import com.example.new_projecr_behind.mapper.loginMapper.loginMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginMainService {
    @Autowired
    private loginMain loginMain;

    public loginbaseinfo checkaccount(String username, String password) {
        loginbaseinfo loginbaseinfo = loginMain.GetAccountInfo(username, password);
        return loginbaseinfo;
    }
}
