package com.springDemo.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author Cjl
 * @date 2021/7/7 17:25
 */
@Component
@PropertySource("jdbc.properties")
public class Emp implements DisposableBean {

    private List job;
    private Set addr;
    private Properties code;




    private Map phone;
    @Value("张三")
    private String name;
    @Value("1")
    private Integer gender;


    public Emp() {
    }

    public void setJob(List job) {
        this.job = job;
    }

    public void setAddr(Set addr) {
        this.addr = addr;
    }

    public void setCode(Properties code) {
        this.code = code;
    }

    public void setPhone(Map phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "job=" + job +
                ", addr=" + addr +
                ", code=" + code +
                ", phone=" + phone +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public void destroy() throws Exception {

    }
}
