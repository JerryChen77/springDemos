package com.springDemo.service;

import com.springDemo.entity.User;
import com.springDemo.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Cjl
 * @date 2021/7/6 17:39
 */
public class UserServiceTest {
    @Test
    public void getService(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean_auto.xml");
        UserService userService = ioc.getBean("userService", UserServiceImpl.class);
        User user = new User();

        userService.insertUser(user);


    }
}
