package com.suxia.abandon.service.impl;

import com.suxia.abandon.domain.User;
import com.suxia.abandon.mapper.UserMapper;
import com.suxia.abandon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User addUser(User user) {
        try {
            userMapper.addUser(user);
            return user;
        } catch (Exception e) {
            throw new RuntimeException("新增用户出错");
        }
    }
}
