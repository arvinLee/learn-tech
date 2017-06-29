package org.awa.tech.learn.design.pattern.model;

import java.io.Serializable;
import java.util.Date;

/**
 * DESCRIPTION
 * Created by wb-lyw190343 on 2017/6/29.
 */
public class Employee implements Serializable{

    private String name;

    private String sex;

    private Date birthDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
