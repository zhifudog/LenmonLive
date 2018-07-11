package com.User.service.Impl;

import com.User.dao.IUserDao;
import com.User.entity.User;
import com.User.service.IUserService;

import javax.annotation.Resource;

public class UserServiceImpl implements IUserService{
    @Resource
    private IUserDao userDao;

    @Override
    public boolean Register(User user) {
        userDao.Register(user);
        return true;
    }

    @Override
    public boolean Login(User user) {
        User userData = userDao.SelectUser(user.getId());
        if(userData.getPassWd().equals(user.getPassWd())) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public User SelectUser() {
        User user = new User();
        user.setUserName("zenghl");
        user.setEmail("343019037@qq.com");
        user.setPhoneNumber("13527559233");
        user.setId("1");
        return user;
    }
}
