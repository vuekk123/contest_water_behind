package com.example.new_projecr_behind.controller.routerinfo;

import com.example.new_projecr_behind.entity.mapperEntity.routerEntity;
import com.example.new_projecr_behind.entity.mapperEntity.routerEntitySon;
import com.example.new_projecr_behind.entity.router.*;
import com.example.new_projecr_behind.service.routerService.routerMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class router {
    @Autowired
    private routerMainService routerMainService;

    @RequestMapping(value = "getAsyncRoutes")
    @ResponseBody
    public routerreturn getAsyncRoutes() {
        ArrayList<routermain> routerArray = new ArrayList<>();
        ArrayList<routerEntity> rootRouter = routerMainService.getroutermaininfo();
        for (routerEntity item : rootRouter) {
            ArrayList<routerEntitySon> sonRouter = routerMainService.getroutersoninfo(item.getPath());
            mainMeta mainMeta = new mainMeta(item.getTitle(), item.getIcon(), item.getShowLink(), item.getRank());
            routermain routermain = new routermain();
            routermain.setPath(item.getPath());
            routermain.setName(item.getName());
            routermain.setRedirect(item.getRedirect());
            routermain.setMeta(mainMeta);
            ArrayList<routerson> sonsArray = new ArrayList<>();
            for (routerEntitySon sonitem : sonRouter) {
                if (item.getHaschildren() == 0) {
                    continue;
                }
                ArrayList<String> roles = getsplit(sonitem.getRoles());
                ArrayList<String> auths = getsplit(sonitem.getAuths());
                sonMeta sonMeta = new sonMeta(sonitem.getTitle(), sonitem.getIcon(), sonitem.getExtraIcon(),
                        sonitem.getShowLink(), sonitem.getShowParent(), roles,
                        auths, sonitem.getKeepAlive(), sonitem.getFrameSrc(),
                        sonitem.getFrameLoading(),
                        sonitem.getHiddenTag(),
                        sonitem.getDynamicLevel(), sonitem.getActivePath());
                routerson routerson = new routerson(sonitem.getPath(), sonitem.getName(), sonitem.getRedirect(),
                        sonMeta);
                sonsArray.add(routerson);
            }
            routermain.setChildren(sonsArray);
            routerArray.add(routermain);
        }
        return new routerreturn(true, routerArray);
    }

    public static ArrayList<String> getsplit(String roles) {
        ArrayList<String> rolesArray = new ArrayList<>();
        if (roles.contains(",")) {
            rolesArray.addAll(Arrays.asList(roles.split(",")));
        } else {
            rolesArray.add(roles);
        }
        return rolesArray;
    }
}
