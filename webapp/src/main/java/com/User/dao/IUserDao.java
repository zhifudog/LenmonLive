package com.User.dao;
import com.User.entity.User;

public interface IUserDao {
        User SelectUser(String userId);
        void Register(User User);
}
