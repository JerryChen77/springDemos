package com.springDemo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
/**
 * @author Cjl
 * @date 2021/7/7 17:40
 */
@Component
@Scope("singleton")
public class Player {
    private Integer id;
    private String name;
    private Integer age;


    private List<String> skills;
    @PostConstruct
    public void start(){
        System.out.println("初始化");
    }

    @PreDestroy
    public void end(){
        System.out.println("销毁");
    }


    public Player() {
    }

    public Player(Integer id, String name, Integer age, List<String> skills) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.skills = skills;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", skills=" + skills +
                '}';
    }
}
