package com.springDemo.entity;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Cjl
 * @date 2021/7/6 17:04
 */
public class UserTest {
    @Test
    public void getUser(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean.xml");

        User user1 = ioc.getBean("user1", User.class);

        User user2 = ioc.getBean("user2", User.class);
        User user3 = ioc.getBean("user1",User.class);
        System.out.println("user1==="+user1);
        System.out.println("user2==="+user2);
        System.out.println(user1==user2);
        System.out.println(user1==user3);

    }


}
