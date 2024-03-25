package com.example.new_projecr_behind.mapper.loginMapper;

import com.example.new_projecr_behind.entity.loginbaseobj.loginbaseinfo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository

public interface loginMain {
    @Select("SELECT * FROM userinfo_login WHERE BINARY username = #{username} AND BINARY password = #{password}")
    loginbaseinfo GetAccountInfo(@Param("username") String username,
                                 @Param("password") String password);

}
