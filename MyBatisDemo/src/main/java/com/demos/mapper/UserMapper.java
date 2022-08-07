package com.demos.mapper;

import com.demos.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    //添加用户信息
    int insertUser();

    //根据ID查询
    User searchByid( int id);
}
