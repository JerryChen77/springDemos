package com.springDemo.entity;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Cjl
 * @date 2021/7/6 17:55
 */
public class StuTest {
    @Test
    public void stuCreate(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean_constructor.xml");
        Stu student = ioc.getBean("student", Stu.class);
        System.out.println(student   );

        Stu student2 = ioc.getBean("student2", Stu.class);
        System.out.println(student2);

        ApplicationContext ioc2 = new ClassPathXmlApplicationContext("bean_p.xml");
        Stu student1 = ioc2.getBean("student", Stu.class);
        System.out.println(student1);


    }
    @Test
    public void createStu(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean_p.xml");
        Stu student = ioc.getBean("student", Stu.class);
        System.out.println(student);
        Stu student1 = ioc.getBean("student", Stu.class);


        System.out.println(student==student1);


    }
}
