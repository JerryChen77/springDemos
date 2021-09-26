package com.springDemo.entity;

import org.springframework.beans.factory.DisposableBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Cjl
 * @date 2021/7/6 17:51
 */
public class Stu implements DisposableBean {
    private Integer id;
    private String name;
    private String addr;
    private Integer age;

    public Stu() {
    }

    public Stu(Integer id, String name, String addr, Integer age) {
        this.id = id;
        this.name = name;
        this.addr = addr;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", age=" + age +
                '}';
    }

    public Stu(Integer id, String name, String addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化123");
    }
    @PreDestroy
    public void destory(){

        System.out.println("销毁321");
    }

    @Override
    public void destroy() throws Exception {

    }
}
