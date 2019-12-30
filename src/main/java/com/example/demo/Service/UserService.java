package com.example.demo.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User getUserInfo(String loginName){
        return userDao.get(loginName);
    }

    public User getUserMap(String loginName){
        return userDao.get(loginName);
    }
}
