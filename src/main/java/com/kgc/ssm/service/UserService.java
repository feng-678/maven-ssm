package com.kgc.ssm.service;

import com.kgc.ssm.pojo.User;

import java.util.List;

public interface UserService {
    User login(String loginname, String password ) ;
    List<User> findAll(User user);
}
