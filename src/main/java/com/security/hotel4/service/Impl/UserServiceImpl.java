package com.security.hotel4.service.Impl;


import com.security.hotel4.mapper.UserMapper;
import com.security.hotel4.model.User;
import com.security.hotel4.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource(name="UserMapper")
    private UserMapper userMapper;

    @Override
    public User getUserByNameAndPsw(String userName, String userPassword) {
        return userMapper.getUserByNameAndPsw(userName,userPassword);
    }

    @Override
    public int addUser(User u) {
        return userMapper.addUser(u);
    }
}
