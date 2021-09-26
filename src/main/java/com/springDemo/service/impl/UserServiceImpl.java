package com.springDemo.service.impl;

import com.springDemo.dao.User_autoDao;
import com.springDemo.entity.User;
import com.springDemo.service.UserService;

/**
 * @author Cjl
 * @date 2021/7/6 17:22
 */
public class UserServiceImpl implements UserService {
    private User_autoDao user_autoDao = null;

    public void setUser_autoDao(User_autoDao user_autoDao) {
        this.user_autoDao = user_autoDao;
    }

    @Override
    public int insertUser(User user) {
        System.out.println("UserServiceImpl中调用的插入方法");
        user_autoDao.insertUser(user);
        return 0;
    }
}
