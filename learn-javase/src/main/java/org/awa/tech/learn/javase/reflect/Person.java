package org.awa.tech.learn.javase.reflect;

/**
 * Created by lisa on 2017/8/9.
 */
public class Person {

    public String name;
    private String age;
    private String sex;

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    private String remark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
