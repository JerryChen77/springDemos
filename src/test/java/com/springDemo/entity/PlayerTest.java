package com.springDemo.entity;

import com.springDemo.service.impl.PlayerServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Cjl
 * @date 2021/7/7 17:57
 */
public class PlayerTest {
    @Test
    public void player(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean_annotation.xml");
        PlayerServiceImpl playService = ioc.getBean("playService", PlayerServiceImpl.class);
        playService.findPlayerById(1);

    }
}
