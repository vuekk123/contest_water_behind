package com.example.new_projecr_behind.mapper.tabBasicInfo;

import com.example.new_projecr_behind.entity.tabinfoEntity.tabinfoobj;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;


@Mapper
public interface tabinfoMapper {
    @Select("select * from tabbasicinfo ")
    ArrayList<tabinfoobj> showtabinfolist();
}
