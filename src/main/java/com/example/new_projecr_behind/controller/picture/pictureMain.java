package com.example.new_projecr_behind.controller.picture;

import com.example.new_projecr_behind.entity.pictureEntity.pictureEntity;
import com.example.new_projecr_behind.service.pictureService.pictureMainService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class pictureMain {
    @Autowired
    private com.example.new_projecr_behind.service.pictureService.pictureMainService pictureMainService;

    @RequestMapping(value = "uploadPicture")
    @ResponseBody
    public Boolean decodeBase64(@RequestBody String base64Data) {
        boolean pictureFlag = false;
        JSONObject json = JSONObject.fromObject(base64Data);
        String picture = json.get("data").toString();
        String userfor = json.get("userfor").toString();
        ArrayList<pictureEntity> pictureEntity = pictureMainService.getuserforpicture(userfor);
//        System.out.println(pictureEntity.size());
        if (pictureEntity.size() == 0) {
            if (pictureMainService.putpicturebase(picture, userfor) != 0) {
                System.out.println("图片已插入");
                pictureFlag = true;
            }
        } else {
            if (pictureMainService.updatepicture(picture, userfor) != 0) {
                System.out.println("图片已更新");
                pictureFlag = true;
            }
        }
        return pictureFlag;
    }

    @RequestMapping(value = "CarouselFigure")
    @ResponseBody
    public ArrayList<pictureEntity> CarouselFigure()    {
        return pictureMainService.getuserforpicture("CarouselFigure");
    }

}
