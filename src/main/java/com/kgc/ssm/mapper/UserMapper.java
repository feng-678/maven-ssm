package com.kgc.ssm.mapper;

import com.kgc.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User findUser(@Param("name") String loginname, @Param("pwd") String password);
    List<User> findAll(User user);
    void deleteId(@Param("id") Long id);
}
