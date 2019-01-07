package com.suxia.abandon.redis;

import java.io.Serializable;
import java.util.Date;
import java.util.Random;

public class User implements Serializable {

    private String name;
    private Integer age = new Random().nextInt(100);
    private Float money = new Random().nextFloat();
    private String birthday;

    public User(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
