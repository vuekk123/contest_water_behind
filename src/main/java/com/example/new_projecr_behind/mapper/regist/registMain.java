package com.example.new_projecr_behind.mapper.regist;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface registMain {

    @Insert("insert into userinfo_login (username, password, roles)" +
            "values (#{username}, #{password}, #{roles})")
    int regsitAccount(@Param("username") String username,
                           @Param("password") String password,
                           @Param("roles") String roles);
}
