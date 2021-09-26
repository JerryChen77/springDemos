package com.springDemo.entity;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Cjl
 * @date 2021/7/7 17:37
 */
public class EmpTest {

    @Test
    public void empTest(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean.xml");
        Emp emp = ioc.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
