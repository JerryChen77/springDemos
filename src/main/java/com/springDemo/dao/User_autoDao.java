package com.springDemo.dao;

import com.springDemo.entity.User;
import org.apache.ibatis.session.SqlSession;

/**
 * @author Cjl
 * @date 2021/7/6 17:16
 */
public interface User_autoDao {

    int insertUser(User user);

    SqlSession getSqlSession();
}
