package com.example.new_projecr_behind.controller.login;

import com.example.new_projecr_behind.entity.loginbaseobj.loginbaseinfo;
import com.example.new_projecr_behind.entity.loginbaseobj.loginobj;
import com.example.new_projecr_behind.entity.loginbaseobj.loginreturn;
import com.example.new_projecr_behind.entity.mapperEntity.routerEntity;
import com.example.new_projecr_behind.entity.mapperEntity.routerEntitySon;
import com.example.new_projecr_behind.entity.pictureEntity.pictureEntity;
import com.example.new_projecr_behind.entity.router.*;
import com.example.new_projecr_behind.service.loginService.loginMainService;
import com.example.new_projecr_behind.service.pictureService.pictureMainService;
import com.example.new_projecr_behind.service.registService.registMainService;
import com.example.new_projecr_behind.service.routerService.routerMainService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class login {
    @Autowired
    private loginMainService loginMainService;
    @Autowired
    private registMainService registMainService;



    @RequestMapping(value = "userPasswordLogin")
    @ResponseBody
    public loginreturn test(@RequestBody String string) {
        JSONObject json = JSONObject.fromObject(string);
        String username = json.get("username").toString();
        String password = json.get("password").toString();
        loginbaseinfo loginbaseinfo = loginMainService.checkaccount(username, password);
        loginobj loginobj = new loginobj(loginbaseinfo.getRoles().split(","), loginbaseinfo.getUsername(),
                "eyJhbGciOiJIUzUxMiJ9.admin", "eyJhbGciOiJIUzUxMiJ9.adminRefresh", "2023/10/30 00:00:00");
        return new loginreturn(true, loginobj);
    }

    @RequestMapping(value = "regist")
    @ResponseBody
    public Boolean regist(@RequestBody String string){
        JSONObject json = JSONObject.fromObject(string);
        String username = json.get("username").toString();
        String password = json.get("password").toString();
        int registFlag = registMainService.registRuslt(username,password);
        return registFlag != 0;
    };





}
