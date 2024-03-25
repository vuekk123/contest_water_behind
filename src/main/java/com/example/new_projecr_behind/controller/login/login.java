package com.example.new_projecr_behind.controller.login;

import com.example.new_projecr_behind.entity.loginbaseobj.loginbaseinfo;
import com.example.new_projecr_behind.entity.loginbaseobj.loginobj;
import com.example.new_projecr_behind.entity.loginbaseobj.loginreturn;
import com.example.new_projecr_behind.service.PasswordValidUtil.PasswordValidUtil;
import com.example.new_projecr_behind.service.loginService.LoginController;
import com.example.new_projecr_behind.service.registService.registMainService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class login {
    @Autowired
    private LoginController LoginController;
    @Autowired
    private registMainService registMainService;

    @RequestMapping(value = "userPasswordLogin")
    @ResponseBody
    public loginreturn test(@RequestBody String string) {
        JSONObject json = JSONObject.fromObject(string);
        String username = json.get("username").toString();
        String password = json.get("password").toString();;
        String passwordRuleResult = PasswordValidUtil.PasswordVaildUtil(password);
        if (!passwordRuleResult.isEmpty()) {
            System.out.println("密码规则违反: " + passwordRuleResult);
            String[] kong = {" "};
            return new loginreturn(false, new loginobj(kong, "",
                    "", "", "",passwordRuleResult));
        } else {
            loginbaseinfo loginbaseinfo = LoginController.ValidPswConsecutive(username, password);
            loginobj loginobj;
            if(loginbaseinfo!=null){
                loginobj = new loginobj(loginbaseinfo.getRoles().split(","), loginbaseinfo.getUsername(),
                        "eyJhbGciOiJIUzUxMiJ9.admin", "eyJhbGciOiJIUzUxMiJ9.adminRefresh", "2023/10/30 00:00:00","");
            }else {
                loginobj = null;
            }
            return new loginreturn(loginbaseinfo==null?false:true, loginobj);
        }
    }

    @RequestMapping(value = "regist")
    @ResponseBody
    public Boolean regist(@RequestBody String string){
        JSONObject json = JSONObject.fromObject(string);
        String username = json.get("username").toString();
        String password = json.get("password").toString();
        String tele = json.get("tele").toString();
        System.out.println(username);
        System.out.println(password);
        System.out.println(tele);
        int registFlag = registMainService.registRuslt(username,password,tele);
        return registFlag != 0;
    };
 




}
