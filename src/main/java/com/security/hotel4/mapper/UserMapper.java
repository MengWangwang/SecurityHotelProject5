package com.security.hotel4.mapper;

import com.security.hotel4.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


@Component("UserMapper")
public interface UserMapper {

    public User getUserByNameAndPsw(@Param("userName") String userName, @Param("userPassword") String userPassword);
    public int addUser(User u);
}