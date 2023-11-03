package com.example.new_projecr_behind.service.pictureService;

import com.example.new_projecr_behind.entity.pictureEntity.pictureEntity;
import com.example.new_projecr_behind.mapper.picturebaseMapper.picturebaseMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class pictureMainService {
    @Autowired
    private picturebaseMain picturebaseMain;

    public int putpicturebase(String base64Data,String userfor){
      return picturebaseMain.setpicture(base64Data,userfor);
    }
    public ArrayList<pictureEntity> getuserforpicture(String userfor){
        return picturebaseMain.searchpicforuse(userfor);
    }
    public int updatepicture(String base64Data,String userfor){
        return picturebaseMain.updatepicture(base64Data,userfor);
    }
}
