package com.kgc.ssm.service.impl;

import com.kgc.ssm.mapper.UserMapper;
import com.kgc.ssm.pojo.User;
import com.kgc.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String loginname, String password) {

        return  userMapper.findUser(loginname,password);
    }

    @Override
    public List<User> findAll(User user) {
        return userMapper.findAll(user);
    }
}
