package com.security.hotel4.service;


import com.security.hotel4.model.User;

public interface UserService {

    public User getUserByNameAndPsw(String userName, String userPassword);
    public int addUser(User u);
}
