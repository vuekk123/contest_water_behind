package com.example.new_projecr_behind.mapper.routerMapper;

import com.example.new_projecr_behind.entity.loginbaseobj.loginbaseinfo;
import com.example.new_projecr_behind.entity.mapperEntity.routerEntity;
import com.example.new_projecr_behind.entity.mapperEntity.routerEntitySon;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Mapper
@Repository
public interface routerMain {
    @Select("select * from routerinfomain ${whereCondition}")
    ArrayList<routerEntity> getrouterMaininfo(@Param("whereCondition") String whereCondition);

    @Select("select * from routerinfoson where father = #{fatherpath} ")
    ArrayList<routerEntitySon> getrouterinfoson(@Param("fatherpath") String fatherpath);
}
