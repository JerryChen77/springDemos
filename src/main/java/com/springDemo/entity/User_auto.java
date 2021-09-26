package com.springDemo.entity;

/**
 * @author Cjl
 * @date 2021/7/6 11:56
 */
public class User_auto {
    private Integer id;
    private String name;
    private String addr;
    private Integer age;

    public User_auto() {
    }

//    public User(Integer id, String name, String addr, Integer age) {
//        this.id = id;
//        this.name = name;
//        this.addr = addr;
//        this.age = age;
//    }

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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", age=" + age +
                '}';
    }
}
