package com.example.new_projecr_behind.mapper.picturebaseMapper;

import com.example.new_projecr_behind.entity.loginbaseobj.loginbaseinfo;
import com.example.new_projecr_behind.entity.pictureEntity.pictureEntity;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface picturebaseMain {
    @Insert("insert into picturebase64 (pictureBase,userfor)" +
            "values (#{pictureBase},#{userfor})")
    int setpicture(@Param("pictureBase") String pictureBase,
                   @Param("userfor") String userfor);

    @Select("select * from picturebase64 ${whereCondition}")
    ArrayList<String> showallpicture(@Param("whereCondition") String whereCondition);

    @Select("select * from picturebase64 where userfor = #{userfor}")
    ArrayList<pictureEntity> searchpicforuse(@Param("userfor") String userfor);

    @Update("update picturebase64 set pictureBase = #{pictureBase} where userfor = #{userfor}")
    int updatepicture(@Param("pictureBase") String pictureBase,
                      @Param("userfor") String userfor);
}
