package com.springDemo.entity;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.core.io.Resource;

import java.io.InputStream;

/**
 * @author Cjl
 * @date 2021/7/7 11:53
 */
public class SessionFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
