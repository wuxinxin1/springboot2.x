package com.example.module;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by Administrator on 2019/3/3/003.
 */
public class User {
    private String name;

    //不反回这个字段
    @JsonIgnore
    private int age;

    //修改字段名称
    @JsonProperty("account")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String phone;


    @JsonFormat(pattern = "yyyy:MM:dd HH:mm:ss")
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        //this.phone = phone;
    }

    public User(String name, int age, String phone, Date date) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.date = date;
    }
}
