package com.alun.service;

import com.alun.entity.User;
import com.alun.mapper.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    UserDao userDao;

    public User getUserById(String id) {
        return userDao.selectById(id);
    }
}
