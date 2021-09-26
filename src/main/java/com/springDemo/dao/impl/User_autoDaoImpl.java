package com.springDemo.dao.impl;

import com.springDemo.dao.User_autoDao;
import com.springDemo.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author Cjl
 * @date 2021/7/6 17:20
 */
public class User_autoDaoImpl implements User_autoDao {

    SqlSessionFactory sqlSessionFactory;

    @Override
    public int insertUser(User user) {
        System.out.println("User_autoDaoImpl中的插入方法");
        return 0;
    }

    @Override
    public SqlSession getSqlSession() {



        return null;
    }


}
