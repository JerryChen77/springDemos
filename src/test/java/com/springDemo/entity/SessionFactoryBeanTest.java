package com.springDemo.entity;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Cjl
 * @date 2021/7/7 17:14
 */
public class SessionFactoryBeanTest {
    @Test
    public void getSqlSession(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean_sqlSession.xml");
        SqlSession sqlSession = (SqlSession) ioc.getBean("sqlSession");
        System.out.println(sqlSession);

    }
}
